<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<nav>
    <div class="logo">VT</div>
    <input type="checkbox" id="click">
    <label for="click" class="menu-btn">
      <i class="fas fa-bars"></i>
    </label>
    <ul>
    <form action="LogoutServlet" method="post">
        <input type="submit" class="button" value="Sair" id="sair" name="">
      </form>
      <li><a class="active" href="#">Home</a></li>
      <li><a href="#">sobre</a></li>
      <li><a href="#">Servicos</a></li>
      <li><a href="#">Galeria</a></li>
      
      
    </ul>
  </nav>
  </body>