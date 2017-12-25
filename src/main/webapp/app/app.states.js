//TODO тут прописываются роуты
(function () {
    'use strict';
    var app = angular.module('app');
    app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/buyer");

        $stateProvider
            .state('buyer', {
                url: '/buyer',
                templateUrl: 'modules/buyer/templates/buyer.html',
                controller: 'BuyerController'
            })
            .state('products', {
                url: '/products',
                templateUrl: 'modules/products/templates/products.html',
                controller: 'ProductsController'
            })
    }]);
})();