class Solution {
    public int[] resultArray(int[] nums) {

        int a = nums.length;

        int arr1[] = new int[a];
        int arr2[] = new int[a];
        int arr[] = new int[a];

        int o = 0;
        int p = 0;

        arr1[o] = nums[0];
        o++;

        arr2[p] = nums[1];
        p++;

        for (int i = 2; i < a; i++) {

            if (arr1[o - 1] > arr2[p - 1]) {
                arr1[o] = nums[i];
                o++;
            }
            else {
                arr2[p] = nums[i];
                p++;
            }
        }

        // Copy arr1
        int c = 0;

        for (int i = 0; i < o; i++) {
            arr[c] = arr1[i];
            c++;
        }

        // Copy arr2
        for (int i = 0; i < p; i++) {
            arr[c] = arr2[i];
            c++;
        }

        return arr;
    }
}