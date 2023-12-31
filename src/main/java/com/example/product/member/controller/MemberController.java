package com.example.product.member.controller;


import com.example.product.member.form.MemberForm;
import com.example.product.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "/member/login";
    }

    @GetMapping("/join")
    public String showJoin() {
        return "/member/join";
    }

    @PostMapping("/join")
    public String join(@Valid MemberForm memberForm) {
        memberService.join(memberForm.getUsername(), memberForm.getPassword(), memberForm.getNickname(), memberForm.getEmail());

        return "redirect:/member/login";
    }
}
