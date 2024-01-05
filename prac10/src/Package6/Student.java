package Package6;

public class Student {
    private int iDNumber;
    private int GPA;
    Student(int idnumber, int gpa){
        this.iDNumber = idnumber;
        this.GPA = gpa;
    }

    public int getNum(){
        return iDNumber;
    }
    public void setNum(int idnumber){
        this.iDNumber = idnumber;
    }
    public int getGPA(){
        return GPA;
    }
    public void setGPA(int gpa){
        this.GPA = gpa;
    }
    public static Student[] merge(Student[] a, Student[] b){
        Student[] mass = new Student[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            mass[k++] = a[i].getNum() < b[j].getNum() ? a[i++] : b[j++];
        while (j < b.length)
            mass[k++] = b[j++];
        return mass;
    }
}