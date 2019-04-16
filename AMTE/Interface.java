@FunctionalInterface
interface Doable{
    void mth1(String st1);
}
class Interface implements Doable{
    public void mth1(String st1){
        System.out.println("Functional interface"+st1);
    }
    public static void main(String[] args) {
        Interface Obj = new Interface();
        Obj.mth1("1st"); 
    }
}

/*
variables: final
methords:
1.7 : abstract
1.8 static & defaults
1.9 private 


Functional Interface :
 only one Abstract methods

@FunctionalInterface
Interface A{
    Public void method();
}

It consist of single abstract methords and any no of static and default method's
if functional interface inhearting normal interface then it is compulsary that a normal interface 
should not be having any abstyract methods


Question : 

Interface Payroll 
computepay();

Intface Employee
setname();
getname();
setEmp_id();
getEmp_id();
setaddress();
getaddress();

*/