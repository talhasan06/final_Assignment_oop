package B;

public class ArrayList {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            numberCheck(arr,5);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    static void numberCheck(int arr[],int num) throws ElementNotFoundException, ArrayNotInitializeException {

        boolean found=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==num){
                found=true;
            }
        }
        if(arr==null){
            throw new ArrayNotInitializeException("Array is empty");
        }
        if(!found){
            throw new ElementNotFoundException("number not found");
        }
    }

}
