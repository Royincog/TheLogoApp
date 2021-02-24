<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap" rel="stylesheet"> 
<link rel="stylesheet" href="css/style.css">
 <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
  

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  class="text-center">
<form class = "container form-signin" >
<img class="mb-4" src="https://cdn.logo.com/hotlink-ok/logo-social.png"  width="100%" height="100%">
<div>
<h4 class = "animate__animated animate__swing">Welcome To Logo</h4>
</div>
<br>
<div class = "form-group">
<label>
  <input type="text" id="ajaxTextbox" class="form-control sr-only" placeholder="username"/>
</label>
</div>
<br>
<div class = "form-group">
<label>
  <input type="password" id="ajaxPassword" class="form-control sr-only" placeholder="password"/>
</label>
</div>

<br>
<button type="button" class="btn btn-dark"  id="ajaxButton">Sign In</button>
<br>
<br>
<a href= "SignUp" style="text-decoration:none" >Not a user ? Please Sign Up</a>
<br>
<br>
<p style = "color:red; display:none;" id = "errorText">${error}</p>
</form>

</body>
<script>
document.getElementById("ajaxButton").onclick = function() {
	 makeRequest("SignIn",document.getElementById("ajaxTextbox").value,document.getElementById("ajaxPassword").value);
};
function  makeRequest(reqURL,userName,password)
{
    //Creating a new XMLHttpRequest object
    var xmlhttp = new XMLHttpRequest();
   

  xmlhttp.onreadystatechange = function() {
	  if (xmlhttp.readyState == XMLHttpRequest.DONE) {
		  //console.log(xmlhttp.responseText);
	  
		  
		//parse the response text  
	    var parser=new DOMParser();
	 	var xmlDoc=parser.parseFromString(xmlhttp.responseText,"text/html");
	 	var tds = xmlDoc.getElementsByTagName("p").item(0);
	    
	 	console.log(tds.innerHTML);
	  	
	 	if(tds.innerHTML === 'success'){
	 		window.location = "http://localhost:8080/AjaxDemo1/welcomeLogoScreen.html";	
	 	}
	 	else{
	    document.getElementById("errorText").innerHTML = tds.innerHTML ;
	    document.getElementById("errorText").style.display = "inline";
	 	}
	  
	  }
 }
  xmlhttp.open("GET", reqURL+"?name="+userName+"&password="+password,true);

 xmlhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
  
  xmlhttp.send(null);
}


</script>

</html>
