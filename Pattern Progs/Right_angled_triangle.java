import java.util.Scanner;

public class Right_angled_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
