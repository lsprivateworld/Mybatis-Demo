package com.spring.mybatisdemo.utils;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

public class RedissonClientUtil {

   RedissonClient redisson = Redisson.create();

   RLock lock = redisson.getLock("redisson");

//    try {
//        boolean res = lock.tryLock(3, 10, TimeUnit.SECONDS);
//        if (res) {
//            //do your business
//        }
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    } final {
//        lock.unlock();
//    }
}
