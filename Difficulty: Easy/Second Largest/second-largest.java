class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {

            // update largest and second largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            // update only second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}