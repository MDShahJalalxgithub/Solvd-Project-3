public class Laptop extends Computer {
    protected double weight; // Protected

    public Laptop(String brand, double price, boolean isPortable, double weight, Processor processor) {
        super(brand, price, isPortable, processor);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + getBrand() + ", Price: $" + getPrice() +
                ", Weight: " + weight + " kg, Processor: " + processor.getModel() + ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", " + super.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Laptop laptop = (Laptop) obj;
        return Double.compare(laptop.weight, weight) == 0;
    }
}