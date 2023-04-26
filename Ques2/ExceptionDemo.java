package Ques2;

public class ExceptionDemo {
    void UserCheck(int age,int work_experience) throws InvalidUserException{
        if(age<50){
            throw new InvalidUserException("Ineligible for Elderly pension because of age");
        }
        if(work_experience<20){
            throw new InvalidUserException("Ineligible for Elderly pension because of work experience");
        }
    }
}
