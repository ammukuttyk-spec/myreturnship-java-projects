// 2.Factorial of a Number
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
         }
    System.out.println("Factorial of "+ num+ " is:"+fact); 
    }   
}