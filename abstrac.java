public class abstrac {
    public static void main(String[] args) {
        Car objCar = new UpdatedWagnor();
        objCar.drive();
        objCar.playMusic();
        objCar.drift();
    }
}


abstract class Car {
    public abstract void drive();
    public abstract void drift();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class Wagnor extends Car {
    public void drive() {
        System.out.println("Driving .......");
    }
}

class UpdatedWagnor extends Wagnor {
    public void drift() {
        System.out.println("Drifing...");
    }
}