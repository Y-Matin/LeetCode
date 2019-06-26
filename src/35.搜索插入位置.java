/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */
class Solution {

    // solution1: 依次遍历，直到遇到大于等于目标值的 数组下标。
    // public int searchInsert(int[] nums, int target) {
    //     if(nums.length==0)
    //         return 0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]>=target)
    //         {
    //             return i;
    //         }
    //     }
    //     return nums.length;
    // }

    // solution2:因为该数组有序，为了减少比较次数，可以使用二分查找法。快捷
    public int searchInsert(int[] nums, int target) {
        int begin=0,end =nums.length-1;
        for(int mid=0;begin<=end;)
        {
            mid=(begin+end)/2;
            if(nums[mid]<target)
            {
                begin=mid+1;
            }
            else if(nums[mid]<target){
                return mid;
            }
            else {
                end=mid-1;
            }
            
        }
        return begin;
    }
}

