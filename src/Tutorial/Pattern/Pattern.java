package Tutorial.Pattern;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("RIGHT TRIANGLE PATTERN");
        int i,j,k;
       int r= 5;
        for ( i = 1; i<r;i++) {
            for (j =1;j<=i;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("Decreasing TRIANGLE");
        for (i=1;i<=r;i++){
            for(j=i;j<=r;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID PATTERN");
        for (i=0; i<r; i++)
        {
            for (j=r-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("DIAMOND PATTERN ");
        for (i=0; i<r; i++)
        {
            for (j=r-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (i=0; i<r; i++)
        {
            for (j=r-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
            for (i=0;i<r-1;i++){
                for(j=0;j<i;j++){
                    System.out.print("");
                }
                for(k=0;k<r-1-i;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}
