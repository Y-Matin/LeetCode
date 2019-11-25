/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {
    // solution1:采用递归的方式，不停地计算，直到剩余的个数为0，算一种方式。
    public int climbStairs(int n) {
        int result=0;
        result = count(result,n);
        return result;
    }
    public int count( int result,int n)
    {
        if(n==0){
            result+=1;
            return result;
        }
        else{
            if(n>=2)
            {
                result = count(result,n-2);
                result = count(result,n-1);
            }
            else {
                result=count(result,n-1);
            }
            return result;
        }
    }

    // solution2:采用累积的方式，
    // 上面那种，每种方式太过详细，可以将每种方式的具体分配表示出来，
    // 对于本题，没有必要，本题只需要计算总的方式.
    // 因此采用累积和的计算方式，
    // 思想如下：将n看为长度为n的整形数组，将nums[0]初始化为0;nums[1]的值初始化为1;
    // 这样nums[i]的方法总数 = nums[i-1]+nums[i-2]. 
    public int climbStairs_2(int n) {
        if(n == 0 || n == 1 || n == 2){return n;}
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for(int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n-1];
    }
}

