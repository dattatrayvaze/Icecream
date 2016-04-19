'use strict'


app.controller('candyController', function ($scope, $http) {
$scope.rows = 3;
$scope.columns = 4;
$scope.page=0;
$scope.totalPages=0;
$scope.prevswitch = true; 
$scope.nextswitch = true;

var response = $http({ method: 'GET', url:'http://localhost:8080/Icecream/candyList'});
        response.success(function (data){
			$scope.fulldata = data;
			$scope.totalPages = Math.floor( $scope.fulldata.length / 12 );
			if($scope.fulldata.length % 12 > 0 ) {
					$scope.totalPages += 1;
			}
			$scope.icecreams = $scope.chunk(data, $scope.rows, $scope.columns, 0, $scope.rows * $scope.columns);
			$scope.page=1;
			if( $scope.page < $scope.totalPages ) { 
				$scope.nextswitch = false;
			}
        });
        response.error(function (data){
            alert("failure");
        });

$scope.chunk = function (arr, rows, columns, startIndex, endIndex) {
var newArr = [];
  for (var i = startIndex; i < endIndex; i += columns) {
    newArr.push(arr.slice(i, i+columns));
  }
  return newArr;
};

$scope.prev = function () {
	if($scope.page==1) return;
	$scope.icecreams = $scope.chunk($scope.fulldata, $scope.rows, $scope.columns, $scope.rows * $scope.columns * ($scope.page - 2), $scope.rows * $scope.columns * ($scope.page - 1));
	$scope.page=$scope.page -1;
	if($scope.page == 1) {
		$scope.prevswitch = true; 
		if( $scope.page < $scope.totalPages ) { 
				$scope.nextswitch = false;
			}
	} else {
		$scope.prevswitch = false; 
		if( $scope.page < $scope.totalPages ) { 
		$scope.nextswitch = false;
		}
	}
};

$scope.next = function() {
	if( $scope.rows * $scope.columns * ($scope.page) < $scope.fulldata.length ) {
		$scope.icecreams = $scope.chunk( $scope.fulldata, $scope.rows, $scope.columns, $scope.rows * $scope.columns * $scope.page, $scope.rows * $scope.columns * ($scope.page + 1));
		$scope.page=$scope.page + 1; 
		if( $scope.page == $scope.totalPages ) { 
			$scope.nextswitch = true;
		}
		$scope.prevswitch = false; 
	}
	return;
};
$scope.testSuccess = function() {
	testService.getIcecreams("http://localhost:8080/Icecream/icecreamList/success").then(function(data){
		alert("data="+data);
	},function(error){
		alert("error"+ error);
	});
};

$scope.testError = function() {
	testService.getIcecreams("http://localhost:8080/Icecream/icecreamList/error").then(function(data){
		alert("data="+data);
	},function(error){
		alert("error"+ error);
	});
};
var userDetails = $http({ method: 'GET', url:'http://localhost:8080/Icecream/userDetails'});
        userDetails.success(function (data){
			$scope.username = data.username;
		});
});