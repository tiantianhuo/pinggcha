package cn.pincha.controller;

import cn.pincha.domain.Pinchaxiang;
import cn.pincha.domain.Register;
import cn.pincha.domain.Registerdeductmarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

@Controller

public class pinchaxiangController {
    @Autowired
    private cn.pincha.dao.pinchaxiangdao pinchaxiangdao;
    @Autowired
    private cn.pincha.dao.registerdeductmarksdao registerdeductmarksdao;
    //显示全部评查项
    @RequestMapping("/search")
    @ResponseBody
    public List<Pinchaxiang> search(){
        List<Pinchaxiang> all = pinchaxiangdao.findAll();
        System.out.println(all);
        return all;
    }
    //评估结果
    @RequestMapping("/pingeresult")
    @ResponseBody
    public Map<String,Integer> pingeresult(@RequestBody String registerid){
        String replace = registerid.replace("xx=", "");
        List<Pinchaxiang> findone = registerdeductmarksdao.findone(replace);
        Map<String, Integer> pingcharesult = pingcharesult(findone);
        return pingcharesult;
    }
    //通过id查询是否保存
    @RequestMapping("/findone")
    @ResponseBody
    public List<Pinchaxiang> findone(String id){
        List<Pinchaxiang> findone = registerdeductmarksdao.findone(id);
        System.out.println(findone);
//        if(findone.size()==0){
//            return search();
//        }
        return findone;
    }
    //评估
    @RequestMapping("/pingu")
    @ResponseBody
    public String pinju(@RequestBody List<Pinchaxiang> pinge,String registerid){
        List<Pinchaxiang> findone =new ArrayList<>();
        if(!"undefined".equals(registerid)){
             findone = registerdeductmarksdao.findone(registerid);
        }

        if(findone.size()>0){
           return "该用户已完成评估";
        }
        String id=registerid;
        String ids = UUID.randomUUID().toString().replace("-", "");
        Registerdeductmarks registerdeductmarks = new Registerdeductmarks();
        for (Pinchaxiang pinchaxiang : pinge) {
            registerdeductmarks.setDeductmarks(pinchaxiang.getDeductmarks());
            registerdeductmarks.setPcxid(pinchaxiang.getId());
            registerdeductmarks.setId( UUID.randomUUID().toString().replace("-", ""));
            registerdeductmarks.setType(pinchaxiang.getType());
            if(registerid!=null&&registerid!=""&&!"undefined".equals(registerid)){
                registerdeductmarks.setRegisterid(registerid);
            }else {

                registerdeductmarks.setRegisterid(ids);
                id=ids;
            }
            if(pinchaxiang.getDeductreson()!=null||pinchaxiang.getDeductreson()!=""){
                registerdeductmarks.setDeductreson(pinchaxiang.getDeductreson());
            }
            registerdeductmarksdao.insert(registerdeductmarks);
        }

        return id;
    }

    public Map<String,Integer> pingcharesult(List<Pinchaxiang> pinge){
        int anjianquality=30;
        int wenshuquality=20;
        for (Pinchaxiang pinchaxiang : pinge) {
            if(pinchaxiang.getType()==1){
                 anjianquality+=pinchaxiang.getDeductmarks();
            }else {
                wenshuquality+=pinchaxiang.getDeductmarks();
            }

        }
        Map<String,Integer> map = new HashMap();
        map.put("1",anjianquality);
        map.put("2",wenshuquality);
        return map;
    }

}
