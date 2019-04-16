class String_1{
    public static void main(String[] args) {

        byte[] b = {'a','t','u','l'};
        char[] c = {'a','t','u','l'};

        String S1 = new String("Atul Tiwari");    
        
        /*
        String S2 = new String(c);
        String S3 = new String(b);
        String S4 = new String(S2);
        String S5 = new String(b,0,2) ;
        String S6 = new String(c,0,3) ;

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);

        System.out.println(S4);
        System.out.println(S5);
        System.out.println(S6);
        
        System.out.println(S1.toUpperCase());
        System.out.println(S1.toLowerCase());

        System.out.println(S1.replace('a','A'));

        System.out.println(S1.equals("Atul"));

        System.out.println("AAAEEE"=="AAAEEE");

        String temp = new String("AAAEEE");
        System.out.println(temp.equals("AAAEEE"));
        System.out.println(temp=="AAAEEE");

        System.out.println(S1.charAt(1));

        */
        StringBuilder Sb = new StringBuilder("Hello");
        System.out.println(Sb.capacity());
        System.out.println(Sb.length());
        char []a = new char[10];
        Sb.getChars(1,3,a,3);
        for (char x:a)
            System.out.println(x);

        //System.out.println(Sb.ensureCapacity());

    }
}


/* string is immutable sequence of char's that is once the string obj 
has been created we cant perform any changes in the exexting objects 
if we are triying to perform any change then with that change 
a new object will be created without any change to the exeting objects

All the string reside in the STRING POOL "in the METHOD AREA of jvm " each time an obj will be created 
it will be stored in heap and its coursponding string string literls wil be stored in string pool

string class persemt in java , lang package it extend the base 
class of java that is object and implements three interfaces

1. Serializable
2. Comparable
3. Char Srquence

1. String()
2. string(char[])
3. string(byte[])
4. string(string strObj)
5. String(byte[],int offset, int count)  
6. String(char[],int offset, int count)  


String builder mutable sequence
Constructors
1. StringBuilder()
2. StringBuilder(int cap)
3. StringBuilder(String str)


ensureCapacity()
min specified lenth
if new length excide's the capecity of string buider
new capacity = 2*orignal_capicity +1

*/