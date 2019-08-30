package se.lexicon;

import com.sun.deploy.security.SelectableSecurityManager;
import jdk.nashorn.internal.ir.CallNode;

import java.util.Arrays;
import java.util.Scanner;


public class App
{

    public static void main( String[] args )
    {
       Scanner scanner= new Scanner(System.in);

        // A simple calculator program + Java test for 8 cases
       boolean Loop=true;
       while (Loop){

           System.out.println("Enter first number");
           double number1 = scanner.nextDouble();

           System.out.println("Enter operator");
           char opr = scanner.next().charAt(0);

           System.out.println("Enter second number");
           double number2 = scanner.nextDouble();
           double result = 0;

           switch (opr) {
               case '+':
                   result = add(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               case '-':
                   result = sub(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               case '*':
                   result = mult(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;

               case '/':
                   result = div(number1, number2);
                   System.out.println(number1 + "" + opr + number2 + "= " + result);
                   break;
               default:
                   System.out.println(opr + "operator is not supported");
           }

           System.out.println("Press 1 to exit and 2 to continue");

           int input=scanner.nextInt();
         if (input ==1) {
             Loop = false;
         }
         else {
             continue;
         }
       }//End loop

        // Method overloding
        double array_num[]={43, 5, 23, 17, 2, 14};
        System.out.println("-----------Method overloading--------------");
        System.out.println("The sum of array elements "+ Arrays.toString(array_num)+"= "+add(array_num));
        System.out.println("The subtraction of array elements "+ Arrays.toString(array_num)+"= "+sub(array_num));

        //

    } // End of main

    public static double add(double number1, double number2 )
    {
        return number1+number2;
    }
    public static double add(double[] array_num){
        double sum=0;
        for (int i=0; i<array_num.length;i++){
            sum=sum+array_num[i];
        }
        return sum;
    }
    public static double sub(double number1, double number2 )
    {
        return number1-number2;
    }
    public static double sub(double[] array_num){
        double sub=0;
        for (int i=1; i<array_num.length;i++){
            sub=sub+(array_num[i]-array_num[i-1]);
        }
        return sub;
    }
    public static double mult(double number1, double number2 ){
        return number1*number2;
    }
    public static double div(double number1, double number2 ) {
        if (number2 == 0) {
            System.out.println("NAN");
            return Double.POSITIVE_INFINITY;
        }
            return number1 / number2;
    }

}//End of App


