import java.util.ArrayList;

class Functions{

    int number ;
    String str;
    public static void main(String[] args) {
        
        //Functions obj = new Functions(34,"ABC");
        //Functions o = new Functions();

        ArrayList<Object> AL = new ArrayList<Object>();
        AL.add(10.380);
        AL.add("ATUL");
        AL.add(true);
        AL.add(103);
        AL.remove(0);
        AL.set(2,"AAA");
        System.out.println(AL);
        }

    Functions (int a , String b){
        number = a;
        str = b;
        System.out.println(this.number+" "+this.str);
    }

    Functions (){
        System.out.println(this.number+" "+this.str);
    }

}
/*

Methords
1... Resuable code 
2... Syntex 
        Access_specifiers return_type Methord_name (formal Args ){
            Methord_defination
        }


Constructors
1.. Same class name
2.. public 
3.. No return type
4.. initlization instance varibales
        i. Default Constructor
        ii. Paramitrized constructor

Array List
1.. systex 
        ArrayList <Type> obj = new arrayLIst<type>();

*/