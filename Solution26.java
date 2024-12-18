class Solution26 {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[currentIndex - 1] < nums[i]){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }
}