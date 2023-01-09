var articles = document.querySelector(".articles");
var books = document.querySelector(".books");
var collections = document.querySelector(".collections");
var close = document.querySelectorAll(".close");
var navItemsArticles = document.querySelector(".nav-items-articles");
var navItemsBooks = document.querySelector(".nav-items-books");
var navItemsCollections = document.querySelector(".nav-items-collections");
var mainContainer = document.querySelector(".main-container");
var angleIconArticle = document.querySelector("#angle-icon-article");
var angleIconBook = document.querySelector("#angle-icon-book");
var angleIconCollection = document.querySelector("#angle-icon-collection");

articles.addEventListener("click", function (e) {
  e.preventDefault();
  if (
    navItemsArticles.style.display === "none" ||
    navItemsBooks.style.display === "block" ||
    navItemsCollections.style.display === "block"
  ) {
    navItemsArticles.style.display = "block";
    mainContainer.style.backgroundColor = "gray";
    mainContainer.style.overflow = "hidden";
    angleIconArticle.style.transform = "rotate(180deg)";
    angleIconArticle.style.transition = ".5s";
    navItemsBooks.style.display = "none";
    angleIconBook.style.transform = "rotate(-0deg)";
    navItemsCollections.style.display = "none";
    angleIconCollection.style.transform = "rotate(-0deg)";
  } else {
    navItemsArticles.style.display = "none";
    mainContainer.style.backgroundColor = "white";
    angleIconArticle.style.transform = "rotate(-0deg)";
  }
});

books.addEventListener("click", function (e) {
  e.preventDefault();
  if (
    navItemsArticles.style.display === "block" ||
    navItemsBooks.style.display === "none" ||
    navItemsCollections.style.display === "block"
  ) {
    navItemsBooks.style.display = "block";
    mainContainer.style.backgroundColor = "gray";
    mainContainer.style.overflow = "hidden";
    angleIconBook.style.transform = "rotate(180deg)";
    angleIconBook.style.transition = ".5s";
    navItemsArticles.style.display = "none";
    angleIconArticle.style.transform = "rotate(-0deg)";
    navItemsCollections.style.display = "none";
    angleIconCollection.style.transform = "rotate(-0deg)";
  } else {
    navItemsBooks.style.display = "none";
    mainContainer.style.backgroundColor = "white";
    angleIconBook.style.transform = "rotate(-0deg)";
  }
});

collections.addEventListener("click", function (e) {
  e.preventDefault();
  if (
    navItemsArticles.style.display === "block" ||
    navItemsBooks.style.display === "block" ||
    navItemsCollections.style.display === "none"
  ) {
    navItemsCollections.style.display = "block";
    mainContainer.style.backgroundColor = "gray";
    mainContainer.style.overflow = "hidden";
    angleIconCollection.style.transform = "rotate(180deg)";
    angleIconCollection.style.transition = ".5s";
    navItemsArticles.style.display = "none";
    angleIconArticle.style.transform = "rotate(-0deg)";
    navItemsBooks.style.display = "none";
    angleIconBook.style.transform = "rotate(-0deg)";
  } else {
    navItemsCollections.style.display = "none";
    mainContainer.style.backgroundColor = "white";
    angleIconCollection.style.transform = "rotate(-0deg)";
  }
});

close[0].addEventListener("click", function () {
  navItemsArticles.style.display = "none";
  mainContainer.style.backgroundColor = "white";
  angleIconArticle.style.transform = "rotate(-0deg)";
});

close[1].addEventListener("click", function () {
  navItemsBooks.style.display = "none";
  mainContainer.style.backgroundColor = "white";
  angleIconBook.style.transform = "rotate(-0deg)";
});

close[2].addEventListener("click", function () {
  navItemsCollections.style.display = "none";
  mainContainer.style.backgroundColor = "white";
  angleIconCollection.style.transform = "rotate(-0deg)";
});

let cardOne = document.querySelector(".card-one");
let dropOne = document.querySelector(".drop-one");
dropOne.style.display = "block";
cardOne.style.cursor = "pointer"
cardOne.addEventListener("click", function () {
  if (dropOne.style.display === "block") {
    dropOne.style.opacity = 0;
    dropOne.style.transform = "scale(0)";
    window.setTimeout(function () {
      dropOne.style.display = "none";
    }, 500);
  } else {
    dropOne.style.display = "block";
    window.setTimeout(function () {
      dropOne.style.opacity = 1;
      dropOne.style.transform = "scale(1)";
    }, 500);
  }
});

let cardTwo = document.querySelector(".card-two");
let dropTwo = document.querySelector(".drop-two");
dropTwo.style.display = "none";
cardTwo.style.cursor = "pointer"
cardTwo.addEventListener("click", function () {
  if (dropTwo.style.display === "block") {
    // dropTwo.style.display = "none";
    dropTwo.style.opacity = 0;
    dropTwo.style.transform = "scale(0)";
    window.setTimeout(function () {
      dropTwo.style.display = "none";
    }, 500);
  } else {
    dropTwo.style.display = "block";
    window.setTimeout(function () {
      dropTwo.style.opacity = 1;
      dropTwo.style.transform = "scale(1)";
    }, 500);
  }
});

// var angleIcon = document.querySelectorAll("#angle-icon");
// angleIcon.forEach(function (i) {
//   i.onclick = function () {
//     i.style.transform = "rotate(180deg)";
//   };
//   i.onclick = function () {
//     i.style.transform = "rotate(-180deg)";
//   };
// });

// window.addEventListener("click", function (e) {
//   if (e.target === navItemsArticles) navItemsArticles.style.display = "none";
// });

// var angleIcon = document.querySelectorAll("#angle-icon");
// var lists = document.querySelectorAll("#lists");
// lists.forEach(function (angleIcon) {
//   lists.onclick = function () {
//     angleIcon.style.transform = "rotate(180deg)";
//   };
// });
// console.log(lists);
// console.log(angleIcon);
