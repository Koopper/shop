//TODO тут идет связка с рест сервисем
(function() {
    'use strict';
    var app = angular.module('app');

    app.factory("VendorService", ['$http', '$q','ConfigService','$window',  function($http, $q, ConfigService, $window) {

        var factory = {};

        var rootPath = ConfigService.getRootPath()+"/vendor";

        factory.getAll = function() {
            var defer = $q.defer();
            $http.get(rootPath).then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        factory.getById = function(id) {
            var defer = $q.defer();
            $http.get(rootPath+'/'+id).then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        factory.save = function(buyer) {
            var defer = $q.defer();
            $http.post(rootPath, buyer).then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        factory.update = function(buyer) {
            var defer = $q.defer();
            $http.put(rootPath, buyer).then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        factory.delete = function(id) {
            var defer = $q.defer();
            $http.delete(rootPath+'/'+id).then(function(response) {
                defer.resolve(response.data);
            }).catch(function (error) {
                defer.reject(error);
            });
            return defer.promise;
        };

        return factory;
    }]);
})();