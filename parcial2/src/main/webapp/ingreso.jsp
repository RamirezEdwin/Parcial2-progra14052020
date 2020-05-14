<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><head>
<meta charset="ISO-8859-1">
<title>ingreso de usuario</title>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
 
 <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
 <link href="estilos/style.css" rel="stylesheet" type="text/css">
 
 <style type="text/css">

		@import url('https://fonts.googleapis.com/css?family=Pinyon+Script&display=swap')


		*{
			margin: 0px;
			padding: 0px;
		}

		body{
         background: url(https://preppywallpapers.com/wp-content/uploads/2019/11/Gold-Glitter-Festive-Christmas-iPhone-11-Wallpapers.jpg);
         background-position: center;

		}

		form{
			background:#FFFFFF40;
			width: 400px;
			border: 0px solid #4e4d4d;
			border-radius: 3PX;
			-MOZ-border-radius: 3PX;
			-Webkit-border-radius: 3PX;
			box-shadow: inset 0 0 0px #000;
			margin: 30px auto;		
			align-content: center;	
		}

		form h2{
            text-align: center;
            color: #fff;
            font-weight: normal;
            font-size: 20pt;
            
        
           
            	}
        form p{
            text-align: center;
            color: #fff;
            font-weight:normal;
            font-size: 10pt;
            
          
                     

		}
		
		div{
		align-content: center;
		
		}
		
		form img{

			width: 150px;
			height: 120px;
			padding: 0px 10px;
			color: #160843;
			align: center;
			margin: 10px 30px;
			background-color: #3333340
		
		
		}
		
		div.form.button{
		align: center;
		
		}

		form input{

			width: 280px;
			height: 35px;
			padding: 0px 10px;
			color: #160843;
			text-align: center;
			background-color: #3333340
		
		
			border: 0px;}
			



		
	</style>
 
 
</head>
<body background="C:\Users\SACKI\git\proyeclogin\procticalogin\src\main\webapp\wallpaper.jpg">
 <div class="container col-md-8 col-md-offset-3" style="overflow: auto" >
   <form action="Servelte" method="post">
   <h2>INGRESO DE USUARIO</h2>
   <img align="center" alt="" src="https://cdn.icon-icons.com/icons2/1879/PNG/512/iconfinder-3-avatar-2754579_120516.png">


<input type="text"
     class="form-control" id="username" placeholder="User Name"
     name="usuario" required>
     <p>USUARIO</p>



<input type="password"
     class="form-control" id="username" placeholder="User Name"
     name="contra" required><p>CONTRASEÑA</p>
     
    
         
     
     
<br>
<br>


<button type="submit" class="btn btn-primary" value="entrar" >INGRESAR</button>
  </form>

</div>

</body>
</html>