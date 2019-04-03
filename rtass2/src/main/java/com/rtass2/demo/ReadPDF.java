package com.rtass2.demo;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.io.File;
import java.util.*;

public class ReadPDF implements Runnable{

    public void run(){
        try{
            PDDocument doc = PDDocument.load(new File("D:\\Documents\\UUM\\Sem 4\\Real-time Programming\\STIW3054\\rtass2\\Ass2pdf.pdf"));
            doc.getClass();
            if(!doc.isEncrypted()){
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(doc);

                Scanner scan = new Scanner(pdfFileInText);
                String word= "";   
                System.out.println("Reading PDF File...");
                Thread.sleep(2000); 
                System.out.println("Analyzing Data...");
                Thread.sleep(2000);
                System.out.println("");

                while (scan.hasNextLine()){
                    word = scan.nextLine();
                }
                scan.close();
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}