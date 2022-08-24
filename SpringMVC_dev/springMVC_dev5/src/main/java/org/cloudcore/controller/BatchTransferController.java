package org.cloudcore.controller;

import org.cloudcore.pojo.TransferFrom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-04 15:16
 * @Description TODO
 */
@Controller
public class BatchTransferController {

    //测试请求数据封装为javaBean的问题
    @GetMapping("/transfer")
    public String transfer(Model model, TransferFrom transferFrom) {
        System.out.println(transferFrom.getUname());
        System.out.println(transferFrom.getTotal());
        model.addAttribute("msg", transferFrom.getUname() + "转了" + transferFrom.getTotal() + "元");
        return "pay";
    }

    //需要视图解析器 默认转发
    @GetMapping("/transfer1")
    public String transfer1(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "pay";
    }

    @GetMapping("/transfer11")
    public String transfer11(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "forward:/WEB-INF/pay.jsp";
    }

    @GetMapping("/transfer12")
    public String transfer12(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "redirect:/WEB-INF/pay.jsp";
    }








    //无需视图解析器
    @GetMapping("/transfer2")
    public String transfer2(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "forward:/WEB-INF/pay.jsp";
    }

    //无需视图解析器 重定向无法找到WEB-INF目录下的文件，将文件建在WEB-INF之外
    @GetMapping("/transfer3")
    public String transfer3(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        System.out.println(model.getAttribute("msg"));
        System.out.println(uname);
        return "redirect:/jsp/pay2.jsp";
    }

    @PostMapping("/transfer4")
    public String transfer4(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "forward:/WEB-INF/pay.jsp";
    }

    @PostMapping("/transfer5")
    public String transfer5(Model model, @RequestParam("uname") String uname, @RequestParam("total") double total) {
        model.addAttribute("msg", uname + "转了" + total + "元");
        return "redirect:/jsp/pay2.jsp";
    }
}
