import java.util.Scanner;

public class inverted_right_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            for(int j = N; j > i; j--){
                System.out.print((N - j) + 1 + " ");
            }
            System.out.println();
        }
    }
}
