import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        int flag=0;
        if(n==0 || n==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else{
            for(int i=2;i<m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }


            }
            if(flag==0)
            {
                System.out.println(n+" is a prime number");
            }

        }
    }

}
