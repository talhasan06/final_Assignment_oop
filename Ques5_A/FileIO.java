import java.io.*;
import java.util.ArrayList;

public class FileIO {
    public static void main(String[] args) {


        try {
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("odd.txt"));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("even.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            String text;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split("\n");

                for (int i = 0; i < lines.length; i++) {

                    String[] tokens = lines[i].split(" ");

                    int roll=Integer.parseInt(tokens[2]);
                    if(roll%2==0){
                        list.add(lines[i]);
                    }else{
                        list2.add(lines[i]);
                    }
                }
            }
            reader.close();
            for (int i=0;i<list.size();i++){
                writer2.write(list.get(i)+"\n");
            }
            writer2.close();
            for (int i=0;i<list.size();i++){
                writer1.write(list.get(i)+"\n");
            }
            writer1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}