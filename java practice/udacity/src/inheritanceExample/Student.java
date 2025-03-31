package inheritanceExample;

public class Student extends Person{
    private String studentId;

    public Student(String Name, String Address, String studentId){
        super(Name, Address);
        this.studentId = studentId;
    }

    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return super.toString() + "studentId : " + studentId;
    }
}
