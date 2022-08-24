package org.cloudcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-04 0:21
 * @Description TODO
 */
@Controller
public class BatchTransferController {

//    @RequestMapping(value = "/transferMoney/{p1}/{p2}", method = {RequestMethod.GET})
//    @RequestMapping("/transferMoney/{p1}/{p2}")
    @GetMapping("/transferMoney/{p1}/{p2}")
    public String transfer(Model model, @PathVariable int p1, @PathVariable int p2) {
        model.addAttribute("msg","转账" + (p1+p2) + "元！");
        return "pay";
    }

}
