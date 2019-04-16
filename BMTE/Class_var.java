class parent{
    int aaa = 160;

}
class child extends parent{
    int aaa = 140;
}
class Class_var extends child{
    int aaa =120;
    void display(){

        System.out.println(super.aaa);

    }
    public static void main(String[] args) {
        Class_var obj = new Class_var();
        obj.display();
    }
}
