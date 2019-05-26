package com.hui.demo.SnowFlakeId;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 21:41 2019\5\26 0026
 */
public class IdTest {

    public static void main(String[] args){
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0,0);
        for (int i=0; i<=2000; i++){
            long id = snowflakeIdWorker.nextId();
            System.out.println("id = " + String.valueOf(id));
            System.out.println("id String = " + Long.toBinaryString(id));
        }

    }
}
