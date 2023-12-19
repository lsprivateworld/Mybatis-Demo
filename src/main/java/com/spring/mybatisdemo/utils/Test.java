package com.spring.mybatisdemo.utils;

public class Test {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));

        Test test = new Test();
        test.method();
    }

    public static int fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int result = 1;
        int pre = 1;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = result;
            result = result + pre;
            pre = temp;
        }
        return result;
    }

    public  synchronized void method() {
        System.out.println("1");
        new Thread(() -> { method();
        }).start();
    }
}
