import java.util.Scanner;

public class Neon_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        while (square!=0)
        {
            int r=square%10;
            sum=sum+r;
            square=square/10;
        }
        if(num==sum)
        {
            System.out.println("The number is a neon number");
        }
        else{
            System.out.println("The number is not a neon number");
        }

    }
}
