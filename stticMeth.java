public class stticMeth {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.Brand = "Apple";
        mob.Price = 1500;
        Mobile.Name = "smartPhone";

        Mobile mob1 = new Mobile();
        mob1.Brand = "Tesla";
        mob1.Price = 1000;
        Mobile.Name = "smartPhone";

        Mobile mob2 = new Mobile();
        mob2.Brand = "Samsumg";
        mob2.Price = 1700;
        Mobile.Name = "smartPhone";

        mob.show();
        Mobile.show1(mob1);
        mob2.show();


        
    }
}


class Mobile {
    String Brand;
    int Price;
    static String Name;


    public void show() {
        System.out.println(Brand + " : " + Price + " : " + Name);
    }

    public static void show1(Mobile mob) {
        System.out.println(mob.Brand + " : " + mob.Price + " : " + Name);
    }
}