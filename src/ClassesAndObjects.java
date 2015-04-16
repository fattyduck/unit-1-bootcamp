/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static boolean isOlder(Cat one, Cat two){
        boolean b = one.getAge()>two.getAge();
        return b;
    }
    public static void makeBestFriends(Cat one, Cat two){
        two.setFavoriteFood(one.getFavoriteFood());
    }
    public static Cat makeKitten(Cat one, Cat two){
        Cat three= new Cat(one.getName()+two.getName());
        three.setAge(0);
        return three;
    }
    public static void adaption(Person person, Cat cat)
    {
        if(cat.getName() == "Woman")
        {
            System.out.println("Cat Woman can't be owned");
        }
        else
        {
            cat.setOwner(person);
        }
    }
    public static void isFree(Cat cat){
        if(cat.getOwner()==null){
            System.out.println("This cat can be adapted");
        }else{
            System.out.println("The owner of this cat is "+cat.getOwner().getName());
        }
    }
    public static boolean isSibling(Cat one, Cat two){
        boolean b=one.getOwner()==two.getOwner();
        return b;
    }

  public static void main (String args[]) {
      Person nick = new Person("Nick");
      Person duck = new Person("Duck");
      Cat garfield=new Cat("Garfield");
      garfield.setAge(5);
      garfield.setFavoriteFood("lasagna");
      Cat panther=new Cat("Panther");
      panther.setAge(7);
      panther.setFavoriteFood("hamburger");
      Cat catwoman=new Cat("Woman");
      catwoman.setAge(4);
      catwoman.setFavoriteFood("lasagna");
      makeBestFriends(garfield, panther);
      System.out.println(panther.getFavoriteFood());
      Cat baby = makeKitten(garfield, catwoman);
      System.out.println(baby.getName()+baby.getAge());
      adaption(nick, catwoman);
      adaption(duck, panther);
      System.out.println(catwoman.getOwner());
      System.out.println(panther.getOwner().getName());
      isFree(panther);
      isFree(catwoman);
      adaption(duck, garfield);
      System.out.println(isSibling(garfield, panther));
      System.out.println(isSibling(garfield, catwoman));
  }
}
