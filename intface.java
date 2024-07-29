public class intface {
    public static void main(String[] args) {
        Computer newLaptop = new Laptop();
        Computer desk  = new Desktop();

        Dev x = new Dev();
        x.devApp(newLaptop);


    }
}


interface Computer {
    void code();
}


class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run.......");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("faster .......");
    }
}

class Dev {
    public void devApp(Computer lap) {
        lap.code();
    }
}