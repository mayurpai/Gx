//4. [DOM] Use query selector to change to the background of odd place items as lightgray

//Step1: Get all the odd place items in variable 'oddItems' in Added Items using querySelector.
//Note the li class name of items is 'list-group-item'
var oddItems = document.querySelectorAll("li");

//Step2: Iterate through above list and set the background color as 'lightgray'.
for (var i = 0; i < oddItems.length; i++) {
  if (i % 2 == 0) {
    oddItems[i].style.backgroundColor = "lightgray";
  }
}
