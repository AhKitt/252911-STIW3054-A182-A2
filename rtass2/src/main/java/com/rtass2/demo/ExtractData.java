package com.rtass2.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class ExtractData
{

    public ExtractData(){}

    public ArrayList<String> course() throws IOException
    {
        ArrayList<String> course = new ArrayList<String>();
        //Get scanner instance
        Scanner scan = new Scanner(new File("D:\\Documents\\UUM\\Sem 4\\Real-time Programming\\STIW3054\\rtass2\\Ass2pdf.csv"));
         
        //Set the delimiter used in file
        scan.useDelimiter("[;\n]");
        String word= " ";
        

        while(scan.hasNext())
        {
            word=scan.next();
            if(!word.contains("BIL.")){
                if(!word.contains("CODE")){
                    if(!word.contains("COURSE")){
                        if(!word.contains("DATE/TIME")){
                            course.add(word);//add only data not include (BIL. , CODE , COURSE ,DATE/TIME)
                        }
                    }
                }
            }
        }
        scan.close();
        return course;
    }
}
