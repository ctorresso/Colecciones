import java.util.Collections;
import java.util.LinkedList;

public class first {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<Integer>();
        int sum=0;
        for (int i = 0; i < 25; i++) {
            int num = (int)(Math.random()*100+1);
            numbers.add(num);
            sum=sum+numbers.get(i);
        }
        Collections.sort(numbers);
        System.out.println(numbers);

        double prom=(double) sum/numbers.size();
        System.out.println(prom);
        System.out.printf(" suma = %d promedio = %6.2f%n", sum , prom );

    }
}
