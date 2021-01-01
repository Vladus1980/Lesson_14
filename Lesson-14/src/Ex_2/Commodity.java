package Ex_2;

public class Commodity {
	
	public String name;
	public int weight;
	public int length;
	public int width;
	
	
	public Commodity(String name, int weight, int length, int width) {
		super();
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.width = width;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public String toString() {
		return "Commodity [name=" + name + ", weight=" + weight + ", length=" + length + ", width=" + width + "]";
	}

}
