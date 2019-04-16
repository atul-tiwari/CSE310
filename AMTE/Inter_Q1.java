interface Demo{
    public static void testStatic(){
        System.out.println("This is testStatic Methord");
    }
    default void testDefault(){
        System.out.println("This is testDefault Methord");
    }
    public abstract void testAbstract();
}
interface X{
    public abstract void test();
}
interface Y{
    public abstract void test();
}

abstract class Myabstract implements X,Y{

}

class MyClass extends Myabstract implements Demo{

    public static void main(String[] args) {
        System.out.println("Myclass Main method");

        MyClass Obj = new MyClass();
        
        Obj.test();
        Obj.testAbstract();
        Obj.testDefault();

        Demo.testStatic();   

    }

    public void test(){
        System.out.println("This ia test method");
    }

    public void testAbstract(){
        System.out.println("This ia testAbstract method");
    }

}