package com.hello.core;

import com.hello.core.config.AppConfig;
import com.hello.core.memeber.Grade;
import com.hello.core.memeber.Member;
import com.hello.core.memeber.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member member1 = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + member1.getName());
    }
}
