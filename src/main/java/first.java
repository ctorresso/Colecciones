import java.util.Collections;
import java.util.LinkedList;

public class first {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<Integer>();

        for (int i = 0; i < 25; i++) {
            int num = (int)(Math.random()*100+1);
            //System.out.println(num);
            numbers.add(num);
        }
        Collections.sort(numbers);
        System.out.println(numbers);

        double sum=0;
        double prom;
        for (int i = 0; i < numbers.size(); i++) {
            sum=sum+numbers.get(i);
        }
        prom=sum/numbers.size();
        System.out.println(prom);


    }
}
