// Fibonacci Series
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int num=input.nextInt();
        int first=0;
        int second=1;
        System.out.println("Fibonacci Series for the given number of terms:");
        for(int i=1;i<=num;i++)
        {
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;
        }

    }
}