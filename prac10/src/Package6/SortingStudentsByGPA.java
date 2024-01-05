package Package6;
import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Object> {//Comparator<Student>
    @Override
    public int compare(Object ob1, Object ob2) {
        return (((Student)ob1).getGPA() - ((Student)ob2).getGPA());
    }

    public static void swap(Student[] mas, int i, int j) {
        Student temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

    private  static SortingStudentsByGPA comp = new SortingStudentsByGPA();
    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;//во избежание лишних обращений к методу
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(!left.isEmpty()) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(!right.isEmpty()) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }
}
