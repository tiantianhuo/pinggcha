package cn.pincha.controller;

import cn.pincha.domain.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller

public class registerController {
    @Autowired
    private cn.pincha.dao.registerdao registerdao;

    @RequestMapping("/register")
    @ResponseBody
    public String test1(@RequestBody Register register){

        String ID = UUID.randomUUID().toString().replace("-", "");
        register.setId(ID);
        registerdao.insert(register);

        return ID;
    }

    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("name", "simonsfan");
        return "/html/dengji/dengji.html";

    }
}
