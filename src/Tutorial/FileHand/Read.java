package Tutorial.FileHand;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Read extends FileHand {
    public static void main(String[] args) {
        File myobj = new File("filename.txt");
        try  {
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine())
            {
            String data = myReader.nextLine();
            System.out.println(data);
        }
            myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred ");
            e.printStackTrace();
        }
    }
}
