package com.teamproject.okowan.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okw/view")
public class ViewController {

    @GetMapping
    public void check() {
    }
}
