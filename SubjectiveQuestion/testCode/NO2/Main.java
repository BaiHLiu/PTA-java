import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 1; i < 5; ++i) {
            c.add(i);
        }
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}