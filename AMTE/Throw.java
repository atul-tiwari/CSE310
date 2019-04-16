class _Throw{
public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    try{
    if (age<18){
        throw new ArithmeticException("Not vaild age");
    }
    else{
        System.out.print("Valid age");
    }
    }
    catch(ArithmeticException E){
        System.out.println(E.getMessage());
        E.printStackTrace();

    }

    
}
}

/*

1. Default throw & Default Catch
2. Default throw & Own Catch
3. Own throw & Default Catch
4. own throw & own Catch

throw keybord is used to throw the exception explictly 
i.e. the object of the throwable class or its sub class can be thrown using thrown keybord 
it can be used with checked exp and un-checked exception and custom expection
it is used to defind the customised messageses for pre defined exception we can 
set own rules and condition to throw the exception using throw Keyword

Rethrow :-
1. Rethrow an exception is required when ever an catch block is handling certain type of exception and on same time wants 
   to notify the caller of the method that the Exception has ocured.
   
2. Throw keword is always used in catch block and the contro jumps to the method from where that method actually callled 

3. it is used for propegation of one type of exception into another type of exception

*/