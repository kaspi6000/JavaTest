<html>
	<head>
		<title>
			Guest Book
		</title>
	</head>
	<body bgcolor = "#006699" link = "#99ccff" vlink = "#99cccc" text = "#ffffff">
	<center>
		<br><p>
			<?php
			$host = 'localhost';
			$user = 'root';
			$pw = 'sksk1311';
			$connect = mysqli_connect($host, $user, $pw) or die("SQL server에 연결할 수 없습니다.");
			// $connect = mysqli_connect('localhost', 'root', 'sksk1311') or die("SQL server에 연결할 수 없습니다.");
			mysqli_select_db("user_db",$connect);

			$test = "hihihi";
			echo $test;
			for ($index=0; $index < 10; $index++) {
					echo $index;
			}
			?>
			<?php
			// $scale = 5;
			// $admin_ip = '192.168.219.145';
			// $allow_html = 0;
			// if ($mode == 'de'){
			// 	if($REMOTE_ADDR != $admin_ip)
			// 	{
			// 		echo("
			// 			<script>
			// 			window.alert('관리자만 지울 수 있습니다.')
			// 			</script>");
			// 		echo("<meta http-equiv='Refresh' content='0; URL=$PHP_SELF'>");
			// 		exit;
			// 	}
			// 	else{
			// 		$quel = "delete from guestbook where id=$id";
			// 		$result = mysqli_query($quel,$connect);
			// 	}
			// }
			// if ($mode == 'up'){
			// 	if(!$name || !$comment){
			// 		echo ("
			// 			<script>
			// 				window.alert('이름 and comment')
			// 				history.go(-1);
			// 			</script>");
			// 			exit;
			// 	}
			//
			// 	if(!$allow_html){
			// 		$name = htmlspecialchars($name);
			// 		$comment = htmlspecialchars($comment)
			// 	}
			// 	$name = addslashes($name);
			// 	$home = addslashes($home);
			// 	$email = addcslashes($email);
			// 	$comment = addcslashes($comment);
			//
			// 	$quel = "insert into guestbook valuse";
			// 	$quel = "('','$name','$home','$email','$comment','$REMOTE_ADDR',now())";
			// 	$result = mysqli_query($quel,$connect);
			//
			// 	if ($result){
			// 		echo("<META http_equiv='Refresh' content='0; URL=$PHP_SELF'>");
			// 		exit;
			// 	}
			// 	else {
			// 		echo("
			// 			<script>
			// 			window.alert('DB오류');
			// 			history.go(-1);
			// 			</script>");
			// 		exit;
			// 	}
			// }
			 ?>
		</p>
	</body>
</html>
