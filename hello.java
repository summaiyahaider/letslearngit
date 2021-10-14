import java.util.Scanner;
public class hello{
public static void main (String args [])
{
    System.out.println("Hello! let's help you perform basic arithmetic operations here!");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first number");
    int a= sc.nextInt();
    System.out.println("Enter the second number");
    int b= sc.nextInt();
    int c=a+b;
    int d=a-b;
    System.out.println("Sum= "+ c);
    System.out.println("Difference= "+ d);
    System.out.println("Product= "+ a*b);
    System.out.println("Quotient= "+ a/b);
    System.out.println("Reaminder= "+ a%b);
}
}