import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Temp_pettern {
    public static void main(String[] args) {
        Collection<Integer> v = new ArrayList<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        Iterator<Integer> it = v.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}