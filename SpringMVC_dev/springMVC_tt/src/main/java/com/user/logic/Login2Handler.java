package com.user.logic;

import com.user.bean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-08-22
 */
@Controller
@RequestMapping("/dddd")
public class Login2Handler {

    @RequestMapping("/login/{p1}/{p2}")
    public String login(Model model, @PathVariable String p1, @PathVariable String p2) {
        model.addAttribute("loginInfo","登录成功了！"+p1+p2);
        return "forward:/WEB-INF/loginView.jsp";
    }

    @RequestMapping("/login2/{p1}/{p2}")
    @ResponseBody
    public List<Users> login2(@PathVariable String p1, @PathVariable String p2) {
        Users users = new Users();
        users.setName("狄秋秋");
        users.setAge(15);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("数学",99);
        map.put("语文",89);
        map.put("英语",97);
        users.setSorces(map);
        ArrayList<Users> usersArrayList = new ArrayList<>();
        usersArrayList.add(users);
        usersArrayList.add(users);
        return usersArrayList;
    }
}
