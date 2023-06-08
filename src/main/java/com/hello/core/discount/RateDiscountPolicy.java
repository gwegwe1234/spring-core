package com.hello.core.discount;

import com.hello.core.memeber.Member;

import static com.hello.core.memeber.Grade.VIP;

public class RateDiscountPolicy implements DiscountPolicy {

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}