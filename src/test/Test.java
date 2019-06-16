package test;

public class Test
{
    public static void main(String[] args) {
        Test t = new Test();
        int str1 = t.reverse(1534236469);
        int str2 = t.reverse(+123);
        System.out.println(str1);
        System.out.println(str2);

    }
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
            result= Integer.parseInt(sb.toString().trim());
        }
         
        if(x<0)
            result *=-1;
         System.out.println(result);
        return result;
    }

}