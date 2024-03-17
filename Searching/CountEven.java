import java.math.*;
public class CountEven {
    public static void main(String[] args) {
        int []arr = {3561, 67, 3489, 5609, 123};
        System.out.println(digit(arr[2]));
    }
    static int even(int []arr){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
           if(count(arr[i]) % 2 == 0)
               flag++;
        }
        return flag;
    }
    static int count(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    static int digit(int num){
        return (int)(Math.log10(num)) + 1;
    }
}
