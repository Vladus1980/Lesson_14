package Ex_1;

import java.util.Comparator;

public class CarComparator implements Comparator <Car>{

	@Override
	public int compare(Car o1, Car o2) {
		if (o1.getYearCar() > o2.getYearCar()) {
			return 1;
		} else if (o1.getYearCar() < o2.getYearCar()){
			return -1;
		}
		return 0;
	}

}
