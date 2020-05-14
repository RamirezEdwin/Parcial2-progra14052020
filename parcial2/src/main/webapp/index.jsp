<html>

 <script src="http://code.jquery.com/jquery-latest.js"> </script>
  <script type="text/javascript">
     $(document).ready(function(){
       
          $.post('ServeletHistorialUsuario',{

          }, function(response){
          let datos = JSON.parse(response);
          //console.log(datos);
          var tabladatos = document.getElementById('tablaDatos');

           for(let item of datos){
            tabladatos.innerHTML += ` 
             

            `

           }

         

         });
     
     });
   </script>
   
   <body background="C:\Users\SACKI\git\proyeclogin\procticalogin\src\main\webapp\wallpaper.jpg">
 <div class="container col-md-8 col-md-offset-3" style="overflow: auto" >
       
     
<br>
<br>


<button type="submit" class="btn btn-primary" value="entrar" >INGRESAR</button>
  </form>




   <table class ="table table-dark" id="tablaDatos">
   <thead>
    <th>APELLIDO</th>
     <th>NOMBRE</th>
      <th>ID</th>
  
   </thead>
   
   </table>


</html>
