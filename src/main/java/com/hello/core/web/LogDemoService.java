package com.hello.core.web;

import com.hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String testId) {
        myLogger.log("ServiceId = " + testId);
    }
}
