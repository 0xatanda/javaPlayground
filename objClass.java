public class objClass {
    public static void main(String[] args) {
        Laptop obLaptop = new Laptop();
        obLaptop.model = "mac";
        obLaptop.price = 1200;
        

        Laptop obLaptop1 = new Laptop();
        obLaptop1.model = "Window";
        obLaptop1.price = 1200;

        boolean result = obLaptop.equals(obLaptop1);
        System.out.println(result);
    }
}


class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop thattLaptop) {
        if (this.model.equals(thattLaptop.model) && this.price == thattLaptop.price) {
            return true;
        } else {
            return false;
        }
    }
}