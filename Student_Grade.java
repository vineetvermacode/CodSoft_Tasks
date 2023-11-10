package Codsoft.Student_Grade_Calculator;

import java.util.Scanner;

public class Student_Grade {
    public String grade(int avg){
        switch (avg/10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C+";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount of subject: ");
        int nos=sc.nextInt();
        int tmarks=0;
        for(int i=0;i<nos;i++){
            System.out.println("Enter the marks optained in "+(i+1)+"st subject: ");
            int marks=sc.nextInt();
            tmarks+=marks;
        }
        int avg=tmarks/nos;
        Student_Grade s=new Student_Grade();
        String grade=s.grade(avg);
        System.out.println("Total marks obtained: "+tmarks);
        System.out.println("Percentage marks obtained: "+avg+"%");
        System.out.println("Grade obtained: "+grade);


    }
}
