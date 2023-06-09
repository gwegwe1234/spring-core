package com.hello.core.discount;

import com.hello.core.member.Member;
import org.springframework.stereotype.Component;

import static com.hello.core.member.Grade.VIP;

@Component
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
