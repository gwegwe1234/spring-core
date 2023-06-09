package com.hello.core.discount;

import com.hello.core.annotation.MainDiscountPolicy;
import com.hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static com.hello.core.member.Grade.VIP;

@Component
@MainDiscountPolicy
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
