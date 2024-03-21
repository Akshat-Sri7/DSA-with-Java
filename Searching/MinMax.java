public class MinMax {
    public static void main(String[] args) {
        int []arr = {39, 67, 34, 56, 12};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int []arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans)
                ans = arr[i];
        }
        return ans;
    }
    static int max(int []arr){
        int ans = arr[0];
        for (int j : arr) {
            if (j > ans)
                ans = j;
        }
        return ans;
    }
}
