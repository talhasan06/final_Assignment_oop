package Ques1;

public class Test {
    static int TestA() {
//        throw new Exception("Exception has been thrown from TestA");
        System.out.println("Don't forget me");
        return 0;
    }
    static void TestB() {
            int a = TestA();
            if (a == 0) {
                System.out.println("Exception in TestB: a is zero.");
            } else {
                System.out.println("You should figure out the value of a: " + a);
//            throw new Exception("Exception from else clause in TestB");
            }
        }
//        return ;
    static boolean TestC(boolean val) throws Exception {
        if(val==false){
            throw new Exception("Exception in TestC");
        }
        return false;
    }
    public static void main(String arges[]){
        try{
            TestC(false);
        }catch(Exception e){
            System.out.println(e);
            try{
                TestB();
            }catch(Exception e1){
                System.out.println(e1);
            }
        }
    }
}

//
//Output:
//        java.lang.Exception: Exception in TestC
//        Don't forget me
//        Exception in TestB: a is zero.
