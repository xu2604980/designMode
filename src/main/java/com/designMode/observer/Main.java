package com.designMode.observer;

/**
 * @author ex_xuhaichuan
 */
public class Main {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        server.registerObserver(userWang);
        server.registerObserver(userLi);
        server.registerObserver(userZhang);
        server.setInformation("PHP 是世界上最好用的语言！");
        System.out.println("---------------------");
        //ZhangSan取消关注，之后不再会收到消息
        server.removeObserver(userZhang);
        server.setInformation("JAVA 是世界上最好用的语言！");
    }
}
