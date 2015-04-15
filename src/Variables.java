import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {
    public static void pbd(){
        int room =113;
        double e = 2.71828;
        String major = "Computer Science";
        System.out.println(room);
        System.out.println(e);
        System.out.println(major);

    }
    public static boolean isEven(int i){
        boolean b = false;
        if(i%2==0){
            b = true;
        }
        return b;
    }

    public static void printHelloWordBack(){
        String str= "Hello World!";
        int l = str.length()-1;
        while(l>=0){
            System.out.print(str.charAt(l));
            l-=1;
        }
        System.out.println();
    }
    public static int gcf(int one, int two){
        ArrayList<Integer> cf=new ArrayList<>();
        int low;
        if(one<two){
            low=one;
        }else{
            low=two;
        }
        for(int i=1; i<=low; i++){
            if (one%i==0&&two%i==0){
                cf.add(i);
            }
        }
        int g=cf.get(cf.size()-1);

        return g;
    }

    public static void main (String args[]) {

        printHelloWordBack();
        System.out.println(gcf(10, 15));
  }
}
