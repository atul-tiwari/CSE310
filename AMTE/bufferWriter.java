import java.io.*;

class bufferWriter{
    public static void main(String[] args){
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Files/Out.txt"));
        BufferedReader br = new BufferedReader(new FileReader("./Files/File1.txt"));
        String temp = br.readLine();
        bw.append('c');
        while (temp != null){
            System.out.println("Writing : " +temp);
            bw.write(temp);
            temp = br.readLine();
        }
        BufferedReader br1 = new BufferedReader(new FileReader("./Files/File2.txt"));
        temp = br1.readLine(); 
        while (temp != null){
            bw.write(temp);
            System.out.println("Writing : " +temp);
            temp = br1.readLine();
        }
        BufferedReader br2 = new BufferedReader(new FileReader("./Files/Out.txt"));
        temp = br2.readLine(); 
        while (temp != null){
            System.out.println(temp);
            temp = br2.readLine();
        }
        br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }   
}