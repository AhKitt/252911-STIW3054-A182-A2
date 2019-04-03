package com.rtass2.demo;

import java.util.ArrayList;

//Thread-4: Calculate the number of courses from SOC
public class Thread4 implements Runnable{
    

    public void run(){
        try{
            ExtractData ex = new ExtractData();
            ArrayList<String> course = ex.course();   
            ArrayList<String> SOC = new ArrayList<String>(); 

            for (int i=0; i<course.size(); i++) {
                if(course.get(i).contains("STIW")|| course.get(i).contains("STIA")|| course.get(i).contains("STQM")||
                   course.get(i).contains("STID")|| course.get(i).contains("STIJ")|| course.get(i).contains("STIX")|| 
                   course.get(i).contains("STIN")|| course.get(i).contains("STQS")|| course.get(i).contains("STIK1")|| 
                   course.get(i).contains("STIK2")|| course.get(i).contains("STIK3")){
                    String soc = course.get(i).replaceAll(",", "   ");
                    SOC.add(soc);
                }
            } 

            System.out.println(Thread.currentThread().getName() + " Number of Courses from SOC: " + SOC.size());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}