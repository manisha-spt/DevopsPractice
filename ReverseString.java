//Java program to Reverse a String.
 
import java.util.*;
 
public class ReverseString
{
    public static void main(String args[]){
        String str;
        String rStr;
        Scanner bf=new Scanner(System.in);
         
        //input an integer number
        System.out.print("Enter any string: ");
        str=bf.nextLine();
         
        //Reversing String
        rStr="";
        for(int loop=str.length()-1; loop>=0; loop--)
            rStr= rStr + str.charAt(loop);
         
        System.out.println("Reversed string is: " + rStr);
    }
}r