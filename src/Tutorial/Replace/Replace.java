package Tutorial.Replace;

public class Replace {
    public static void main(String[] args) {
        String str = "J!#&0A*&V<>A()co%d#e";
        String result = "";
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)>64 && str.charAt(i)<=122 ){
                result = result + str.charAt(i);


            }
        }
        System.out.println(result);

    }
}
