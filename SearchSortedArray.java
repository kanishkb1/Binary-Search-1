// Time Complexity : O(log n) (binary search approach) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: As in the question, it has been given that the array is sorted array. We know that atleast one side is sorted and searching in various ranges, we have located the index of target. 


class Solution {
    public int search(int[] nums, int target) {

        //Using binary search algorithm 
        int low=0;
        int high=nums.length -1;
        int mid;

        while (low <= high){
            mid = low + (high- low) / 2;

            //check for the mid as target value
            if(nums[mid]==target)
                return mid;
            
            //for the range between low to mid
            else if (nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] > target){
                    high = mid - 1;
                }
                else{
                    low = mid +1;
                }
            }

            //for the range between mid to high
            else{
                if (nums[mid] <= target && nums[high] >= target){
                    low = mid +1;
                }
                else{
                    high = mid - 1;
                }
            }
            
        }
        //in case, target not found
        return -1;
    }