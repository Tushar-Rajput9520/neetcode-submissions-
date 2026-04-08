class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // get pivot index
            quickSort(arr, low, pi - 1);        // sort left subarray
            quickSort(arr, pi + 1, high);       // sort right subarray
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // index for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
