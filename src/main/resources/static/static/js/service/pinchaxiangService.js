app.service("pinchaxiangService",function ($http) {

    this.findall=function () {
        return $http.post("../../search")
    }
    this.findone=function (registerid) {
        return $http.post("../../findone",registerid)
    }
    this.pinggu=function (list,registerid) {
        return $http.post("../../pingu?registerid="+registerid,list)
    }
})