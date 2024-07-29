public class meth {
    public static void main(String[] args) {
        Computer comp = new Computer();
        String pric = comp.getAPen(0);
        comp.playMusic();

        System.out.println(pric);
    }
}


class Computer {
    public void playMusic() {
        System.out.println("Musicplaying...");
    }

    public String getAPen(int cost){
        if (cost >= 10) {
            return "Pen";
        }
        return " ";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b - c;
    }

    public double add(double a, int b, int c) {
        return a * b / c;
    }
}