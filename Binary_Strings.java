public class Binary_Strings {
    public static void main(String[] args) {
        String str1="1001";
        String str2="1111";
        addBinary(str1, str2);
        System.out.println("The sum of two binary string is "+addBinary(str1, str2));

    }
    public static String addBinary(String str1, String str2){
        int a=Integer.parseInt(str1,2);
        int b=Integer.parseInt(str2,2);
        int c=a+b;
        String res=Integer.toBinaryString(c);
        return res;
    }
}
