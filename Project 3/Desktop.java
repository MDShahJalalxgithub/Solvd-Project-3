public class Desktop extends Computer {
    protected String formFactor; // Protected

    public Desktop(String brand, double price, boolean isPortable, String formFactor, Processor processor) {
        super(brand, price, isPortable, processor);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Desktop: " + getBrand() + ", Price: $" + getPrice() +
                ", Form Factor: " + formFactor + ", Processor: " + processor.getModel() + ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "formFactor='" + formFactor + '\'' +
                ", " + super.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode() + formFactor.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Desktop desktop = (Desktop) obj;
        return formFactor.equals(desktop.formFactor);
    }
}