import java.util.Scanner;
class Array{

    public int[] read(int size){
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int a=0 ;a<size;a++)
            arr[a] = sc.nextInt();
        return arr;
    }
    
    public int[] rev (int[] arr){
        int size =arr.length;
        int[] temparr =new int[size];
        for (int a = size -1 , b= 0; a>=0 ; a-- , b++ ){
            temparr[a] = arr[b];
        }
        return temparr;
    }

    public void printArr(int[] arr){
        System.out.println("Array is");
        for(int a:arr)
        System.out.println(a);
    }

    public int sum_ss (int ... Num){
        int sum =0;
        for (int a:Num)
            sum +=a;
        return sum;
    }

    public String add_s (String ... Str){
        String s = new String();
        for (int a=0 ;a<Str.length;a++)
                s=s+Str[a]+" ";
        return s;
    }

    public static void main(String[] args) {
        
        Array obj = new Array();
        //obj.printArr(obj.rev(obj.read(3)));
        System.out.println(obj.sum_ss(12,34,56,78,96,32,1));
        System.out.println(obj.add_s("I","Love","Java"));

    }

}

// 