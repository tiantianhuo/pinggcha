app.service("registerService",function ($http) {
    this.register=function (entity) {
        return $http.post("../../register",entity)
    }
    this.search=function () {
        return $http.post("search")
    }
})