public class BinarySearch {
    public static void main (String[] args){
        int[] arr = new int[7];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        printArr(arr);
        int result = search(arr, 2);
        System.out.println("We found the target at: " + result);
    }

    public static void printArr(int[] arr){
        for (int a = 0; a < arr.length; a++) {
            if (a == arr.length-1) {
                System.out.println(arr[a] + "]");
            } else if (a == 0){
                System.out.print("[" + arr[a] + ",");
            }
            else {
                System.out.print(arr[a] + ",");
            }
        }
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        boolean resultFound = false;
        int midIndex = 0;
        while (low != high){
            midIndex = (low + high)/2;
            if (nums[midIndex] == target){
                resultFound = true;
                return midIndex;
            } else {
                if (target < nums[midIndex]){
                    high = midIndex;
                } else if (target > nums[midIndex]){
                    low = midIndex + 1;
                }
            }
        }
        if (resultFound == true) {
            return nums[midIndex];
        } else {
            return -1;
        }
    }
}
