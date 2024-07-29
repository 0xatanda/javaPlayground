public class cons {
    public static void main(String[] args) {
        Human obj1 = new Human("ox", 11);
        Human obj = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}


class Human {
    private String Name;
    private int Age;

    public Human() {
        Name = "0x";
        Age = 12;

    }

    public Human(String n, int a) {
        this.Name = n;
        this.Age = a;
    }

    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setAge(int age) {
        this.Age = age;
    }    
}