import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp,res=0,r;
        temp=num;
        while(temp>0)
        {
            r=temp%10;
            res=res+(int)Math.pow(r,3);
            temp/=10;

        }
        if(res==num)
        {
            System.out.println("the number is an armstrong");
        }
        else{
            System.out.println("the number is not an armstrong");
        }
    }
}









