package Package6;

import static Package6.MergeSort.mergeSort;

public class TestStudent {
    public static void main(String[] args) {
        Student[] mas = new Student[10];

        mas[0] = new Student(123, 4);
        mas[1] = new Student(234, 3);
        mas[2] = new Student(765, 4);
        mas[3] = new Student(890, 5);
        mas[4] = new Student(104, 3);
        mas[5] = new Student(428, 3);
        mas[6] = new Student(205, 3);
        mas[7] = new Student(880, 4);
        mas[8] = new Student(555, 5);
        mas[9] = new Student(904, 4);

        System.out.println("Task 1");
        for (int i = 1; i < mas.length; i++){
            Student cur = mas[i];
            int j = i;
            while (j > 0 && mas[j-1].getNum() > cur.getNum()){
                mas[j] = mas[j-1];
                j--;
            }
            mas[j] = cur;
        }

        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i].getNum()+" "+mas[i].getGPA()+"; ");
        }

        System.out.println("\nTask 2");
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.qSort(mas, mas.length - 1, 0);
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i].getNum()+" "+mas[i].getGPA()+"; ");
        }

        System.out.println("\nTask 3");
        Student[] mas2 = new Student[4];
        mas2[0] = new Student(125, 5);
        mas2[1] = new Student(321, 3);
        mas2[2] = new Student(650, 4);
        mas2[3] = new Student(809, 4);
        Student a = new Student(0, 0);

        Student[] allStudents = new Student[mas.length + mas2.length];
        System.arraycopy(mas, 0, allStudents,0, mas.length);
        System.arraycopy(mas2, 0, allStudents,mas.length, mas2.length);
        mergeSort(allStudents, allStudents.length);

        for (int i = 0; i < allStudents.length; i++){
            System.out.print(allStudents[i].getNum()+" "+allStudents[i].getGPA()+"; ");
        }
    }
}