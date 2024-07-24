/*Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element 
appears only once. The relative order of the elements should 
be kept the same. Then return the number of unique elements in nums.*/

class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       int l=0;
       int r=1;
       while(r<n) {
        if(nums[l]==nums[r]) {
            r++;
        } else {
            l++;
            nums[l]=nums[r];
            r++;
        }
       }
       return l+1;
    }
}
