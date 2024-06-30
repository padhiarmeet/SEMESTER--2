import java.util.*;
public class Collection_demo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
l2.add(51);
        l2.add(41); 
        l2.add(31);

        l1.add(5);
        l1.add(4); 
        l1.add(3);
        l1.add(2);
        l1.add(1);
        System.out.println(l1.get(3));
        l1.add(0,0);
        System.out.println(l1.get(4));
        l1.addAll(2,l2);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
        }
        System.out.println(l1.contains(2));
        System.out.println(l1.lastIndexOf(2));
        System.out.println(l1.hashCode());
    }
}
