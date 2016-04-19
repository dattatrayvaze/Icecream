'use strict'
app.factory("logoutService", function($http,$q) {
	$http.get("http://localhost:8080/Icecream/logout");
	
});

app.factory("testService",function($http,$q) {
	return {
		getIcecreams :function(url) {
			return $http.get(url)
			.then(function(response){
				return response.data;
			},function(response){
				return $q.reject(response.data);
			});
		}
		
	}
});