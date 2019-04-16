class LogicalOpr{

    public static void main(String[] args) {
        
        LogicalOpr obj = new LogicalOpr();
        //obj.Shift_opr();
        /*
        int x = 10;
        int y = 5;
        while (x-- >7 || ++y <8){
        System.out.print(x);
        System.out.print(y);
        System.out.println();
        }
        System.out.print(x);
        System.out.print(y);
        */
        System.out.println(-34>>>3);
    }
    
    public void And_ShortCirAND(){
        
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);

        System.out.println("----------------");

        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
    }

    public void OR_ShortCirOR(){
        
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a<b||a<c);
        System.out.println(a<b|a<c);

        System.out.println("----------------");

        System.out.println(a<b||a++<c);
        System.out.println(a);
        System.out.println(a<b|a++<c);
        System.out.println(a);
    }

    public void Ternery_opr(){
        
        int a = 100;
        int b = 50;
        int c = 20;

        System.out.println((a>b)?(b>c)?"A is grater":"C is grater":"B is grater"); 
    }

    public void Shift_opr(){

        int a = 10; // for  10 << 2 00001010 -> 00101000 
        // for  -10 << 2 00001010 -> 11110101 -> 11110110 -> 11011000 -> 00100111 -> 00101000  
        System.out.println(a<<2);
        // for 10 >> 2 00001010 -> 00000010
        System.out.println(a>>2);
        System.out.println(a>>>2);

    }

}

/*

Boolean logical operator :-

1. &  logical AND
2. |  Logical OR
3. ^  Logical XOR
4. && Short circuit AND
        it will check only the first condition that is if the first condition is false the result or output will be false 
        else if the first condition is true then it is going to check the second condition and display the result accordingly.
5. || Short circuit OR
        if the first condition it is true result will be true else dependent on the scond condition and wii display the result .


bit-wise operator

1. << Left Shift Opr
    IN CASE of left opr. the no. of bits present in a value wii be shifted towards left hand site.
    value << num 
    num - no. of position that value will be 
    higher order bits wii be discarted and no of zeros will be filed on the vacent pos on right hand side
    a << n = a * 2^n
2. >> Right shift opr
    in this case no of bits in a value will be shifted towards right hand site .
    it is acctullly Arthmethic shift right
    a >> n  a / 2^n floor if a is positive else if negative sealing 
3. >>> normal Shift right

10  5
9  5
8  5
7  5
6  6
5  7
4  8



*/