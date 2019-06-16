/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (31.86%)
 * Total Accepted:    99K
 * Total Submissions: 308.6K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        int y = Math.abs(x);
        for(int yu =0,count=0 ,shang =y; shang>0;)
        {
            yu = shang%10;
            if(count==0)
            {
                if (yu>0)
                    sb.append(yu);
            }
            else
            sb.append(yu);
            count++;
            shang = shang/10;

        }
        int result=0;
        if (!"".equals(sb.toString())) {
            result= Integer.parseInt(sb.toString());
        }
         
        if(x<0)
            result *=-1;
        // System.out.println(result);
        return result;
    }
}

// 