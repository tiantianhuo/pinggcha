app.controller("registerController",function ($scope,$location,registerService) {


    $scope.send=function(){

        if($scope.entity.name==null || $scope.entity.name==""||$scope.entity.accusation==null || $scope.entity.accusation==""||$scope.entity.legalCase==null || $scope.entity.legalCase==""||$scope.entity.procuratorate==null || $scope.entity.procuratorate==""){
            alert("请填写完整信息");
            return ;
        }
        registerService.register($scope.entity).success(
            function(response){
                var a=response;
                this.location.href="/html/PlotSelections/PlotSelections.html#?registerid="+a;
                //alert(response.message);
            }
        );
    }
    //加载查询字符串
    $scope.loadkeywords=function(){
        $scope.searchMap.keywords=  $location.search()['keywords'];
        $scope.search();
    }
    $scope.findall=function () {
        registerService.findall().success(
            function (response) {
                $scope.list=response
            }
        )
    }


});