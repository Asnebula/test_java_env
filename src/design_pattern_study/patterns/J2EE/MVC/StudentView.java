package design_pattern_study.patterns.J2EE.MVC;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
