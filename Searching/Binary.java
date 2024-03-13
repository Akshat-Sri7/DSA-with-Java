public class Binary {
    public static void main(String[] args) {
        int []arr = {2, 5, 7, 11, 15, 45, 57, 78, 81, 90};
        int target = 2;
        System.out.println(binaryS(arr, target));
    }
    static int binaryS(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while (end >= start){
            count += 1;
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                System.out.println(count);
                return mid;
            }
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
