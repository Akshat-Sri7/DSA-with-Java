import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int [][]arr = {
                {23, 56, 89},
                {313, 45, 78, 87},
                {67, 4, 12, 90, 35, 80}
        };
        int target = 35;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target)
                    return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
}
