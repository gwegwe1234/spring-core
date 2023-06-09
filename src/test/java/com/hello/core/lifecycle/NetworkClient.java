package com.hello.core.lifecycle;

public class NetworkClient {

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

    public void init() throws Exception {
        System.out.println("Network Client init");
        connect();
        call("초기화 연결 메세지");
    }

    public void close() throws Exception {
        System.out.println("Network Client close");
        disconnect();
    }
}
