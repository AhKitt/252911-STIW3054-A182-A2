package com.rtass2.demo;

import java.util.ArrayList;

//Thread-3: List of courses from SOC.
public class Thread3 implements Runnable{


    public void run(){
        try{
            ExtractData ex = new ExtractData();
            ArrayList<String> course = ex.course();    

            System.out.println(Thread.currentThread().getName() + " List of Courses from SOC: ");
            for (int i=0; i<course.size(); i++) {
                if(course.get(i).contains("STIW")|| course.get(i).contains("STIA")|| course.get(i).contains("STQM")||
                   course.get(i).contains("STID")|| course.get(i).contains("STIJ")|| course.get(i).contains("STIX")|| 
                   course.get(i).contains("STIN")|| course.get(i).contains("STQS")|| course.get(i).contains("STIK1")|| 
                   course.get(i).contains("STIK2")|| course.get(i).contains("STIK3")){
                    String soc = course.get(i).replaceAll(",", "\t");
                    System.out.println(soc);
                    Thread.sleep(2000);
                }
            } 
            System.out.println("");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}