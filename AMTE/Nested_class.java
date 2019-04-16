class Nested_class{
    
    class Inner{

        public void fucn(){
            System.out.println("Inner Class");    
        }

        public void Anonymous_fun(){
            Inner obj = new Inner(){
                public void fucn(){
                    System.out.println("Anonymous Class");    
                }
            };
            obj.fucn();
        }
        
    }

    public void local_Inner(){
        class Inner2{
            public void show(){
                System.out.println("Local");
                System.out.println("Inner");
            }
        }
        Inner2 obj = new Inner2();
        obj.show();
    }

    public static void main(String[] args) {

        Nested_class OBJ = new Nested_class();
        Nested_class.Inner O = OBJ.new Inner();
        O.fucn();
        OBJ.local_Inner();
        O.Anonymous_fun();

       
    }

}
interface Eat1{
    void Method1();
}

/*

2 Classes  
Nested_class.java           // outerclass
Nested_class$Inner.java     //innerclass

1. Local Inner Class :- inside method/ block code
2. Annmouses Class :- 
3. Member Inner Class:-  inside a class 

Anonamous inner class : - that have no identity they are declared and intenceated as shoon as they are created 
                          we use where we want to extent a class or impliment and interface it provides funcanionility 
                          to abstract classes and interfaces.

                          it is use to over ride the methods of parent class or interfaces .

                          acts like a local inner class so it has to be declared inside a method or a block in which it defined;

interface :-in interfaces all the data members are public static and final;
            all the method's are abstract ;
        
abstract class :- partial abstraction 
interface :- full abstration 

in interfaces all the variables defined inside the interface are public static & final by default 
all the method inside the interface are abstract by default 

CA2 tuesday 28/03;
string 
string builder 
array list
abstract classes 
interfaces
nested classes

*/