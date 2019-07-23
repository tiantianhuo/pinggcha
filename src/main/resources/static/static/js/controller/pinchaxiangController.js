app.controller("pinchaxiangController",function ($scope,$location,pinchaxiangService) {
    //获取id





    $scope.add=function(x,index,scroe){


        //alert($scope.deductmarks)
        $scope.list[index].deductmarks+=x;
        if($scope.list[index].deductmarks>0){
            $scope.list[index].deductmarks=0;
        }
        if(-scroe>=$scope.list[index].deductmarks){
            $scope.list[index].deductmarks=scroe;
        }

    };
    $scope.pinggu=function(){
        var registerid=$location.search()['registerid'];
        pinchaxiangService.pinggu($scope.list,registerid).success(
            function (response) {
                var a=response
                this.location.href="/html/Resultanalysiss/analysiss.html?registerid="+a;
            }

        )

    };

    $scope.findall=function () {
        var registerid=$location.search()['registerid'];

        if(registerid!=""&&registerid!=null){
            pinchaxiangService.findone(registerid).success(
                function (response) {
                    $scope.list= response;
                    if($scope.list.length==0){
                        pinchaxiangService.findall().success(
                            function (response) {
                                $scope.list=response;
                                for (let i = 0; i < $scope.list.length; i++) {
                                    $scope.list[i].deductreson="";
                                    $scope.list[i].deductmarks=0
                                }

                            }
                        )
                    }else {
                        $scope.list=response;
                    }

                }
            )
        }else {
        pinchaxiangService.findall().success(
            function (response) {
                $scope.list=response;
                for (let i = 0; i < $scope.list.length; i++) {
                    $scope.list[i].deductreson="";
                    $scope.list[i].deductmarks=0
                }

            }
        )}
    }


});