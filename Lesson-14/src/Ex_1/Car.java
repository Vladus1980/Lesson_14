package Ex_1;

public class Car implements Comparable{
	
	public String ModelCar;
	public int YearCar;
	public Car(String modelCar, int yearCar) {
		super();
		ModelCar = modelCar;
		YearCar = yearCar;
	}
	public String getModelCar() {
		return ModelCar;
	}
	public void setModelCar(String modelCar) {
		ModelCar = modelCar;
	}
	public int getYearCar() {
		return YearCar;
	}
	public void setYearCar(int yearCar) {
		YearCar = yearCar;
	}
	@Override
	public String toString() {
		return "Car " + ModelCar + "  " + YearCar + " ";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ModelCar == null) ? 0 : ModelCar.hashCode());
		result = prime * result + YearCar;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (ModelCar == null) {
			if (other.ModelCar != null)
				return false;
		} else if (!ModelCar.equals(other.ModelCar))
			return false;
		if (YearCar != other.YearCar)
			return false;
		return true;
	
	}
	public int compareTo(Car anotherString) {
		
		return this.ModelCar.compareTo(anotherString.getModelCar());
	}
	@Override
	public int compareTo(Object arg0) {
		
		return 0;
	}
	
	

}
