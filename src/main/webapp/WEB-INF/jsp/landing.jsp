<!DOCTYPE html> 
<html> 
<style> 
	/*add full-width input fields*/ 
	input[type=text], 
	input[type=password] { 
		width: 100%; 
		padding: 12px 20px; 
		margin: 8px 0; 
		display: inline-block; 
		border: 2px solid #ccc; 
		box-sizing: border-box; 
	} 
	/* set a style for all buttons*/ 
	.common_button { 
		color: #fff;
	  	background-color: #007bff;
		padding: 14px 20px; 
		margin: 8px 0; 
		cursor: pointer; 
		width: 100%; 
	} 
	/*set styles for the cancel button*/ 
	.cancelbtn { 
		padding: 14px 20px; 
		
	  
	} 
	/*float cancel and signup buttons and add an equal width*/ 
	.cancelbtn, 
	.signupbtn { 
		float: left; 
		width: 20% 
	} 
	/*add padding to container elements*/ 
	.container { 
		padding: 16px; 
	} 
	/*define the modal’s background*/ 
	
	.modal { 
		display: none; 
		position: fixed; 
		z-index: 1; 
		left: 0; 
		top: 0; 
		width: 100%; 
		height: 100%; 
		overflow: auto; 
		background-color: rgb(0, 0, 0); 
		background-color: rgba(0, 0, 0, 0.4); 
		padding-top: 60px; 
	} 
	/*define the modal-content background*/ 
	
	.modal-content { 
		background-color: #fefefe; 
		margin: 5% auto 15% auto; 
		border: 1px solid #888; 
		width: 80%; 
	} 
	/*define the close button*/ 
	
	.close { 
		position: absolute; 
		right: 35px; 
		top: 15px; 
		color: #000; 
		font-size: 40px; 
		font-weight: bold; 
	} 
	/*define the close hover and focus effects*/ 
	
	.close:hover, 
	.close:focus { 
		color: red; 
		cursor: pointer; 
	} 
	
	.clearfix::after { 
		content: ""; 
		clear: both; 
		display: table; 
	} 
	
	@media screen and (max-width: 300px) { 
		.cancelbtn, 
		.signupbtn { 
			width: 100%; 
		} 
	} 
</style> 

<body> 

	<!--Step 1:Adding HTML-->
	<button class="btn btn-lg btn-primary" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Sign Up</button> 
	<a href="/login"><button class="btn btn-lg btn-primary" hra style="width:auto;">Sign In</button> </a>
	

	<div id="id01" class="modal"> 
		<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">×</span> 
		<form class="modal-content animate" action="/signup" method="post"> 
			<div class="container"> 
				<label><b>Name</b></label> 
				<input type="text" placeholder="Enter Name" name="userName" required> 
				<label><b>Email</b></label> 
				<input type="text" placeholder="Enter Email" name="email" required> 

				<label><b>Password</b></label> 
				<input type="password" placeholder="Enter Password" name="password_" required> 

				<label><b>Repeat Password</b></label> 
				<input type="password" placeholder="Repeat Password" name="psw-repeat" required> 
				<input type="checkbox"> Remember me 
				<p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p> 

				<div class="clearfix"> 
					<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn common_button">Cancel</button> 
					<button  type="submit" class="signupbtn common_button">Sign Up</button> 
				</div> 
			</div> 
		</form> 
	</div> 

	<!--close the modal by just clicking outside of the modal-->
	<script> 
		var modal = document.getElementById('id01'); 

		window.onclick = function(event) { 
			if (event.target == modal) { 
				modal.style.display = "none"; 
			} 
		} 
	</script> 

</body> 

</html> 
