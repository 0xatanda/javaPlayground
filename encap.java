public class encap {
    public static void main(String[] args) {
        Human dat = new Human();

        
        dat.setName("0x");
        dat.setAge(11);

        System.out.println(dat.getName() + " : " + dat.getAge());
    }
}


class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}
