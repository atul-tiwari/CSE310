import java.util.Scanner;
class ControlStements{

    public static void main(String[] args) {
        
        /*
        while (true)
         System.out.println("AAA");
         
         System.out.println("BBB");
         

         Scanner sc = new Scanner(System.in);

         for (int i=1 , j=5 ; i>0 & j>2 ; j--,i++ ){
            System.out.println(i+""+j);
            sc.nextInt();
            

          int[] a = new int[10]; 
          a[0] = 1;
          a[1] = 4;
          a[2] = 7;
          a[3] = 13;
          a[4] = 15;
          a[5] = 18;
          for (int i : a) {
              System.out.println(i);
          }
          */
          continue;
          ii:
          for (int i =1 ;i<=3;i++){
            jj:
            for (int j =1 ;j<=3;j++){

                for (int k =1 ;k<=3;k++){

                    if (i==2 && j==2 && k == 2)
                        break ii;
                    System.out.println("i="+i+" j="+j+" K="+k);
                }
            }

          }

         
    }

}
/*

Decision Selection
1. if
2. if else
3. if else if
4. switch

Iterative
1. while
2.do-while
3.for
4.for each

jump/transfer
1.brake
2.continue
3.Return


*/