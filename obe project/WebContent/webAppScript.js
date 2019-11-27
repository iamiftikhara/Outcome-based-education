var nodes = document.querySelectorAll(".info");
var counter = 0;
function init() {
  for (var x = 0; x < nodes.length; x++) {
    nodes[x].style.display = "none";
  }
  nodes[0].style.display = "block";
}
var counter = 0;
function pre() {
  counter -= 2;
  for (var x = 0; x < nodes.length; x++) {
    nodes[x].style.display = "none";
  }
  next();
}
function next() {
  counter++;
  var heading = document.querySelector(".heading_secondary");

  if (counter == 0) {
    heading.innerHTML = "Basic Information";
  } else if (counter == 1) {
    heading.innerHTML = "Quiz Information";
  }

  for (var x = 0; x < counter; x++) {
    nodes[x].style.display = "none";
  }
  nodes[counter].style.display = "block";
}
init();
