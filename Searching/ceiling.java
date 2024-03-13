public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 11, 15, 45, 57, 78, 81, 90};
        int target = 4;
        System.out.println(ceilBS(arr, target));
        System.out.println(floorBS(arr, target));
    }

    static int ceilBS(int[] arr, int target) {
        if (target > arr[arr.length - 1])
            return -1;
        int mid = 0;
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[start];
    }

    static int floorBS(int[] arr, int target) {
        if (target < arr[0])
            return -1;
        int mid = 0;
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[end];
    }
}
