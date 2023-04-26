package Ques4_B;
interface Vehicle{
    void fuelType();
}

public class Spring {
    public static void main(String[] args) {
        Vehicle cng=new Vehicle(){
            public void fuelType(){
                System.out.println("Uses LPG");
            }
        };

        Vehicle airplane=new Vehicle(){
            public void fuelType(){
                System.out.println("Uses Jet Fuel");
            }
        };

        cng.fuelType();
        airplane.fuelType();
    }
}
