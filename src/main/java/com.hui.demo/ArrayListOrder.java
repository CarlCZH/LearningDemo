package com.hui.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: CarlChen
 * @Despriction: 将User对象放入collections中，并根据user对象中age排序
 * @Date: Create in 17:13 2019\3\5 0005
 */
public class ArrayListOrder {

    public static void main(String[] args){
        List<User> listInit = new ArrayList<>();

        User user1 = new User("zhangsan", 25);
        User user2 = new User("lisi", 22);
        User user3 = new User("wangwu", 27);
        User user4 = new User("xiaojiu", 21);
        User user5 = new User("aibai", 23);

        listInit.add(user1);listInit.add(user2);listInit.add(user3);listInit.add(user4);listInit.add(user5);

        Collections.sort(listInit, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int age1 = o1.getAge();
                int age2 = o2.getAge();
                return age1 - age2;
            }
        });

        for (User user : listInit){
            System.out.println(user.toString());
        }

        //test---------------------------------------------
        List<String> listTest = new ArrayList<>();
        listTest.add("Hui");
        listTest.add("Zhong");
        listTest.add("Chen");

       System.out.println("listTestInit-----" + listTest);

        Collections.sort(listTest, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /**
                 * 升序排的话就是第一个参数.compareTo(第二个参数);
                 * 降序排的话就是第二个参数.compareTo(第一个参数);
                 */
                char one = o1.charAt(0);
                char two = o2.charAt(0);
                return one - two;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        System.out.println("listTestAfterHandler-----" + listTest);
        //----------------------------------------------end
    }
}


class User{

    private String uername;

    private int age;

    public User(String uername, int age) {
        this.uername = uername;
        this.age = age;
    }

    public String getUername() {
        return uername;
    }

    public void setUername(String uername) {
        this.uername = uername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uername='" + uername + '\'' +
                ", age=" + age +
                '}';
    }
}

