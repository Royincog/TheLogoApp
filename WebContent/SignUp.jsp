<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap" rel="stylesheet"> 
<link rel="stylesheet" href="css/style.css">


<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>



<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  class="text-center">
<form class = "container form-signin" >
<img class="mb-4" src="https://cdn.logo.com/hotlink-ok/logo-social.png"  width="100%" height="100%">
<div>
<h1 class = "animate__animated animate__swing">Welcome To Logo</h1>
</div>
<br>
<div class = "form-group">
<label>
  <input type="text" id="ajaxTextbox" class="form-control sr-only" placeholder="username" required />
</label>
</div>
<br>
<div class = "form-group">
<label>
  <input type="password" id="ajaxPassword" class="form-control sr-only" placeholder="password" required />
</label>
</div>

<br>
<a type="button" class="btn btn-dark"  id="ajaxButton">Sign Up</a>
<br>
<br>
 <a href= "SignIn" style="text-decoration:none" >Log in if already a user</a>
<br>
<br>

<p style = "color:red" id = "error"></p>
</form>

</body>
<script>
document.getElementById("ajaxButton").onclick = function() {
	 
	 makePostRequest("SignUp",document.getElementById("ajaxTextbox").value,document.getElementById("ajaxPassword").value);
	//makeGetRequest("SignUp",document.getElementById("ajaxTextbox").value,document.getElementById("ajaxPassword").value);
	//getSomevaluetoConsole();


	 };


function  makePostRequest(reqURL,userName,password)
{
    //Creating a new XMLHttpRequest object
    var xmlhttp = new XMLHttpRequest();

    xmlhttp.onreadystatechange = function() {
	    if (xmlhttp.readyState == XMLHttpRequest.DONE) {
	    	
	    	if(xmlhttp.responseText === ''){
	    		window.location = "http://localhost:8080/AjaxDemo1/SignIn";
	    	}
	    	else{
	    	document.getElementById("error").innerHTML = xmlhttp.responseText;
	    	}
	    	}
	}
  xmlhttp.open("POST",reqURL,true);
  xmlhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
  xmlhttp.send("name="+userName+"&password="+password);


}


</script>

</html>