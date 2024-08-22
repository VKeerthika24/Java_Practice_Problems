public class Odd_Even {
    public static void main(String[] args) {
        int num=800;
        String bin=Integer.toBinaryString(num);
        char res=bin.charAt(bin.length()-1);
        if(res=='0')
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

    }
}
