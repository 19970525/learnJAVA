package org.cloudcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-04 0:21
 * @Description TODO
 */
@Controller
public class BatchTransferController {

    @RequestMapping("/transferMoney")
    public String transfer(Model model) {
        model.addAttribute("msg","转账1000000.00元！");
        return "pay";
    }
}
