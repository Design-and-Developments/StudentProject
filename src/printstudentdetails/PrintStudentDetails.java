/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

import java.util.Scanner;

/**
 *
 * @author Kirandeep Kaur
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] list = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("peter");
        s1.setSid(23);
        s2.setName("john");
        s2.setSid(23);
        s3.setName("tarun");
        s3.setSid(23);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " "+list[i].getSid());
        }
    }
    
}
