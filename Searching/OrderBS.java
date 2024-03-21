public class OrderBS {
    public static void main(String[] args) {
        int []arr = {2, 5, 7, 11, 15, 45, 57, 78, 81, 90};
        int []descarr = {90, 34, 32, 22, 12, 8, 5, 1};
        int target = 90;
        System.out.println(orderAgnosticBS(arr, target));
        System.out.println(orderAgnosticBS(descarr, target));
    }
    static int orderAgnosticBS(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] > arr[end]){
            while (end >= start){
                int mid = start + (end - start)/2;
                if (target == arr[mid]) {
                    return mid;
                }
                if (target > arr[mid])
                    end = mid - 1 ;
                else
                    start = mid + 1;
            }
            return -1;
        }
        else{
            while (end >= start){
                int mid = start + (end - start)/2;
                if (target == arr[mid]) {
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
}
