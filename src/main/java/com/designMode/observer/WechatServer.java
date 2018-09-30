package com.designMode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ex_xuhaichuan
 */
public class WechatServer implements Observerable {
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        list.forEach(e -> e.update(message));
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
