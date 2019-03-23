package test;

public class Test
{
    public static void main(String[] args) {
        Test t = new Test();
        String str1 = t.reversalInt(-123);
        String str2 = t.reversalInt(+123);
        System.out.println(str1);
        System.out.println(str2);

    }

    public String reversalInt(int n){
        String str = String.valueOf(n);
        return str;
    }
}