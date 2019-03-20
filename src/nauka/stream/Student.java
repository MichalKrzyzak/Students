package nauka.stream;

class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private double height;

    static class Builder {

        private String firstName = null;
        private String lastName = null;
        private String gender = null;
        private double height = 0;

        Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder height(double height) {
            this.height = height;
            return this;
        }

        Student build() {
            return new Student(this);
        }

    }

    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.height = builder.height;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getGender() {
        return gender;
    }

    double getHeight() {
        return height;
    }
}