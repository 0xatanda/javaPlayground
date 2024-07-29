public class enums2 {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}


enum Laptop {
    Macbook(2000), XPS(2200), Surface(1500), Thinkad(1800), ChromeBook;

    private int price;

    private Laptop() {
        price = 1200;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}