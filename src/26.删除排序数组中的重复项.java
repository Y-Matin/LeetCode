/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {

    // solutio1:依次遍历数组，与前面已知的最大值相比，当前值<=前面的最大值，就从后面取出大于当前最大值并赋值给当前值
    // 依次循环
    public int removeDuplicates(int[] nums) {
        if(nums==null|| nums.length==0)
        {
            return 0;
        }
        int same= 0;
        int temp =nums[0];
        for(int i=1,j=i+1;i<nums.length;i++){
            if(nums[i]<=temp)
            {
                same+=1;
               for( ;j<nums.length;j++)
               {
                   if(nums[j]>temp)
                   {
                       nums[i]=nums[j];
                       temp=nums[i];
                       same-=1;
                       break;
                   }                   
               }
            }
            else{
                temp = nums[i];
            }
        }
        return nums.length-same;
    }

    // solution2：
    // public int removeDuplicates(int[] nums) {
    //     int i = nums.length > 0 ? 1 : 0;
    //     for (int n : nums)
    //         if (n > nums[i-1])
    //             nums[i++] = n;
    //     return i;
    // }
    
}

