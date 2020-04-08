import com.chen.app.dao.StudentDto;
import com.chen.app.entity.Student;
import com.chen.app.mapstruct.StudentMapper;

public class MyTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("李白");
        student.setAddress("唐朝");
        student.setHobby(new String[]{"写诗","喝酒"});

        StudentDto studentDto = StudentMapper.INSTANCE.student2StudentDto(student);
        System.out.println(studentDto);
    }
}
