package nauka.stream;

import java.util.Comparator;
import java.util.List;

class Stream {

    void filterStudents(List<Student> studentList) {

        System.out.println("First Stream...");
        studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("k"))
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .forEach(System.out::println);

        System.out.println("\nSecond Stream...");
        long count = studentList.stream()
                .filter(student -> student.getHeight() > 1.7)
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .peek(student -> System.out.println(student))
                .count();
        System.out.println(count);

        System.out.println("\nThird Stream...");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .forEachOrdered(System.out::println);

        System.out.println("\nFourth Stream...");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .forEachOrdered(System.out::println);

        System.out.println("\nFifth Stream...");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getHeight))
                .map(student -> (new StringBuilder(student.getFirstName()).append(" ").append(student.getLastName()).toString()))
                .forEachOrdered(System.out::println);
    }
}