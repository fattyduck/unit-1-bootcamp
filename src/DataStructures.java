import com.sun.xml.internal.ws.util.QNameMap;

import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {
    public static ArrayList<Cat> coolCats(){
        ArrayList<Cat> cats= new ArrayList<>();
        Cat one = new Cat("one");
        Cat two = new Cat("two");
        Cat three = new Cat("three");
        Cat four = new Cat("four");
        Cat five = new Cat("five");
        cats.add(one);
        cats.add(two);
        cats.add(three);
        cats.add(four);
        cats.add(five);
        return cats;

    }
    public static void mostFrequentElement(ArrayList<Integer> i){
        HashMap<String, Integer> map= new HashMap<>();
        Integer count =1;
        for(int j=0; j<i.size(); j++ ){
            if(!map.containsKey(i.get(j).toString())){
                map.put(i.get(j).toString(),count);
            }else{
                map.put(i.get(j).toString(), map.get(i.get(j).toString())+1);
            }
        }
        Integer max= Collections.max(map.values());
        for(String key: map.keySet()){
            if(map.get(key)==max){
                System.out.println(key);
            }
        }

    }
    public static void mostFrequentElement2(ArrayList<String> i){
        HashMap<String, Integer> map= new HashMap<>();
        Integer count =1;
        for(int j=0; j<i.size(); j++ ){
            if(!map.containsKey(i.get(j))){
                map.put(i.get(j),count);
            }else{
                map.put(i.get(j), map.get(i.get(j))+1);
            }
        }
        Integer max= Collections.max(map.values());
        for(String key: map.keySet()){
            if(map.get(key)==max){
                System.out.println(key);
            }
        }

    }
    public static boolean rentACar(HashMap<String, Integer> map){
        Integer max = Collections.max(map.values());
        boolean b = max>=25;
        return b;
    }

  public static void main (String args[]) {
    for(int i=0; i<coolCats().size();i++){
        System.out.println(coolCats().get(i).getName());
    }
      ArrayList<Integer>i = new ArrayList<>();
      i.add(0);i.add(0);i.add(0);
      i.add(1);i.add(2);i.add(3);
      mostFrequentElement(i);
      ArrayList<String> s = new ArrayList<>();
      s.add("sup");s.add("sup");s.add("sup");
      s.add("no");s.add("yes");s.add("cow");
      mostFrequentElement2(s);
      HashMap<String, Integer> pod = new HashMap<>();
      pod.put("Abass", 5);
      pod.put("Pooja", 5);
      pod.put("Jan", 4);
      pod.put("Mad", 6);
      pod.put("Ros", 5);
      pod.put("Duck", 205);
      System.out.println(pod);
      System.out.println(rentACar(pod));



  }
}
