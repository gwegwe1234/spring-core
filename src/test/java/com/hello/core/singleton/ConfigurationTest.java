package com.hello.core.singleton;

import com.hello.core.config.AppConfig;
import com.hello.core.member.MemberServiceImpl;
import com.hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

    @Test
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = ac.getBean(MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean(OrderServiceImpl.class);

        Assertions.assertThat(memberService.getMemberRepository()).isEqualTo(orderService.getMemberRepository());
    }

    @Test
    void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        // com.hello.core.config.AppConfig$$EnhancerBySpringCGLIB$$1fedc220@158a3b2e
        System.out.println(bean);
    }
}
