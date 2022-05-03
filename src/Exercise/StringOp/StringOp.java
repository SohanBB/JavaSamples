package Exercise.StringOp;

import java.util.Scanner;

public class StringOp {
    public static void removeDuplicate(String str){
        int count;
        char []strA = str.toCharArray();
        for (int i = 0; i <= strA.length-1 ; i++) {
            count=1;
            for (int j = i+1; j <= strA.length-1 ; j++) {
                if(strA[i]==strA[j]){
                    count++;
                    strA[j]=0;
                }
            }
            if(count>1){
                System.out.print(strA[i]);
            }
        }

        }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        StringOp.removeDuplicate(str);

    }
}
