'use strict'
var app =  angular.module('login', ['utf8-base64','translateApp']);

app.controller('loginController', function ($scope, $http,$window,base64) {
	$scope.errorMsg = false;
    $scope.login = function() {
        //$scope.encoded = base64.encode('a string');
        //$scope.decoded = base64.decode('YSBzdHJpbmc=');
        $scope.encodedHeader = "Basic " + base64.encode($scope.username + ":" + $scope.password);
        $scope.config = {
            'Authorization': $scope.encodedHeader,
            'Accept': 'application/json',
        };   
        var response = $http({method: 'GET', url:'http://localhost:8080/Icecream/login',headers:$scope.config});
        response.success(function (data){
            $window.location.href = 'html/home.htm';
        });
        response.error(function (data){
        	$scope.errorMsg = true;
        	$scope.errorMessage = "Invalid Username/password";
        	$scope.username = "";
        	$scope.password = "";
        });
    };
    window.onclick = function() {
        if ($scope.errorMsg) {
            $scope.errorMsg = false;

      // You should let angular know about the update that you have made, so that it can refresh the UI
            $scope.$apply();
        }
    };
});


                                   