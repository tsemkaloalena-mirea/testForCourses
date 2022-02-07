package task5;

public class Tool {
	private String name;
	private Integer volume;
	private Integer price;

	public Tool(String name, Integer volume, Integer price) {
		this.name = name;
		this.volume = volume;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public Integer getVolume() {
		return volume;
	}

	public Integer getPrice() {
		return price;
	}

	public String toString() {
		return this.name + ": " + this.volume + ", " + this.price;
	}
}
