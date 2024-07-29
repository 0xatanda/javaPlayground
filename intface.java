public class intface {
    public static void main(String[] args) {
        Laptop newLaptop = new Laptop();

        Dev x = new Dev();
        x.devApp(newLaptop);


    }
}


class Dev {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

class Laptop {
    public void code() {
        System.out.println("code, compile, run.......");
    }
}

class Desktop {
    public void fast() {
        System.out.println("faster .......");
    }
}