package Package6;

public class MergeSort {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) return;

        int mid = n / 2;
        Student[] l = new Student[mid];//левый и правый подмассивы
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);//рекурсивная сортировке для обеих половин
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);//слияние половин
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getNum() - (r[j].getNum()) <= 0) {//выбираеи меньший из элементов и помещаем в исходный массив
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {//оставшиеся элем из подмассивов копируются в исходный
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
