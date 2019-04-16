class Exp1 extends Exception{
    Exp1   (String str){
        super(str);
    }
}
class Custom_exp{
    public static void main(String[] args) {
        try{
            display();
        }
        catch(Exp1 e){
            System.out.println("Exp Handle");
            System.out.println(e);
        }
    }
    public static void display() throws Exp1{
        throw new Exp1("My custom Exception");
    }
}
/*

when ever we want to create own exception classs 
 1. inhearet your exception class from parent exp class so tyhat your exp class can be the exception hierachy
 2. constructor that create a string paremeter and in that we call a super constructor and pass the message 
 3.  

*/