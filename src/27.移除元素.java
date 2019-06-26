/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i:nums){
            if(i!=val){
                nums[count++]=i;
            }
        }
        return count;
    }
}

// 总结：对于现有数组中做删除操作，可以通过 foreach的形式，对于要返回的变量做控制。
