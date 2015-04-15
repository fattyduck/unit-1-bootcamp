/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {
    public static boolean isOdd(int n){
        boolean b = n%2!=0;
        return b;
    }
    public static boolean isMultipleof3(int n){
        boolean b = n%3==0;
        return b;
    }
    public static boolean isOddandMultipleof3(int n){
        boolean b = n%2!=0&&n%3==0;
        return b;
    }
    public static boolean isOddandMultipleof3x(int n){
        boolean b = isOdd(n)&&isMultipleof3(n);
        return b;
    }
    public static void fizz(int n){
        if(n%3==0){
            System.out.println("fizz");
        }else{
            System.out.println(n);
        }
    }
    public static boolean fromLondon(Person person){
        boolean b = person.getCity()=="london";
        return b;
    }
    public static void printNameg5(Person person){
        if(person.getName().length()>5){
            System.out.println(person.getName());
        }else{
            System.out.println("Name too short");
        }
    }

  public static void main (String args[]) {
      System.out.println(isMultipleof3(15));
      System.out.println(isOdd(15));
      System.out.println(isOddandMultipleof3(12));
      System.out.println(isOddandMultipleof3x(15));
      fizz(11);
      Person cow = new Person("cowb999");
      System.out.println(fromLondon(cow));
      printNameg5(cow);
  }
}
