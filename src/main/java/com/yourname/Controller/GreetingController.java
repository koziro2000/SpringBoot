package com.yourname.Controller;

import com.yourname.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jroh on 26/09/2016.
 */

@Controller
public class GreetingController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("students", studentService.getAllStudents());
        return "greeting";
    }
}
