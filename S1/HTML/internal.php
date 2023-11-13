<html>
	<body>
		<center>
			<h1><u>RESULT OF FIRST SESSIONAL EXAMINATION  S1-MCA 2023</u></h1>
			<?php if(!isset($_POST["sub"])){?>
			<table border="0">
				<form method ="post" action="">
				<tr>
						<td>NAME:</td>
						<td><input type="text" name="name"></td><br><br>
				</tr>
				<tr>
						<td>ROLL NO:</td>
						<td><input type="text" name="roll"></td><br><br>
				</tr>
				<tr>
						<td>Subject:</td>
						<td><input type="text" name="s1"></td><br><br>
						<td>Mark:</td>
						<td><input type="text" name="m1"></td><br><br>
				</tr>
				<tr>
						<td>Subject:</td>
						<td><input type="text" name="s2"></td><br><br>
						<td>Mark:</td>
						<td><input type="text" name="m2"></td><br><br>
				</tr>
				<tr>
						<td>Subject:</td>
						<td><input type="text" name="s3"></td><br><br>
						<td>Mark:</td>
						<td><input type="text" name="m3"></td><br><br>
				</tr>
				<tr>
						<td  align="center" colspan="2">
						<input type="submit" name ="sub" value="results"></td>
				</tr><br><br>
				  </form>
				 </table>
				 <?php }?>
				 <?php
if(isset($_POST["sub"]))
{
	$n=$_POST["name"];
	$r=$_POST["roll"];
	$m1 = $_POST["m1"];
	$m2 =$_POST["m2"];
	$m3 =$_POST["m3"];
	$s1 = $_POST["s1"];
	$s2 = $_POST["s2"];
	$s3 = $_POST["s3"];
?>

<h2>NAME:<?php echo $n;?></h2>
<h2>ROLL NO:<?php echo $r;?></h2>
<table border="1">
	
	<tr>
				<th>S.NO</th>
				<th>SUBJECTS</th>
				<th>MARK</th>
				<th>REMARK</th>
	</tr>
	<tr>
				<th>1</th>
				<td><?php echo $s1;?></td>
				<td><?php echo $m1;?></td>
				<td><?php $m1>50?print("Pass"):print("Fail"); ?></td>
	</tr>
	<tr>
				<th>2</th>
				<td><?php echo $s2;?></td>
				<td><?php echo $m2;?></td>
				<td><?php $m2>50?print("Pass"):print("Fail"); ?></td>
	</tr>
	<tr>
				<th>3</th>
				<td><?php echo $s3;?></td>
				<td><?php echo $m3;?></td>
				<td><?php $m3>50?print("Pass"):print("Fail"); ?></td>
	</tr>
	<tr>
				<th  colspan="3"><center>TOTAL:<?php echo  $m1+$m2+$m3."/300"."</center>";?></th>
				<th colspan="1">PASS</th>
	</tr>
</table>
<?php
}
?>
	</center>
	</body>
</html>
