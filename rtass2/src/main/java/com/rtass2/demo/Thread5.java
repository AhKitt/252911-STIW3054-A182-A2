package com.rtass2.demo;

import java.util.ArrayList;

//Thread-5: Display the information of STIW3054 (Bil, Code, Course, date and time).
public class Thread5 implements Runnable{

    public void run(){
        try{
            ExtractData ex = new ExtractData();
            ArrayList<String> course = ex.course();
            for (int i=0; i<course.size(); i++) {
                if(course.get(i).contains("STIW3054")){
                    String stiw3054 = course.get(i).replaceAll(",", "   ");
                    System.out.println(Thread.currentThread().getName() + " Information (STIW3054): \n" + stiw3054);
                }
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}