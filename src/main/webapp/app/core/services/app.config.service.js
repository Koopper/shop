//TODO это конфиг, его не трогать, он просто рут путь берет
(function() {
    'use strict';

    var app = angular.module('app');

    app.factory('ConfigService', ['$location','$http','$q', function($location, $http, $q) {

        var factory = {};

        factory.getProtocol = function() {
            return $location.protocol();
        };

        factory.getRootPath = function() {
            return $location.absUrl().split('/#!/')[0];
        };

        return factory;

    }]);

})();