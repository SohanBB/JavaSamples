package Tutorial.Replace;

public class Replace {
    public static void main(String[] args) {
      //  Scanner input = new Scanner(System.in) ;
        //System.out.println("Enter a string with special character: ");
     //   String str = input.nextLine();
        String str = "J!#&0A*&V<>A()co%d#e";
        System.out.println("String with special character : "+str);
        char []string = str.toCharArray();
        System.out.print("String without special character: ");
        for (int i = 0; i < string.length ; i++) {
            if(string[i]>64&&string[i]<123){
                System.out.print(string[i]);
            }
        }
    }
}

