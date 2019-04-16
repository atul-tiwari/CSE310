import java.util.Scanner;

class Marks{
    int No_of_sub,percentage;
    int sub[];
    char grade ;
	
    public void Read(){
	
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No of subjects");
        No_of_sub = sc.nextInt();
        
        sub = new int[No_of_sub];

        for (int i=0; i<No_of_sub;i++){
            System.out.println("Enter marks of Subject "+i+1);
            sub[i]=sc.nextInt();
            }
	
        }
    
    public void Per(){
        int sum = 0;
        for (int i:sub)
            sum += i;
        percentage = sum/No_of_sub;
    }

    public void Cal_grade(){

        if (percentage > 90)
        grade = 'O';
        else if (percentage > 80 & percentage <=90)
        grade = 'A';
        else 
        grade = 'E';
    }

    public static void main(String[] args) {
        
        Marks Student1 = new Marks();
        Student1.Read();
        Student1.Per();

        
        System.out.println(Student1.percentage);

    }
}