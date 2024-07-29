public class sttic1 {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.brand = "apple";
        mob.price = 1600;
        Mobile.name = "smartPhone";

        mob.show();
    }
}


class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "smartPhone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constrctor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}