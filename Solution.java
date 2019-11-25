class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int a1=1,n=0;
        if(candies==1)
            return new int[]{1};
        for(double result=0;candies-result>0;)
        {   
            n++;
            result=n*a1+n*(n-1)/2.0;
            
        }
        
        double cha = candies-(n-1)*a1+(n-1)*(n-2)/2.0;
        
        int[] ans =  cha==0?new int[n-1]:new int[n];
        for(int i=0;i<ans.length-1;i++)
        {
            ans[i]=i+1;
        }
        if(cha!=0)
        {
            ans[ans.length-1]=(int)cha;
        }
        return ans;
        
        
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        int[] ans = so.distributeCandies(7,4);
        System.out.println(ans);
    }
}