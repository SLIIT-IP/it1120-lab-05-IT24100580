import java.util.Scanner;

  public class IT24100580Lab5Q1
{
  public static void main(String[] args)
 {
   
  int num1,num2,num3,max,min,count;   
   Scanner num= new Scanner(System.in);
   
     System.out.print("Enter the first integer:");
     num1 = num .nextInt();
     
     System.out.print("Enter the second integer:");
     num2 = num .nextInt();
     System.out.print("Enter the third integer:");
     num3 = num .nextInt();
     System.out.print("user entered numbers are : "+num1+" "+num2 +" "+ num3);

     

    max=num1;
    min=num1;
 
      if(num2>max)
       max=num2;
   
   
    if(num3 > max)
      max = num3;

    if(num2 < min)
      min = num2;
    
    if(num3 < min)
      min = num3;  

    System.out.println("The smallest number is : " + min);
    System.out.println("The Largest number is : " + max);
   }
}

