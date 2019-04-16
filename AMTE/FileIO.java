import java.io.File;
import java.io.IOException;
class FileIO{
public static void main(String[] args) {
    File F_obj = new File("./Files/ABCD.txt");
    File Dir = new File(".");
    String[] abc ;
    try{
    //F_obj.createNewFile();
    System.out.println(F_obj.exists());
    
    abc = Dir.list();
    for(String x:abc){
        File temp = new File(x);
        if (temp.isFile())
         System.out.println(temp.getName());

    }
    }
    catch(IOException e){
        System.out.println(e.toString());
    }
    
    
}
}
/*
types of files:
1. text files
2. binary files

File Class constructors:
1. File(String filename);
2. File(String Dirname,String filename);
3. File(File File_dir_name,String Filename)''

File Class methods:

1. Esists()
2. CreateNewFIle()
3. Mkdir()
4. lastModifed();
5. list();


1 . Wirter(int ch);
2. write(char []ch)
3. write(string s)
4.flash();
5.Close();

bufferwriter 
new line()

.. printwriter (// most efficent way to write in the files)
pw.write(100)
pw.write(10.4)
pw.print(true)
pw.println("Hello")

*/