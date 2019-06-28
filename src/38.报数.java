/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
class Solution {
    public String countAndSay(int n) {
        String result ="1";
        result=count(result,n-1); 
        return result;
    }

    String count(String result,int n){
        if(n==0)
        {
            return result;
        }
        else{
            StringBuffer sBuffer = new StringBuffer();
            // sameCount初始化为0 ，因为 字符串从0开始遍历，因此第一个字符的sameCount要减一。
            int sameCount=0,previe=0;
            for(int j=0;j<result.length();j++){
              

                if(result.charAt(j)==(result.charAt(previe))){
                    sameCount++;
                }
                else{
                    sBuffer.append(""+sameCount+result.charAt(previe));
                    // sameCount初始化为1，表示当前已存在一个该字符。
                    sameCount=1;
                    previe=j;

                }
                // 当到达字符串末尾时，再计算结果。
                if(j==result.length()-1){
                    sBuffer.append(""+sameCount+result.charAt(previe));
                }
            }
            n--;
            return count(sBuffer.toString(),n);
        }
       
    }

    // 存在改进的地方：比较时，没有必要把 char型转换为 int 比较，比较 只是为了比较他们是否相等，并不是为了比较大小，所以转为int，
}

