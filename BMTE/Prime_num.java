import java.util.Scanner;

class Prime_num{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     
        boolean pri = true;

        for (int i = 2 ;i<num/2;i++){
            if (num%i == 0){
                pri = false;
                break;
            }
        }
        if (pri)
            System.out.print(num + " = is prime number");
        else 
            System.out.print(num + " = is not  prime number");
    }
}