from json import load
from pprint import PrettyPrinter

from bson.objectid import ObjectId
from pymongo import MongoClient

connection_string = "mongodb://localhost:27017/"
client = MongoClient(connection_string)

dbs = client.list_database_names()
gx_db = client.Gx


with open("data.json", "r") as f:
    data = load(f)

collections = gx_db.list_collection_names()

print(dbs, collections)

test_db = client.test_db
test_collection = "test_collection"
person_collection = "person_collection"


def insert_test_document(db, collection, record):
    inserted = db[collection].insert_many(record).inserted_ids
    print(inserted)


def create_test_document(db, collection):
    first_names = ["A", "B", "C", "D", "E", "F"]
    last_names = ["A", "B", "C", "D", "E", "F"]
    ages = [1, 2, 3, 4, 5, 6]

    docs = []

    for first_names, last_names, ages in zip(first_names, last_names, ages):
        doc = {"name": first_names + " " + last_names, "age": ages}
        # print(db[collection].insert_one(doc).inserted_id)
        docs.append(doc)

    print(db[collection].insert_many(docs).inserted_ids)


insert_test_document(db=test_db, collection=test_collection, record=data)
create_test_document(db=test_db, collection=person_collection)


printer = PrettyPrinter()


def find_all_document(db, collection):

    cursor = db[collection].find()
    for doc in cursor:
        printer.pprint(doc)


find_all_document(db=test_db, collection=person_collection)


def find_particular_document(db, collection, query={}):
    cursor = db[collection].find(query)

    for doc in cursor:
        printer.pprint(doc)


find_particular_document(
    db=test_db, collection=person_collection, query={"name": "A A"})
find_particular_document(db=test_db, collection=person_collection)


def count_all_people(db, collection, filter={}):
    count = db[collection].count_documents(filter=filter)
    print(count)


count_all_people(db=test_db, collection=person_collection)
count_all_people(db=test_db, collection=person_collection,
                 filter={"name": "A A"})


def get_person_by_id(db, collection, person_id):

    _id = ObjectId(person_id)
    person = db[collection].find_one({"_id": _id})
    print(person)


get_person_by_id(db=test_db, collection=person_collection,
                 person_id="660a851bf649dff55b56f58e")


def get_age_range(db, collection, min_age, max_age):

    cursor = db[collection].find({"age": {"$gte": min_age, "$lte": max_age}})
    for doc in cursor:
        printer.pprint(doc)


get_age_range(db=test_db, collection=person_collection, min_age=2, max_age=4)


def project_columns(db, collection):
    columns = {"_id": 0, "name": 1, "age": 1}
    # people = db[collection].find({}, columns)
    people = db[collection].find({}, {"_id": False})
    for person in people:
        printer.pprint(person)


project_columns(db=test_db, collection=person_collection)


def update_person_by_id(db, collection, person_id):

    _id = ObjectId(person_id)

    all_updates = {
        "$set": {"salary": 1},
        "$inc": {"age": 1},
        # "$rename": {"name": "Name", "age": "Age"}
    }

    db[collection].update_one({"_id": _id}, all_updates)


update_person_by_id(db=test_db, collection=person_collection,
                    person_id="660a851bf649dff55b56f58c")


def replace_person_by_id(db, collection, person_id):

    _id = ObjectId(person_id)

    replace_all = {
        "first_name": "First Name",
        "last_name": "Last Name",
        "age": 24,
        "salary": 10000
    }

    db[collection].replace_one({"_id": _id}, replace_all)


replace_person_by_id(db=test_db, collection=person_collection,
                     person_id="660a851bf649dff55b56f58a")


def delete_person_by_id(db, collection, person_id):

    _ids = [ObjectId(id) for id in person_id]

    db[collection].delete_many({"_id": {"$in": _ids}})


delete_person_by_id(db=test_db, collection=person_collection,
                    person_id=["660a851bf649dff55b56f58e", "660a851bf649dff55b56f58b"])


def add_address_embed(db, collection, person_id, address):

    _id = ObjectId(person_id)

    db[collection].update_one({"_id": _id}, {"$set": {"address": address}})


add_address_embed(db=test_db, collection=person_collection, person_id="660a851bf649dff55b56f58c",
                  address="123 Main St, San Francisco, CA 94107")


def add_address_relationship(db, collection, person_id, address):

    _id = ObjectId(person_id)
    address = address.copy()

    address["owner_id"] = person_id

    address_collection = "address_collection"
    db[address_collection].insert_one(address)
    db[collection].update_one({"_id": _id}, {"$set": {"address": address}})


add_address_relationship(db=test_db, collection=person_collection, person_id="660a99e9d125dd8c01c3e987",
                         address={
                             "_id": "660a851bf649dff55b56f58z",
                             "number": "123 Main St",
                             "location": "San Francisco, CA 94107"
                         })
