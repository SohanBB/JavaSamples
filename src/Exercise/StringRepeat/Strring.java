package Exercise.String;

public class Strring {
    public static void main(String[] args) {
        String str = "hello";
        int count;
        char string[]=str.toCharArray();
        for (int i = 0;i<str.length();i++){
            count =1;
            for(int j=i+1;j<str.length();j++){
                if(string[i] == string[j]){
                    count++;
                    string[j]=0;

                }

            }
            
        }
    }
        }


