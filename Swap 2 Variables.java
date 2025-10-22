// 1.Swap Two Numbers (Using Third Variable)
import java.util.Scanner;
class Main
{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int n1=input.nextInt();
    System.out.println("Enter your second number: ");
    int n2=input.nextInt();
    int temp=n1;
    n1=n2;
    n2=temp;
    System.out.println("After swapping "+ "First number:"+n1+"  Second number:"+n2);
    }
}