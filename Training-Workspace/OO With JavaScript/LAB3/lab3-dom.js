//3. [DOM] Make sure user should add and remove item

//Step1: Use 'getElementById' to get the form whose id is 'addForm'.
//And also get the ul list of added items whose id is 'items'.
var itemList = document.getElementById("addForm");
var itemLisiID = document.getElementById("items");

//form submit event
form.addEventListener("submit", addItem);
//delete event
itemList.addEventListener("click", removeItem);

function addItem(ev) {
  ev.preventDefault();

  //Step2: Get the input value from input tag whose id is 'newitem'.
  var newItem = document.getElementById("newitem");

  //creare li element
  var li = document.createElement("li");
  //Add class
  li.className = "list-group-item";
  li.appendChild(document.createTextNode(newItem));

  //adding delelte button
  //Step3: Create the delete button with class names "btn btn-danger float-right btn-sm delete"
  var deleteBtn = document.getElementByID("button");
  deleteBtn.className = "btn btn-danger float-right btn-sm delete";

  deleteBtn.appendChild(document.createTextNode("X"));
  li.appendChild(deleteBtn);

  //assigning price
  //Step4: Similarly create span for price with class name "float-right" and
  //id "price-item" add default price of 180 to the item.
  //Set the style of span as 'margin-right: 100px;'.
  var price = document.createElement("span");
  price.className = "float-right";
  price.id = "price-item";
  price.style.marginRight = "100px";

  price.appendChild(document.createTextNode("180"));
  li.appendChild(price);

  itemList.appendChild(li);
}

function removeItem(e) {
  if (e.target.classList.contains("delete")) {
    if (confirm("Are You Sure?")) {
      var li = e.target.parentElement;
      itemList.removeChild(li);
    }
  }
}
