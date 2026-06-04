class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int last = n-1;
        while(numbers[start]+numbers[last] != target){
            if(numbers[start]+numbers[last]>target){
                last--;
            }
            if(numbers[start]+numbers[last]<target){
                start++;
            }
        }
        int arr[] = new int[2];
        arr[0] = start+1;
        arr[1] = last+1;
        return arr;
    }
}
