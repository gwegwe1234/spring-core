package com.hello.core.web;

import com.hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoProxyController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

    @RequestMapping("log-demo-proxy")
    @ResponseBody
    public String logDemo(HttpServletRequest httpServletRequest) throws InterruptedException {
        String requestUrl = httpServletRequest.getRequestURL().toString();
        myLogger.setRequestUrl(requestUrl);

        myLogger.log("contorller test");
        Thread.sleep(1000);
        logDemoService.logic("testId");
        System.out.println(myLogger.getClass());
        return "OK";
    }
}
