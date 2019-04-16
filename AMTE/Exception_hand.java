import com.sun.glass.ui.CommonDialogs.Type;

class Exception_hand{
    public static void main(String[] args) throws Exception{
        
        try{
            int x  = Integer.parseInt(args[0]);
            int y  = Integer.parseInt(args[1]);
            System.out.println("Div :- "+(x/y));
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
            System.out.println("Print Stack Trace");
            e.printStackTrace();
            System.out.println("Get Message");
            System.out.println(e.getMessage());
            System.out.println("to String");
            System.out.println(e.toString());
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
            System.out.println("Print Stack Trace");
            e.printStackTrace();
            System.out.println("Get Message");
            System.out.println(e.getMessage());
            System.out.println("to String");
            System.out.println(e.toString());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println("Print Stack Trace :-");
            e.printStackTrace();
            System.out.println("Get Message :-");
            System.out.println(e.getMessage());
            System.out.println("to String :-");
            System.out.println(e.toString());
            System.out.println(e instanceof ArithmeticException);

            throw new NumberFormatException("Error in numbers");
            
        }

    }
}
/*

Types of Exception

1. Arthmetic Exception 
2. index out of Bounds
3. Number Formate Exception
4. NUll Pointer Exception

Exception at compile time:-
 
 1. SQL exception
 2. I/O Exception
 3. Interrputed  
 4. File Not Found
 
Error's :- 
1. VM Error (virtual Machine Error)
2. Out of Memory Error 
3. Stack Overflow 
4. No class Exception
5. No Such Method Error 

Runtime Stack for Exception:

it encounters an exception and it looks for exception handling code in the same method
But there is no handling code in the method therefore 
it create exception object and passes control over to JVM along with exception object
JVM exits currently executing method abnormally 
and looks for handler code in the caller method 
Since JVM doesn’t find any handling code here, 
so similar to last step currently executing method exits 
This continues until it reaches main() 
method and every entry in the runtime stack will be exited
Even in main method, there is no handler code 
therefore corresponding entry will be removed from runtime stack and main method terminates abnormally
Finally JVM destroys runtime stack after it becomes empty and passé the control to 
Default exception handler along with the exception object
Finally, overall program terminates abnormally 
and default exception handler prints exception information in the console
 

Throable Class :-
java.lang .throable 

1. printSatckTrace()
2. to string()
3. getMassege()

in checked exception compiler fourcefully handle free exception try catch block or declare the throws exception 


Method Overloading with exceptional exceptional exp;

        if the super class does not declare any exception then the subclass method can declare only the unchacked exceptions ,
    checked exception are not declared in the sub class if the super class declare an exception then 
    the sub class method can declare the same exception

*/
