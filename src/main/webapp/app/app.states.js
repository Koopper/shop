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
            .state('sale', {
                url: '/sale',
                templateUrl: 'modules/sales/templates/sale.html',
                controller: 'SaleController'
            })
            .state('vendor', {
                url: '/vendor',
                templateUrl: 'modules/vensor/templates/vendor.html',
                controller: 'VendorController'
            })
            .state('discount', {
                url: '/discount',
                templateUrl: 'modules/discount/templates/discount.html',
                controller: 'DiscountController'
            })

    }]);
})();