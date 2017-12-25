//TODO тут идет связка с рест сервисем
(function() {
    'use strict';
    var app = angular.module('app');

    app.factory("BuyerService", ['$http', '$q','ConfigService','$window',  function($http, $q, ConfigService, $window) {

        var factory = {};

        var rootPath = ConfigService.getRootPath()+"/buyer";

        factory.getAll = function() {
            var defer = $q.defer();
            $http.get(rootPath+'/buyer').then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        return factory;
    }]);
})();