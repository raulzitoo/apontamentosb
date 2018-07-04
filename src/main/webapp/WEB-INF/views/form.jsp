<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<title>Apontamento</title>
</head>
<body>
	<form action="${s:mvcUrl('AC#gravar').build() }" method="post">
	
		<div class="container">
			<label>Data</label>
			<input type="text" class="form-group">
		</div>
		
		
		<div class="container">
			<label>Horas</label>
			<input type="text" class="form-group">
		</div>
		
		<div class="container">
			<label>Descrição</label>
			<input type="text" class="form-group">
		</div>
		
		<button type="submit" class="btn-primary">Salvar</button>
	
	</form>
</body>
</html>