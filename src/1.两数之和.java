import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (45.17%)
 * Total Accepted:    275.2K
 * Total Submissions: 609.4K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 */
// solution 1 ：

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] label = new int[2];
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					label[0] = i;
                    label[1] = j;
                    return label;
				}
			}
        }
        
        return  new int[2];
    }
}

// solution 2：

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map input = new HashMap<>();
//         for(int i = 0;i<nums.length;i++)
//         {
//             input.put( nums[i],i);
//         }
//         for(int j =0; j < nums.length;j++)
//         {
//             int next = target-nums[j];
//             if(input.get(next)!=null&& (int)input.get(next)!=j)
//             {
//                 return new int[]{j, (int) input.get(next) };
//             }
//         }
        
//         return  new int[2];
//     }
// }
/**
 * 解决方案：共两种， 
 *  1.使用for循环 遍历， 两个for循环，复杂度 为n^2 
 *  2.将两个数组的数据存入集合中，如 map 中，使用for循环，依次遍历for循环，通过map提供的函数进行查找，复杂度为 n  
 * 总结：一般采用方法二，空间换时间的做法。
 */
/**
 *
solution1 :
   √ Accepted
  √ 29/29 cases passed (59 ms)
  √ Your runtime beats 23.76 % of java submissions
  √ Your memory usage beats 85.83 % of java submissions (37.6 MB)
solution2:
   √ Accepted
  √ 29/29 cases passed (8 ms)
  √ Your runtime beats 82.58 % of java submissions
  √ Your memory usage beats 45.98 % of java submissions (39.2 MB)
 */
