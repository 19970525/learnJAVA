package org.cloudcore.controller;

import org.apache.log4j.Logger;
import org.cloudcore.pojo.Users;
import org.cloudcore.service.UserService;
import org.cloudcore.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-05 19:28
 * @Description TODO
 */
@Controller
public class QueryAllUsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAllUsers")
    public String queryAllUsers(Model model) {
        Logger log = Logger.getLogger(QueryAllUsersController.class);
        List<Users> usersList = userService.queryUsers("张");
        for (Users user : usersList) {
            log.info(user);
        }
        model.addAttribute("msg", usersList.toString());
        return "userList";
    }
}
