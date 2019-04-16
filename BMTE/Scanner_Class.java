import java.util.Scanner;
class Scanner_Class{

    public static void main(String[] args)
    {
       /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        int integer_user_input = sc.nextInt();
        System.out.println("Your integer = " + integer_user_input);
        
        sc = new Scanner(System.in);
        System.out.println("Enter String");
        String Str_user_input = sc.nextLine();
        System.out.println("Your String = " + Str_user_input);

        System.out.println("Enter String");
        float float_user_input = sc.nextFloat();
        System.out.println("Your String = " + float_user_input);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer 1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter integer 2 = ");
        int num2 = sc.nextInt();
        System.out.println("The sum is  = " + (num1+num2));
        System.out.println("The difference is  = " + (num1-num2));
        System.out.println("The product is  = " + num1*num2);
        System.out.println("The divide is  = " + num1/num2);
        System.out.println("The Remender is  = " + num1%num2);

        
    }
}