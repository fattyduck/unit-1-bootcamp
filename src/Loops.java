import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {
    public static void print1to10(){
        for(int i=1; i<11;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void print1to10x(){
        int n=1;
        while(n<11){
            System.out.print(n+" ");
            n++;
        }
        System.out.println();

    }
    public static void printToN(int n){
        for(int i=1;i<n+1;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printToNeven(int n){
        for(int i=2;i<n+1;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printSumTo10(){
        int n=0;
        for(int i=1;i<11;i++){
            n+=i;
        }
        System.out.println(n);
    }
    public static int printSumToN(int n){
        int j =0;
        for(int i=1;i<n+1;i++){
            j+=i;
        }
        return j;
    }
    public static void printSumto1000(){
        System.out.println(printSumToN(1000));
    }
    public static void printLines(int n, String s){
        if(n<0){
            System.out.println("");
        }else{
            for(int i =0; i<n;i++){
                System.out.println(s);
            }
        }
    }
    public static void printLinesC(int n, String s){
        if(n<0){
            System.out.println("");
        }else{
            for(int i =0; i<n;i++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> fib10(){
        ArrayList<Integer> fib = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        for(int i=0; i<11;i++)
        {
            fib.add(a);
            int c=a+b;
            a=b;
            b=c;
        }
        return fib;
    }
    public static void printFib10Sum(){
        int sum=0;
        for(int i=0;i<fib10().size();i++){
            sum+=fib10().get(i);
        }
        System.out.println(sum);
    }
    public static void printFibNSum(int n){
        ArrayList<Integer> fib = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        int sum=0;
        for(int i=0; i<n+1;i++)
        {
            sum+=a;
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }

  public static void main (String args[]) {
    print1to10();
      print1to10x();
      printToN(10);
      printToNeven(12);
      printSumTo10();
      printSumToN(10);
      printSumto1000();
      printLines(3,"cows");
      printLinesC(3,"cows");
      printFib10Sum();
      printFibNSum(10);

  }
}
