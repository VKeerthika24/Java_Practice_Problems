import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower number");
        num1=sc.nextInt();
        System.out.println("Enter the higher number");
        num2=sc.nextInt();

        for(int i=num1;i<num2;i++)
        {
            int r,sum=0,num;
            num=i;
            while(num!=0)
            {
                r=num%10;
                sum=sum+(int)Math.pow(r,3);
                num=num/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }

        }

    }
}
