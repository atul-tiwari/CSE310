import java.util.*;

interface Testing{
    public boolean checkString(String str);
}

class Input{

    public String  getInput(Testing obj){
        Scanner sc = new Scanner(System.in);
        String Text = sc.nextLine();
        if (!obj.checkString(Text))
            return "String Accepted";
        else
            return getInput(obj);
        
    }
    public static void main(String[] args) {

        Testing obj = new Testing(){

            public boolean checkString(String str){
                ArrayList<char> = new ArrayList<>();
                char [] vowels = new char[5];
                vowels[0] = 'A';
                vowels[1] = 'E';
                vowels[2] = 'I';
                vowels[3] = 'O';
                vowels[4] = 'U';
                char[] a = str.toCharArray();
                for (char x : vowels){
                    boolean temp = false;
                    
                    for (int i =0 ;i< str.length();i++){
                        if (x == a[i])
                            temp = true;
                    }
                    if (temp) 
                        return false;
                    
                }
                return true;

            }
        };
        
        Input I1 = new Input();
        String text = I1.getInput(obj);
        System.out.println(text);
        
    }
}