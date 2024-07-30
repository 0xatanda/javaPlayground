public class throwss {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try {
            j = 18/ i;
            if (j == 0) {
                throw new NafiuExceptions("cannnot print zero");
            }
            

        } catch (NafiuExceptions e) {
            j = 18/1;
            System.out.println("this is the defult output "  + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in your limit");
        }


        System.out.println(j);
    }
}

class NafiuExceptions extends RuntimeException {
    public NafiuExceptions(String string) {
        super(string);
    }
}