package org.cloudcore.controller;

import org.cloudcore.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-06 10:32
 * @Description TODO
 */
@Controller
public class BatchTransferController {

    @PostMapping("/transfer")
    public @ResponseBody List<Users> transfer(@RequestBody Users users, ServletContext application) {
        System.out.println(users.toString());
        System.out.println(users.getBoyfriend_id());
        ArrayList<Users> users1 = new ArrayList<>();
        users1.add(users);
        users1.add(users);
        users1.add(users);
        users1.add(users);
        application.getRealPath("/upload");
        return users1;
    }
}
