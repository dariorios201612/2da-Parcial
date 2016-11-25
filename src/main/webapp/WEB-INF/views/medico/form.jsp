<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Medico</title>

	<script type="text/javascript" src="/springhibernate/resourses/angular/angular.min.js"></script>

<!--Import Google Icon Font-->
<link href="/sptallercuatro/resourses/materialize/iconos/index.css" rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="/sptallercuatro/resourses/materialize/css/materialize.min.css" media="screen,projection" />

<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="widtd=device-widtd, initial-scale=1.0" />

<script type="text/javascript">

		angular.module("registroMedico",[]);
		
		angular.module("registroMedico").controller("MedicoController", function($scope,$http){
			
			$scope.aplicativo="Registro de Medico";
			
			$scope.registrarMedico = function(medico){
				
				$http.post("http://localhost:8080/sptallercuatro/medicos", medico).success(function(){
					
					//Vaciar los campos del formulario
					$scope.medico = undefined;
					
					cargarMedicos();
					
				});
			};
			//var editarProducto=function(){
				//$scope.$watch(function(){
				//	Materialize.updateTextFields();
				//});//para editar un producto que cargue en los textfiels
			//};
			var cargarMedicos=function(){
				$http.get("http://localhost:8080/sptallercuatro/medicos").success(function(medicos){
					
					$scope.medicos = medicos;
				});
			};
			
			cargarMedicos();
			
			
		});

</script>
</head>
<body>

	<form class="col s8">

			<div class="card-panel">
				<div class="row">
					<div class="input-field col s6">
					<!--  	<i class="material-icons prefix">account_circle</i> -->
						<input id="nombre" type="number" class="validate" ng-model="medico.nombre"> 
						<label for="nombre">Nombre</label>
					</div>

					<div class="input-field col s6">
						<!--  <i class="material-icons prefix">today</i> -->
						<input id="salario" type="text" ng-model="medico.salario"> 
						<label for="salario">Salario</label>
					</div>

				</div>

			</div>

			<button ng-bind="registrarMedico(medico)" class="btn waves-effect waves-light" type="submit" name="action"> Registrar 
			<h4 class="material-icons right">save</h4>
			</button>


		</form>


<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="/sptallercuatro/resourses/jquery.js"></script>
	<script type="text/javascript"
		src="/sptallercuatro/resourses/materialize/js/materialize.min.js"></script>
</body>
</html>