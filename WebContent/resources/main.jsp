<!DOCTYPE html>
<html>
	<head>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
		<link href="css/app.css" rel="stylesheet">
	</head>
  <!--   -->
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<!--  <script src ="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.min.js"></script>-->
	<!--<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js">
	</script> -->
   
	<body>
		<div id="main_wrapper" ng-app="login" ng-controller = "loginController">
			 <div style="float:right">
                <img alt="Baskin Robins Logo Image" class="img-rounded" src="images/Baskin-Robbins-Logo.png"></img>
            </div>
		  <div class="panel panel-primary loginBox">
			<div class="panel-heading">
				<h1 class="panel-title panalt" style="color">LOGIN</h1>
			</div>
			<div class="panel-body"> 
				<div style="padding-bottom:1%" ng-show="errorMsg">
					<span class="label label-danger">{{errorMessage}}</span>
				</div>
				<div style="padding-bottom:1%">
					<input type="text" placeholder="USERNAME" class="form-control" ng-model="username"/>
				</div>
				<div style="padding-bottom:3%">
					<input type="password" placeholder="PASSWORD" class="form-control" ng-model="password"/>
				</div>
				<div>
					<button class="btn btn-block btn-primary" type="button" ng-click="login()">Login</button>
				</div>
			</div>
		  </div>
        </div>
         <script src="//code.jquery.com/jquery-1.11.3.min.js"></script> 
        <!-- build:js(.) scripts/vendor.js -->
<!-- bower:js -->
<script src="bower_components/jquery/dist/jquery.js"></script>
<script src="bower_components/angular/angular.js"></script>
<script src="bower_components/bootstrap-sass-official/assets/javascripts/bootstrap.js"></script>
<script src="bower_components/angular-animate/angular-animate.js"></script>
<script src="bower_components/angular-cookies/angular-cookies.js"></script>
<script src="bower_components/angular-resource/angular-resource.js"></script>
<script src="bower_components/angular-route/angular-route.js"></script>
<script src="bower_components/angular-sanitize/angular-sanitize.js"></script>
<script src="bower_components/angular-touch/angular-touch.js"></script>
<script src="bower_components/angular-translate/angular-translate.js"></script>
<script src="bower_components/angular-translate-loader-static-files/angular-translate-loader-static-files.js"></script>
<script src="bower_components/angular-translate-storage-cookie/angular-translate-storage-cookie.js"></script>
<script src="bower_components/angular-translate-storage-local/angular-translate-storage-local.js"></script>
<script src="bower_components/angular-translate-handler-log/angular-translate-handler-log.js"></script>
<script src="bower_components/angular-dynamic-locale/src/tmhDynamicLocale.js"></script>

<!-- endbower -->
<!-- endbuild -->

<!-- build:js({.tmp,app}) scripts/scripts.js -->
<script src="scripts/app.js"></script>
<script src="scripts/controllers/appCtrl.js"></script>
<script src="scripts/controllers/main.js"></script>
<script src="scripts/controllers/about.js"></script>
<script src="scripts/controllers/contacts.js"></script>
<script src="scripts/services/LocaleService.js"></script>
<script src="scripts/directives/LanguageSelectDirective.js"></script>
<!-- endbuild -->

 <script src = "js/app.js"></script>
    <script src = "js/angular-utf8-base64.js">
	</script>
	</body>
</html>