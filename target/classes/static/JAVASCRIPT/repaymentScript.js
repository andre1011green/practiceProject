/*
   Filename: repaymentScript.js
   Author:   Andre Long
   Date:     2/20/2024
   Description: The purpose of this Javascript file is to display all tickets
   for a single employee
*/

window.onload = start();

function start()
{
	ether();
}

function ether()
{
   alert("This is the ether function");

   const welcomeDiv = document.getElementById('welcome');
   const reimbursementDiv = document.getElementById('MyReimbursements');


    fetch('http://localhost:8080/loggInUser')
      .then(response => response.text())
      .then(text => {
          welcomeDiv.innerHTML = "<h2 id='welcomeMessage'>Welcome Big Blue " + text + "</h2>";
      });





}







