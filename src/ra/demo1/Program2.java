package ra.demo1;

public class Program2 {
    public static void main(String[] args) {
        Person person = new Person("Hoàng",18,true);
        person.hello();
        Student student = new Student("Hằng",18,false,"B12");
        student.reLearn();
        System.out.println("Thong tinh cua sinh vien "+student.toString());
    }
}
