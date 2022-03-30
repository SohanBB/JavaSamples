package Tutorial.FileIO;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String [] names= {"John", "Peter", "Tim"};
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("Hello World!");
            writer.write("\n This is next line.");
            for(String name:names){
                writer.write("\n"+name);
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(reader.readLine());

            }

            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
