import java.util.Scanner;

public class inv_star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();
        for(int i = N-1; i >= 0; i--){
            for(int j = 0; j<= N-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 2*i+1; j > 0; j--){
                System.out.print("*");
            }
            for(int j = 0; j<= N-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
