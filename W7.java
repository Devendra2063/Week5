import java.util.*;

/**
 * Write a description of class W7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W7
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        
        char choice ='y';
        while (choice=='Y'|| choice=='y')
        {
        System.out.println("Enter two numbers");
        double first=s.nextDouble();
        double second=s.nextDouble();
        
        System.out.println("Enter an operator(+,-,*,/):");
        char operator=s.next().charAt(0);
        
        double result=0;
        
        switch(operator)
        {
            case '+':
                result=first+second;
                break;
            
            case '-':
                result=first-second;
                break;
            
            case '*':
                result=first*second;
                break;
        
            case '/':
                result=first/second;
                break;
            
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println(first+" "+operator+" "+second+":\n "+result);
        System.out.println("Do you want to continue ??");
        choice=s.next().charAt(0);
        System.out.println("You have existed");
        }
    }
}
