package Ques2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionDemo obj=new ExceptionDemo();
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        int work_experience=input.nextInt();
        try{
            obj.UserCheck(age,work_experience);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
