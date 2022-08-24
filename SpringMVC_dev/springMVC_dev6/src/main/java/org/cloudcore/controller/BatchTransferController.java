package org.cloudcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-04 0:21
 * @Description TODO
 */
@Controller
public class BatchTransferController {

    @GetMapping("/transfer1")
    public String transfer1(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "pay";
    }

}
