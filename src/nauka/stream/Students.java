package nauka.stream;

import java.util.ArrayList;
import java.util.List;

public class Students {

    public void filterStudents(){
        Stream stream = new Stream();
        stream.filterStudents(getStudents());
    }

    private List<Student> getStudents() {

        List<Student> studentsList = new ArrayList<>();

        Student student1 = new Student.Builder()
                .firstName("Michał")
                .lastName("Krzyżak")
                .gender("M")
                .height(1.85)
                .build();

        Student student2 = new Student.Builder()
                .firstName("Bartłomiej")
                .lastName("Mroczek")
                .gender("M")
                .build();

        Student student3 = new Student.Builder()
                .firstName("Ania")
                .lastName("Wyciek")
                .gender("K")
                .height(1.68)
                .build();

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        return studentsList;
    }
}
