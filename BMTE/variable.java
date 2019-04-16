class variable
{   
    static int count = 0;

    public variable (int a){
        variable.count ++ ; 
        System.out.println( " Object no is = " + a + " Count = " + variable.count );
    }
    public char abc;
    public static void main(String a[])
    {
        for (int i=0; i<10;i++){
                for (int k =0 ;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        /*
        variable obj = new variable();
        if(obj.abc == ' ')
        System.out.println( "True" );
        else
        System.out.println( "False" );
        
        variable ob1 = new variable(1);
        variable ob2 = new variable(2);
        variable ob3 = new variable(3);
        variable ob4 = new variable(4);
        variable ob5 = new variable(5);
        
        int ac;
        System.out.println("fhj");
        */
    }
}