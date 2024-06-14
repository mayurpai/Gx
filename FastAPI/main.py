from typing import Optional

from inventory import inventory, inventory_, inventory_item
from pydantic import BaseModel

from fastapi import FastAPI, Path, Query, status, HTTPException
from fastapi.responses import JSONResponse

app = FastAPI()
# uvicorn main:app --reload
# fastapi run main.py


class InventoryItem(BaseModel):
    name: str
    desc: str
    price: float
    brand: Optional[str] = None


class UpdateInventoryItem(BaseModel):
    name: Optional[str] = None
    desc: Optional[str] = None
    price: Optional[float] = None
    brand: Optional[str] = None


@app.get("/")
def home():
    return {
        "Data": "Home"
    }


@app.get("/about")
def about():
    return {
        "Data": "About"
    }


@app.get("/get-item/{item_id}")
def get_inventory_by_item_id(item_id: int):
    return {
        "Data": inventory[item_id]
    }


@app.get("/get-item")
def get_inventory_item_by_item_id(item_id: int):
    if item_id not in inventory_item:
        raise HTTPException(status_code=404, detail=f"Item With Item ID: {item_id}, Does Not Exist In Inventory!")
    return {
        "Data": inventory_item[item_id]
    }


@app.get("/get-item/{item_id}/{name}")
def get_inventory_by_item_id_and_name(item_id: int, name: str = None):
    return {
        "Data": inventory[item_id][name]
    }


# Path Parameters Takes 2 Arguments - One Being Default Value (...)
# If No id Is Passed And Second Being A Description
# Alongside, It Also Takes lt, gt, le, ge For int/float Values

@app.get("/get-item-path/{item_id}")
def get_inventory_by_id_(item_id: int = Path(..., description="The id of the inventory", gt=0, le=1)):
    return {
        "Data": inventory[item_id]
    }


# Query Params
@app.get("/get-by-type")
def get_item_by_type(type: Optional[str] = None):
    for item in inventory_:
        if inventory_[item]["name"]["type"] == type:
            return {
                "Data": inventory_[item]["name"]
            }
    return {
        "Data": "Inventory Not Available!"
    }


@app.get("/get-by-type")
def get_item_by_type_(type: str = Query(title="Type", description="Item type")):
    for item in inventory_:
        if inventory_[item]["name"]["type"] == type:
            return {
                "Data": inventory_[item]["name"]
            }
    return {
        "Data": "Inventory Not Available!"
    }


class ItemAlreadyExistsException(Exception):
    pass


class ItemDoesNotExistException(Exception):
    pass


@app.exception_handler(ItemAlreadyExistsException)
async def item_already_exists_exception_handler(request, exc):
    return JSONResponse(
        status_code=status.HTTP_409_CONFLICT,
        content={"Error": str(exc)},
    )


@app.exception_handler(ItemDoesNotExistException)
async def item_does_not_exist_exception_handler(request, exc):
    return JSONResponse(
        status_code=status.HTTP_404_NOT_FOUND,
        content={"Error": str(exc)},
    )


@app.post("/create-inventory-item", status_code=status.HTTP_201_CREATED)
async def create_inventory_item(item: InventoryItem, item_id: int = Query(title="Inventory Item Id", description="Item Id Of Inventory Item")):
    if item_id in inventory_item:
        raise ItemAlreadyExistsException("Item ID Already Exists!")
    inventory_item[item_id] = item
    return inventory_item


@app.put("/update-inventory-item", status_code=status.HTTP_200_OK)
async def update_inventory_item(item: UpdateInventoryItem, item_id: int = Query(title="Item ID", description="Item ID Of Inventory Item")):
    if item_id not in inventory_item:
        raise ItemDoesNotExistException(
            f"Item With Item ID: {item_id}, Does Not Exist In Inventory!")
    inventory_item[item_id]['name'] = item.name
    inventory_item[item_id]['desc'] = item.desc
    inventory_item[item_id]['price'] = item.price
    inventory_item[item_id]['brand'] = item.brand

    return inventory_item[item_id]


@app.delete("/delete-inventory-item", status_code=status.HTTP_200_OK)
async def delete_inventory_item(item: InventoryItem, item_id: int = Query(title="Item ID", description="Item ID Of Inventory Item")):
    if item_id not in inventory_item:
        raise ItemDoesNotExistException(
            f"Item With Item ID: {item_id}, Does Not Exist In Inventory!")

    del inventory_item[item_id]

    return {f"Item With Item ID: {item_id}, Successfully Deleted!"}
