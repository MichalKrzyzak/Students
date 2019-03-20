package nauka.stream;

import java.util.ArrayList;
import java.util.List;

public class Students{

    public void filterStudents() {
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

        Student student4 = new Student.Builder()
                .firstName("Janina")
                .lastName("Kanał")
                .gender("K")
                .height(1.62)
                .build();

        Student student5 = new Student.Builder()
                .firstName("Krzysztof")
                .lastName("Wypływ")
                .gender("M")
                .height(2.1)
                .build();

        Student student6 = new Student.Builder()
                .firstName("Adrian")
                .lastName("Anatowski")
                .gender("M")
                .height(1.79)
                .build();

        Student student7 = new Student.Builder()
                .firstName("Zbigniew")
                .lastName("Małecki")
                .gender("M")
                .height(1.82)
                .build();

        Student student8 = new Student.Builder()
                .firstName("Dominik")
                .lastName("Chmiel")
                .gender("M")
                .height(1.81)
                .build();

        Student student9 = new Student.Builder()
                .firstName("Daria")
                .lastName("Wanatowicz")
                .gender("K")
                .build();

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);
        studentsList.add(student7);
        studentsList.add(student8);
        studentsList.add(student9);

        return studentsList;
    }
}