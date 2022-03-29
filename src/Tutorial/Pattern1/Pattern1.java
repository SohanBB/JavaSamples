package Tutorial.Pattern1;

public class Pattern1 {
    public static void main(String[] args) {
        int r=5;
        int i,j,k;
    for (i=0;i<r;i++){
        for(j=0;j<=r-i;j++){
            System.out.print(" ");
        }
        for(j=i;j>=1;j--){
            System.out.print("* ");
        }
        System.out.println();}
    for(i=0;i<r;i++){
        for(j=0;j<i;j++){
            System.out.print(" ");
        }
        for(k=r-i;k>0;k--){
            System.out.print(" *");
        }
        System.out.println();
    }



    }}
