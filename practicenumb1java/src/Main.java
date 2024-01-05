import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Задание №3
        int summa = 0;
        int[] mass = new int[]{6, 8, 0, 1, 3};
        for (int t = 0; t < 5; t++){
            summa += mass[t];
        }
        System.out.println(summa);


        //Задание №4
        int[] x = new int[5];
        int i = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input 4 numbers: ");
        x[0] = in.nextInt();
        x[1] = in.nextInt();
        x[2] = in.nextInt();
        x[3] = in.nextInt();
        x[4] = in.nextInt();
        while (i>-1 & i<5){
            sum += x[i];
            i = i + 1;
        }
        var min = x[0];
        for (int num : x) {
            if (num < min) {
                min = num;
            }
        }
        var max = x[4];
        for (int num : x) {
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Max number: %d \n", max);
        System.out.printf("Min number: %d \n", min);
        System.out.printf("Summ: %d \n", sum);

        in.close();


        //Задание 5
        System.out.println("Задание №5");
        System.out.println("Heelloo");
        for (int p = 0; p < args.length; p++)
            System.out.printf("Conc %d: %s", p, args[p]);


        //Задание 6
        System.out.println("Задание №6");
        System.out.print("1/k = ");
        for (int k=1; k<11; k++){
            if (k<10){
                System.out.printf("1/"+ k + " + ");
            }
            else {
                System.out.printf("1/" + k);
            }
        }


        //Задание 7
        System.out.println(func.GetFactorial(6));


    }
}
