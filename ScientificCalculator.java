// Importing Scanner class for user input
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[]args)
    {
        Scanner enter=new Scanner(System.in);
        while (true){
        System.out.println("====SCIENTIFIC CALCULATOR===");

        System.out.println("");
        System.out.println("CHOOSE THE OPERATOR");
        System.out.println("");
        System.out.println("1) Addition (+)");
        System.out.println("2) Subtraction (-)");
        System.out.println("3) Multiplication (*)");
        System.out.println("4) Division (/)");
        System.out.println("5) Percentage (%)");
        System.out.println("6) Square root (√x)");
        System.out.println("7) Power  (x^y)");
        System.out.println("8) log (base 10) ");
        System.out.println("9) sin ");
        System.out.println("10) cos");
        System.out.println("11) tan");
        System.out.println("12) Modulus");
        System.out.println("13) Cube Root (x³)");
        System.out.println("14) Factorial (n!) ");
        System.out.println("15) Exponential (e^x)");
        System.out.println("16) Natural Log (ln)");
        System.out.println("0) exiting Caculator........");
        
        System.out.println("enter your choice ");
        int choice = enter.nextInt();
        double num1=0;
        double num2=0;
        double result=0;
        

        //switch case for different operators
        if (choice==0){
            System.out.println("exit calculator");
            break;
        }
      
      
        switch (choice)
        {
            case 1 :
                System.out.println("enter the two numbers");
                  num1 =enter.nextDouble();
                  num2 =enter.nextDouble();
                 result = (num1+num2);
                 break;
            
            case 2:
                System.out.println("enter the two numbers");
                  num1 =enter.nextDouble();
                  num2 =enter.nextDouble();
                result=(num1-num2);
                 break;
            
             case 3:
                System.out.println("enter the two numbers");
                  num1 =enter.nextDouble();
                  num2 =enter.nextDouble();
                 result=(num1*num2);
                 break;
            

             case 4:
                System.out.println("enter the two numbers");
                  num1 =enter.nextDouble();
                  num2 =enter.nextDouble();
                  if(num2==0){
                  System.out.println("error:cannot divide by 0");
                  break;
              }
              else {
                result=num1/num2;
              }
              continue;
                  case 5:
                System.out.println("enter the total numbers");
                  num1 =enter.nextDouble();
                    System.out.println("enter obtained numbers");
                  num2 =enter.nextDouble();
                 result= (num2/num1)*100;
                 break;
            
             case 6:
                System.out.println("enter the  number");
                  num1 =enter.nextDouble();
                 result = Math.sqrt(num1);
                 break;
            
             case 7:
                System.out.println("enter the base number");
                  num1 =enter.nextDouble();
                  System.out.println("enter the power");
                  num2 =enter.nextDouble();
                    result= Math.pow(num1, num2);
                 break;
            
             case 8:
                System.out.println("enter the  number");
                  num1 =enter.nextDouble();
                 result= Math.log10(num1);
                 break;
            
             case 9:
                System.out.println("enter the  angle  (degree)");
                  num1 =enter.nextDouble();
                 result= Math.sin(Math.toRadians(num1));
                 break;
            
             case 10:
                System.out.println("enter the  angle (degrees)");
                  num1 =enter.nextDouble();
                 result= Math.cos(Math.toRadians(num1));
                 break;
            
             case 11:
                System.out.println("enter the  angle (degree)");
                  num1 =enter.nextDouble();
                 result= Math.tan(Math.toRadians(num1));
                 break;
            case 12:
            System.out.println("Enter two numbers");
            num1=enter.nextDouble();
            num2=enter.nextDouble();
            result=num1%num2;
            break;

            case 13:
            System.out.println("enter the number");
            num1=enter.nextDouble();
            result=Math.cbrt(num1);
            break;

            case 14:
            System.out.print("Enter an integer number: ");
            int n = enter.nextInt();
           long fact = 1;
                          // Factorial logic using for loop
           for (int i = 1; i <= n; i++) {
           fact *= i;
           }
           System.out.println("Factorial = " + fact);
             continue;
          
             case 15:
             System.out.println("enter the number");
             num1=enter.nextDouble();
             result=Math.exp(num1);
             break;

             case 16:
             System.out.println("enter the number");
             num1=enter.nextDouble();

             if (num1<=0){
              System.out.println("error:undefined");
              continue;
                        }
             else {
             result=Math.log(num1);
            }
            break;


             default:
            System.out.println("error invalid input");
                continue;
        }
        
            System.out.println("------");
            System.out.println("result = "+ result);
            System.out.println("------");
      }
      enter.close();            
    }
      }



