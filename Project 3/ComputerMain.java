public class ComputerMain {
    public static void main(String[] args) {
        Processor laptopProcessor = new Processor("Intel i5", 2.5);
        Processor desktopProcessor = new Processor("AMD Ryzen 7", 3.6);
        Processor tabletProcessor = new Processor("Apple A14", 2.8);

        Laptop laptop = new Laptop("Dell", 999.99, true, 2.5, laptopProcessor);
        Desktop desktop = new Desktop("HP", 799.99, false, "Tower", desktopProcessor);
        Tablet tablet = new Tablet("Apple", 599.99, true, true, tabletProcessor);

        laptop.displayInfo();
        desktop.displayInfo();
        tablet.displayInfo();

        System.out.println(laptop);
        System.out.println(desktop);
        System.out.println(tablet);
    }
}