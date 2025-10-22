//Check Prime Number
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        if (num<=1)
        {
            System.out.println(num+" is not a prime number");
        }
        else
        {
            int i;
            for (i=2;i<num;i++)
            {
                if(num%2==0)
                {
                    System.out.println(num+" is not a prime number");
                    break;
                }
            }
            if(i==num)
            {
                System.out.println(num+" is a prime number");

            }
        }
    }
}

