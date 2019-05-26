package com.hui.demo;

public class Test {

//    private static Test instance = new Test();
//    private static int x = 0;
//    private static int y;
//
//
//    private Test() {
//        x++;
//        y++;
//    }
//
//    private static Test getInstance() {
//        return instance;
//    }
//
//    public static void main(String[] args) {
//        Test test = Test.getInstance();
//        System.out.println(Test.x);
//        System.out.println(Test.y);
//    }

    private static Test instance = new Test();
    private static int x = 0;
    private static int y;
    //private static Test instance = new Test();

    private Test() {
        x++;
        y++;
    }

    private static Test getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Test test = Test.getInstance();
        System.out.println(Test.x);
        System.out.println(Test.y);
    }


}
