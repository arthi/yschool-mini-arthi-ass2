/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ymini.arthika.modelClasses;

import java.util.ArrayList;

/**
 *
 * @author Arththika
 */
public class SearchStudents {

    
    private static ArrayList <Students> students = new ArrayList();
    
    public SearchStudents() {               
        
	Students st1=new Students("Arthi","1","Paramanathan","Jaffna");
        Students st2=new Students("Mekala","2","Uthayasooriyan","Vavuniya");
        Students st3=new Students("Kiruthika","3","Ranjan","Vavuniya");
        Students st4=new Students("Jeevitha","4","Ponnambalam","Jaffna");
        Students st5=new Students("Diluxana","5","Sebamalai","Mannar");
        Students st6=new Students("Nishanth","6","Veemarasan","Trincomalee");
        Students st7=new Students("Sarvananthy","7","Gnanantha","Jaffna");
        Students st8=new Students("Shakila","8","Sivagnanarajah","Mallakam");
        Students st9=new Students("Priya","9","Vijayavel","Araly");
        Students st10=new Students("Paheerathy","10","Yohananthan","Jaffna");

		
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);
    }
    
	public Students findStudent(String name,String grade){
      
	Students st=null;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getStudentname().equals(name) && students.get(i).getGrade().equals(grade)){				
			st=students.get(i);
	}
			
        }
        return st;
        
    }
       
    
}

    

