package ra.demo1;

public class Student extends Person{
    private String studentCode;
    public Student() {
    }

//    public Student(String fullName, int age, boolean sex, String studentCode) {
////        this.setFullName(fullName);
////        this.setSex(sex);
////        this.setAge(age);
//        this.studentCode = studentCode;
//    }


    public Student(String fullName, int age, boolean sex, String studentCode) {
        super(fullName, age, sex);
        this.studentCode = studentCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void reLearn(){
//        this.hello();
        super.hello();

        System.out.println("Mã SV "+studentCode+"Họ tên"+getFullName()+" đang học lại");
    }

    public String toString(){
        return "Student[name="+super.getFullName()+"]";
    }
}

