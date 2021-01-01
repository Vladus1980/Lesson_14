package Ex_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ApplicationCar{

	public static void main(String[] args) {
		
		Set<Car> car1 = new HashSet<Car>();
		car1.add(new Car("Ford Mustang", 1968));
		car1.add(new Car("Ford Taurus", 1996));
		car1.add(new Car("Ford Sierra", 1995));
		car1.add(new Car("Ford Fiesta", 2005));
		car1.add(new Car("Ford NewDragon", 2020));
		car1.add(new Car("Ford SuperC", 2019));
		
		for (Car car : car1) {
			System.out.println(car);
			
		}
		System.out.println();
		
		Set<Car> car2 = new LinkedHashSet<Car>();
		car2.add(new Car("Ford Mustang", 1968));
		car2.add(new Car("Ford Taurus", 1996));
		car2.add(new Car("Ford Sierra", 1995));
		car2.add(new Car("Ford Fiesta", 2005));
		car2.add(new Car("Ford NewDragon", 2020));
		car2.add(new Car("Ford SuperC", 2019));
		
		for (Car car : car2) {
			System.out.println(car);
		}
		
		System.out.println();
		
		Set<Car> car3 = new TreeSet<Car>();
		car3.add(new Car("Ford Mustang", 1968));
		car3.add(new Car("Ford Taurus", 1996));
		car3.add(new Car("Ford Sierra", 1995));
		car3.add(new Car("Ford Fiesta", 2005));
		car3.add(new Car("Ford NewDragon", 2020));
		car3.add(new Car("Ford SuperC", 2019));
		
		for (Car car : car3) {
			System.out.println(car);
		}
		
System.out.println();
		
		Set<Car> car4 = new TreeSet<Car>(new CarComparator());
		car4.add(new Car("Ford Mustang", 1968));
		car4.add(new Car("Ford Taurus", 1996));
		car4.add(new Car("Ford Sierra", 1995));
		car4.add(new Car("Ford Fiesta", 2005));
		car4.add(new Car("Ford NewDragon", 2020));
		car4.add(new Car("Ford SuperC", 2019));
		
		for (Car car : car4) {
			System.out.println(car);
		}
	}
	

}


//1)Створити клас (довільно який), описати в ньому мінімум два поля, одне з яких String, інше числове (довільно яке). Створити в мейн методі Set.
//
//Наповнити його об"єктами даного класу. Використати Comparator і Comparable для сортування за цими полями. Вивести спершу невідсортований список, потім відсортований на консоль.
//

