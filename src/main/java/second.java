import java.util.Collections;
import java.util.LinkedList;

public class second {
    public static void main(String[] args) {

        LinkedList<String> first=new LinkedList<String>();


        first.add("Sonora");
        first.add("Sinaloa");
        first.add("Nayarit");
        first.add("Chihuahua");
        first.add("Quintana Roo");
        first.add("Jalisco");
        first.add("Michoacan");
        first.add("Veracruz");
        first.add("Campeche");
        first.add("Baja California");

        System.out.println(first);
        Collections.reverse(first);
        LinkedList<String> second=new LinkedList<String>();
        second.add(String.valueOf(first));
        System.out.println(second);





    }
}
