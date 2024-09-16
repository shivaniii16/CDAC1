public class _4Students {
    private String name;
    private int age;
    private String studentID;

    public _4Students(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public static void main(String[] args) {
        _4Students student = new _4Students("Riya", 20, "R12");
        System.out.println("Student[name=" + student.getName() + ", age=" + student.getAge() + ", studentID=" + student.getStudentID() + "]");
    }
}