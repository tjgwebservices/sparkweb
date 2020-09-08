<!DOCTYPE html>
<html>
<head>
  <#include "header.ftl">
</head>

<body>

  <#include "nav.ftl">

<body dir="ltr">
<div class="container">
<div id="main">
<h1>Distance Learning Application - International CARDS Online</h1>

<form method="POST" action="/home">

<h6>Sorry, the ${username} was not found.</h6>

<label for "username">Username:</label>
<input type="text" id="username" name="username" size="20" />
<label for "password">Password:</label>
<input type="password" id="password" name="password" size="20" />
<button type="submit" id="submitButton" name="submitButton">Submit</button>

</form>


</div>
</div>

  <#include "footer.ftl">




