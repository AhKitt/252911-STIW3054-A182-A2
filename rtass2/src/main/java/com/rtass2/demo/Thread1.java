package com.rtass2.demo;


import java.util.ArrayList;

//Thread-1: Calculate the total number of courses.
public class Thread1 implements Runnable{

    public void run(){
        try{
            ExtractData ex = new ExtractData();
            ArrayList<String> course = ex.course();    

            System.out.println(Thread.currentThread().getName() + " Total Number of Courses: " + course.size());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}