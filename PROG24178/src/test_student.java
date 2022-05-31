public class test_student {

    static int x;
    static String y;
    public static void main(String[] args) {
        student student1 = new student();
        System.out.println("name?" + student1.name);
        System.out.println("age?" + student1.getAge());
        System.out.println("isScienceMajor?"+ student1.isScienceMajor);
        System.out.println("gender?" + student1.gender);
        System.out.println(x);
        System.out.println(y);
    }
}
