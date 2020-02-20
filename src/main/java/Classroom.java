import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public Classroom(){
    }

    public Classroom(String classRoomName){
        this.classRoomName = classRoomName;
    }

    public List<Student> studentList = new ArrayList<>();
    public String classRoomName;

    public void addStudent(Student student){

    }
}
