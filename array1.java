public class array1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "wunmi";
        s1.marks = 99;


        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "0x";
        s2.marks = 99;


        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Nafiu";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollno + " : " + students[i].name + " : " + students[i].marks);
        }

        System.out.println();
        System.out.println();

        for(Student stud : students) {
            System.out.println(stud.rollno + " : " + stud.name + " : " + stud.marks);
        }

        System.out.println();
        System.out.println();


        int num[] = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 4;

        for (int n : num){
            System.out.println(n);
        }
    }
}


class Student {
    int rollno;
    String name;
    int marks;
}