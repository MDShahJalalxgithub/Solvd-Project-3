public class Tablet extends Computer {
    protected boolean hasStylus; // Protected

    public Tablet(String brand, double price, boolean isPortable, boolean hasStylus, Processor processor) {
        super(brand, price, isPortable, processor);
        this.hasStylus = hasStylus;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tablet: " + getBrand() + ", Price: $" + getPrice() +
                ", Has Stylus: " + hasStylus + ", Processor: " + processor.getModel() + ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasStylus=" + hasStylus +
                ", " + super.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (hasStylus ? 1 : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Tablet tablet = (Tablet) obj;
        return hasStylus == tablet.hasStylus;
    }
}