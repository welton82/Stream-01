package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*Stream é criada a partir de uma fonte de dados*/

public class Application {
	public static void main(String[] args) {
		/*
		List<Integer> list = Arrays.asList(2,5,7,10,19);
		
		list.forEach(System.out::println);
		
		Stream<Integer> st1 = list.stream();
		System.out.println("-------- Imprime como String -------------");
		System.out.println(Arrays.toString(st1.toArray()));
		
		//função map aplica a cada elemento usando função lambda
		Stream<Integer> st1b = list.stream().map(p -> p*10);
		System.out.println(Arrays.toString(st1b.toArray()));
		System.out.println("--------------------------------------");
		Stream<String> st2 = Stream.of("Maria","Jhon", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		System.out.println("----------------");
		Stream<Integer>st3 = Stream.iterate(0, x ->x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		*/
		
		Stream<Long> fibo = Stream.iterate(new Long[] {0l,1l}, p ->new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibo.limit(55).toArray()));
		
	}
}











