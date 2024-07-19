package com.kiosk.kiosk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiosk.kiosk.entity.MemberEntity;
import com.kiosk.kiosk.repository.MemberRepository;

@Controller
public class KioskController {

	@Autowired
    private MemberRepository memberRepository;

    @GetMapping("/")
    public String getAllUsers() {
//        List<MemberEntity> members = memberRepository.findAll();
//        model.addAttribute("members", members);
        return "test"; // userList.html을 렌더링하는 View 이름
    }
}
