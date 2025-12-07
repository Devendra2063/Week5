import java.util.*;
import java.util.Scanner;

/**
 * Write a description of class W8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W9
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        System.out.printf("Enter a positive number ");
        int num=s.nextInt();
        int rev=0;
        while (num > 0) {
            int digit = num % 10;      
            rev = rev * 10 + digit; 
            num = num / 10;          
        }

        // Step 3: Display reversed number
        System.out.println("Reversed number: " + rev);
    }
}    