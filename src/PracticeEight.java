import java.util.*;

public class PracticeEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("لطفا عدد تمرین مورد نظر را بنویسید\n");
        System.out.println("1- متدی بنویسید 5 عدد تصادفی بین 100 و 200 را تولید کرده و آنها را به شکل صعودی چاپ کند");
        System.out.println("2- متدی بنویسید یک آرایه به طول 20 را گرفته و مقادیر آنرا با فیبوناچی پر کند");
        System.out.println("3- متدی بنویسید 2 آرایه مرتب صعودی به طول 10 را در یک آرایه به طول 20 به شکل مرتب ادغام کند");
        int Choice = input.nextInt();
        if(Choice>=1 && Choice<=3){
            switch (Choice){
                case 1:
                    System.out.println("تمرین اول");
                    generateNumbersAndSort();
                    break;
                case 2:
                    System.out.println("تمرین دوم");
                    fibonacciGenerator();
                    break;
                case 3:
                    System.out.println("تمرین سوم");
                    arrayGenerator();
                    break;
            }
        }
        else{
            System.out.println("عدد مورد نظر بین 1 تا 3 است");
        }
    }
    public static void generateNumbersAndSort() {
        int min = 100;
        int max = 200;
        int[] storeNumbers = new int[5];
        for (int i = 0; i < storeNumbers.length; i++) {
            int generate = (int) (Math.random() * (max - min)) + min;
            storeNumbers[i] = generate;
            System.out.println(storeNumbers[i]);
        }
        Arrays.sort(storeNumbers);
        System.out.println("------Sorting------");
        System.out.println(Arrays.toString(arraySorter(storeNumbers)));
    }
    public static void fibonacciGenerator(){
        int[] fibonacci = new int[20];
        int a = 1;
        fibonacci[0] = a;
        int b = 1;
        fibonacci[1] = b;
        int c = 0;
        int i = 2;

        while (a + b < 10000) {
            c = a + b;
            if(i<=19)
                fibonacci[i]=c;
            a = b;
            b = c;
            i++;
        }
        System.out.println("--------Fibonacci in Array--------");
        System.out.println(Arrays.toString(fibonacci));
    }
    public static void arrayGenerator(){
        int[] x = new int[10];
        int[] y = new int[10];
        int min = 1;
        int max = 10000;
        for(int i = 0; i <= 9 ; i++) {
            int resultA1 = (int) (Math.random() * (max - min)) + min;
            x[i] = resultA1;
            int resultA2 = (int) (Math.random() * (max - min)) + min;
            y[i] = resultA2;
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println("--------Merging and Sorting 2 Arrays--------");
        System.out.println(Arrays.toString(arraySorter(x, y)));
    }
    public static int[] arraySorter(int[]x){
        Arrays.sort(x);
        return x;
    }
    public static int[] arraySorter(int[]x,int[]y){
        int[] z = new int[20];
        Arrays.sort(x);
        Arrays.sort(y);
        System.arraycopy(x, 0, z, 0, 10);
        System.arraycopy(y, 0, z, 10, 10);
        arraySorter(z);
        return z;
    }
}