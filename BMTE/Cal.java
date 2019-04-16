
class Cal{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        int ans = num1 + num2 ;
        System.out.println("Thew sum is " + ans);
        ans = num1-num2;
        System.out.println("Thew difference is " + ans);
        ans = num1*num2;
        System.out.println("Thew product is " + ans);
        ans = num1/num2;
        System.out.println("Thew divide is " + ans);
    }
}