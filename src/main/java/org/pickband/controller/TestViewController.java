package org.pickband.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestViewController {

    @GetMapping("/band/member-form")
    public String addMember() {
        return "/view/add-member-form";
    }

    @GetMapping("/band/members")
    public String getMembers() {
        return "/view/member-list";
    }
}
