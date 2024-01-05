package prac41;

// Superclass Учащийся (Student)
class Student {
    private String name; // Имя
    private int age; // Возраст

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass Школьник (SchoolStudent)
class SchoolStudent extends Student {
    private int grade; // Класс (год обучения)

    public SchoolStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

// Subclass Студент (UniversityStudent)
class UniversityStudent extends Student {
    private String university; // Университет

    public UniversityStudent(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}
