class a {}
class b extends a{}
class c extends b{}
class operator {
    public static void main(String[] args) {
        
        /*
        int z = 12;   
        int k = 11;
        System.out.println(z++ + ++z);
        System.out.printLn(k++ + k++);
        */
        operator a = new operator();
        
        System.out.println(a instanceof operator);

    }
}