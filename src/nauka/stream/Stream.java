package nauka.stream;

import java.util.List;

class Stream {

    void filterStudents(List<Student> studentList){
        System.out.println("First Stream...");
        studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("k"))
                .map(student -> student.getFirstName())
                .forEach(System.out::println);

        System.out.println("Second Stream...");
        studentList.stream()
                .filter(student -> student.getHeight()>1.7)
                .map(student -> student.getFirstName())
                .forEach(System.out::println);
    }
}