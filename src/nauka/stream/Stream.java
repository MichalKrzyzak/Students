package nauka.stream;

import java.util.List;

class Stream {

    void filterStudents(List<Student> studentList){

        System.out.println("First Stream...");
        studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("k"))
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .forEach(System.out::println);

        System.out.println("Second Stream...");
        long count = studentList.stream()
                .filter(student -> student.getHeight()>1.7)
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .peek(student -> System.out.println(student))
                .count();

        System.out.println(count);
    }
}