public class sttic {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 1500;
        Mobile.name = "smartPhone";

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsumg";
        mob2.price = 1700;
        Mobile.name = "smartPhone";

        mob.show();
        mob2.show();
    }
}


class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}