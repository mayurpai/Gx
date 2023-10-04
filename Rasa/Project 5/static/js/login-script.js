let loginBtn = document.getElementById("loginBtn");
let username = document.getElementById("username");
let password = document.getElementById("password");
let localURL = "http://localhost:5500/Rasa/Project%205/index.html";
loginBtn.addEventListener("click", submitLogInInformation);
function submitLogInInformation(event) {
  event.preventDefault();
  localStorage.setItem("username", username.value);
  localStorage.setItem("password", password.value);
  console.log(event);
  window.location.href = localURL;
}
