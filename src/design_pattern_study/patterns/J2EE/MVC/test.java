package design_pattern_study.patterns.J2EE.MVC;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test {
    public static void main(String[] args) {

        //从数据可获取学生记录
        Student model  = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
