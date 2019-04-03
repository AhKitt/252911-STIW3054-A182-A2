package com.rtass2.demo;

import java.util.Date;
import java.text.SimpleDateFormat;

//Thread-2: Calculate the total number of days.
class Thread2 implements Runnable{

      public void run(){
            //Exam = 25/05/2019 ~ 20/06/2019
            //Holiday = 03/06/2019 ~ 11/6/2019

            SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
            String startExam = "25/05/2019";
            String endExam = "20/06/2019";
            String startHoli = "03/06/2019";
            String endHoli = "11/6/2019";

            try{
                  Date startEx = myFormat.parse(startExam);
                  Date endEx = myFormat.parse(endExam);
                  long differenceEx = endEx.getTime() - startEx.getTime();
                  float daysBetweenEx = (differenceEx / (1000*60*60*24));

                  Date startHo = myFormat.parse(startHoli);
                  Date endHo = myFormat.parse(endHoli);
                  long differenceHoli = endHo.getTime() - startHo.getTime();
                  float daysBetweenHoli = (differenceHoli / (1000*60*60*24));

                  float daysBetween = daysBetweenEx - daysBetweenHoli;
 
                  System.out.printf(Thread.currentThread().getName() + " Total Exam Days: %.0f Days\n", daysBetween);
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}