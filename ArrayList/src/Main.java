import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(-10);
        liste.add(20);
        liste.add(30);
        liste.add(-500);
        liste.add(661);
        liste.add(null);

        Iterator<Integer> itr=liste.iterator();
        while(itr.hasNext()){

                System.out.println(itr.next());
            

        }




    }
}