package design_pattern_study.patterns.J2EE.dataAccObj;

import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
