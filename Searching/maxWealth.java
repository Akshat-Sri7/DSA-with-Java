// Uses 2D array

public class maxWealth {
    public static void main(String[] args) {
        int [][]arr = {
                {5,1,6},
                {6,3,4},
                {8,0,1}
        };
        System.out.println(maximum(arr));
    }
    static int maximum(int [][]accounts){
        int max = 0;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
