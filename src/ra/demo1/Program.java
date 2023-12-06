package ra.demo1;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Hang Tran");
        person.setAge(18);
        person.setSex(false);

        person.hello();

        // khoi tao doi tuong sutdent
        Student student = new Student();
        student.setStudentCode("B212");
        student.setFullName("Hang Nga");
        student.setAge(19);
        student.setSex(false);
        student.hello();
        student.reLearn();
    }
}
