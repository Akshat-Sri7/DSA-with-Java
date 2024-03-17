public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {2, 5, 7, 11, 15, 45, 57, 78, 81, 90};
        int target = 78;
        System.out.println(linearsearch(arr, target));
    }
    static int linearsearch(int []arr, int target){
        int count = 0;
        if(arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            count += 1;
            if(arr[i] == target) {
                System.out.println(count);
                return i;
            }
        }
        return -1;
    }
}
