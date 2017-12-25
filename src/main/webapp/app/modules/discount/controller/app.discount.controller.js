
(function () {
    'use strict';
    var app = angular.module('app');

    app.controller('DiscountController', [ '$scope', 'DiscountService', function($scope, DiscountService) {

        $scope.getAll = function(){
            DiscountService.getAll().then(function(response){
                $scope.buyers = response;
            }).catch(function(error){
                console.log(error);
            });
        };

        $scope.getAll();

    }]);
})();