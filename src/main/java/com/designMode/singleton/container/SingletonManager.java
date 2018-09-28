package com.designMode.singleton.container;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: designMode
 * @Date: 2018/9/28 15:10
 * @Author: ex_xuhaichuan
 * @Description: 容器单例模式
 * Android源码中就用到了这种方式，通过Context获取系统级别的服务（context.getSystemService(key)）。
 */
public class SingletonManager {
    private static Map<String,Object> objectMap = new HashMap<>();
    private SingletonManager(){}
    public static void registerService(String key,Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }
    public static Object getService(String key){
        return objectMap.get(key);
    }
}