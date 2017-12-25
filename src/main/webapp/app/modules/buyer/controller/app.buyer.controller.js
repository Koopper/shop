
(function () {
    'use strict';
    var app = angular.module('app');

    app.controller('BuyerController', [ '$scope', 'BuyerService', function($scope, BuyerService) {

        $scope.getAll = function(){
            BuyerService.getAll().then(function(response){
                $scope.buyers = response;
            }).catch(function(error){
                console.log(error);
            });
        };

        $scope.getAll();

    }]);
})();