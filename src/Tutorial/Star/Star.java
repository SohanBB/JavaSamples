package Tutorial.Star;

public class Star {
    public static void main(String[] args) {
        int i,j,k;
        int r=5;
        for (i = 1; i <= r; i++) {
            for (j = i; j <= r; j++) {
                System.out.print(" ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("UPSIDE DOWN PYRAMID ");
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<r;j++){
                System.out.print("*");
            }
            for(j=i;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("DIAMOND PATTERN");
        for (i = 1; i < r; i++) {
            for (j = i; j <= r; j++) {
                System.out.print(" ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<r;j++){
                System.out.print("*");
            }
            for(j=i;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
