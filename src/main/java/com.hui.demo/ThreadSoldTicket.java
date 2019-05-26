package com.hui.demo;

/**
 * @Author: CarlChen
 * @Despriction: 使用同步函数售100张门票
 * @Date: Create in 20:48 2019\3\6 0006
 */
public class ThreadSoldTicket {

    public static void main(String[] args){

        ThreadTest threadTest = new ThreadTest();

        Thread thread1 = new Thread(threadTest);
        thread1.setName("thread1");
        Thread thread2 = new Thread(threadTest);
        thread2.setName("thread2");
        Thread thread3 = new Thread(threadTest);
        thread3.setName("thread3");

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class ThreadTest implements Runnable{

    TicketNums ticketNums = new TicketNums();

    @Override
    public void run() {
        while(true){
            delTicketNums();
            if (ticketNums.getTicketNums() <= 0){
                System.out.println("ticketNums is sold all -----");
                return;
            }
        }
    }

   private synchronized void delTicketNums(){
       int ticketLeaveNum = this.ticketNums.getTicketNums();
        if (ticketLeaveNum > 0){
            ticketLeaveNum--;
            this.ticketNums.setTicketNums(ticketLeaveNum);
            System.out.println("ticketNums leaves num -----" + ticketLeaveNum);
        }
   }
}

class TicketNums{

    private int ticketNums = 100;

    public int getTicketNums() {
        return ticketNums;
    }

    public void setTicketNums(int ticketNums) {
        this.ticketNums = ticketNums;
    }

}
