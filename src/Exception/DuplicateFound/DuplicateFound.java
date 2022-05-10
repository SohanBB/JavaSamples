package Exception.DuplicateFound;

public class DuplicateFound {
    public static void main(String[] args) throws DuplicateFoundException {
        String str = "Navigate";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++){
                if(str.charAt(i)==str.charAt(j)){
                    //throw new DuplicateFoundException("Duplicate found at index : "+i+", "+j);
                    DuplicateFoundException de = new DuplicateFoundException();
                    throw de;
                }

            }
        }

    }
}
