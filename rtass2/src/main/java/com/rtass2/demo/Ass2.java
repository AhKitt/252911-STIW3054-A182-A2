package com.rtass2.demo;

import java.io.IOException;

public class Ass2{

    public static void main(String[]args) throws IOException{

        try{
            Thread pdf = new Thread(new ReadPDF());
            pdf.start();
            Thread.sleep(2000);
            pdf.join();

            Thread t1 = new Thread(new Thread1(),"Thread 1...");
            t1.start();
            Thread.sleep(2000);
            t1.join();
            Thread t2 = new Thread(new Thread2(),"Thread 2...");
            t2.start();
            Thread.sleep(2000);
            t2.join();
            Thread t4 = new Thread(new Thread4(),"Thread 4...");
            t4.start();
            Thread.sleep(2000);
            t4.join();
            Thread t3 = new Thread(new Thread3(),"Thread 3...");
            t3.start();
            Thread.sleep(2000);
            t3.join();
            Thread t5 = new Thread(new Thread5(),"Thread 5...");
            t5.start();
            Thread.sleep(2000);
            t5.join();
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
