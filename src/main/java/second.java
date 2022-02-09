import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class second {
    public static void main(String[] args) {

        LinkedList<Character> first=new LinkedList<Character>();


        Random r= new Random();
        for (int i = 0; i < 10; i++) {
            char character =(char)(r.nextInt(26)+'a');
            first.add(character);

        }

        System.out.println(first);
        Collections.reverse(first);
        LinkedList<String> second=new LinkedList<String>();
        second.add(String.valueOf(first));
        System.out.println(second);





    }
}
