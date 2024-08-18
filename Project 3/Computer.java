public abstract class Computer {
    private String brand;
    private double price;
    private boolean isPortable;
    protected Processor processor; // Protected

    public Computer(String brand, double price, boolean isPortable, Processor processor) {
        this.brand = brand;
        this.price = price;
        this.isPortable = isPortable;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean isPortable) {
        this.isPortable = isPortable;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    // Abstract method
    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isPortable=" + isPortable +
                ", processor=" + processor +
                '}';
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + (int) price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return Double.compare(computer.price, price) == 0 &&
                brand.equals(computer.brand);
    }
}