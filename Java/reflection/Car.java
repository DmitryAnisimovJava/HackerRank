package reflection;

@Table(schema = "cars", table = "on_sale")
class Car {

	@Column(column = "car_brand")
	private String brand;
	@Column(column = "car_model")
	private String model;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + "]";
	}

}
