abstract class A{
    int X = 10;
    public void demo(){
        System.out.println("This is NOn abstract method Demo");
    }
    public abstract void Show();
    
    public void abc(){
        System.out.println("This is ABC pro");
    }
} 

interface B{
    static double X = 20.0;
    default void demo(){
        System.out.println("This is Default method Demo");
    }
}

class Test extends A implements B{

    public static void main(String[] args) {
        
        Test obj = new Test();
        
        obj.Show();  
        obj.demo();
        System.out.println(B.X);
        obj.abc();

    }

    
    public void abc(){
        System.out.println("This is ABC ");
    }
   

    @Override 
    public void demo(){
        System.out.println("This is Overrided method Demo");
    }

    public void Show(){
        super.abc();
        B.super.demo();
        System.out.println(super.X);
        System.out.println("This is Show method");
    }
}

class S {
    public static void main(String[] args) {
        
        System.out.println("Class s");
    }
}
