/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {
    public static int calculateSquare(int i){
        int square=i*i;
        return square;
    }
    public static double calculateSquareRoot(int i){
        double root=Math.sqrt(i);
        return root;
    }
    public static String toLower(String str){
        String s = str.toLowerCase();
        return s;
    }
    public static boolean isMultiple(int one, int two){
        boolean b = two%one==0;
        return b;
    }
    public static void prettyInt(int i){
        String star="";
        for(int j = 0; j<i;j++){
            star+="*";
        }
        System.out.println(star+" "+i+" "+star);


    }

  public static void main (String args[]) {
      System.out.println(calculateSquare(10));
      System.out.println(calculateSquareRoot(10));
      System.out.println(toLower("Sup, Cow?"));
      System.out.println(isMultiple(5,7));
      prettyInt(8);
  }
}
