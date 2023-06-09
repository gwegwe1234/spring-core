package com.hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 url : " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message: " + message);
    }

    public void disconnect() {
        System.out.println("close : " + url);
    }

    // 의존관계가 다 끝나고 실행하는 작업
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Network Client afterPropertiesSet");
        connect();
        call("초기화 연결 메세지");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Network Client destroy");
        disconnect();
    }
}
