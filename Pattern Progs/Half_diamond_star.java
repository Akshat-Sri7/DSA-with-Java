import java.util.Scanner;

public class Half_diamond_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();
//        for(int i = 1; i <= N-1; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < N; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//        for(int i = N-1; i > 0; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=2*N-1;i++){
            int stars = i;

            // for the second half of the rotated triangle.
            if(i>N) stars = 2*N-i;

            // for printing the stars in each row.
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
