<?php
	header("Location: index.php");

	$cor = $_POST['corSelect'];
	
	setcookie('corCookie',$cor, time()+180);//3 minutos
	// setcookie('corCookie',$cor, time()+(60*60*24*10));
	/*
		60 - 1 minuto
		*60 - 1 hora
		*24 - 1 dia
		*10 - 10 dias
	*/
?>