package HW_27;

public class Component {

    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public String toString() {
        return "Brand: " + brand + ", Model: " + model;
    }
}
