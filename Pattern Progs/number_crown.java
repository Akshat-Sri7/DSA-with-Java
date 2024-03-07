import java.util.Scanner;

public class number_crown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();
        int spaces = 2*(N-1);
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }
}
