package com.hello.core;

import com.hello.core.config.AppConfig;
import com.hello.core.memeber.Grade;
import com.hello.core.memeber.Member;
import com.hello.core.memeber.MemberService;
import com.hello.core.order.Order;
import com.hello.core.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("order = " + order);
    }
}
