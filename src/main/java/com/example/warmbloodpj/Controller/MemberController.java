package com.example.warmbloodpj.Controller;

import com.example.warmbloodpj.Dto.MemberRequestDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signups")
    public ResponseDto<?> signup(@RequestBody MemberRequestDto memberRequestDto) {
        return memberService.signup(memberRequestDto);
    }
}
