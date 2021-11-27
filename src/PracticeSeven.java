import java.util.Scanner;
public class PracticeSeven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("لطفا عدد تمرین مورد نظر را بنویسید\n");
        System.out.println("1- متدی بنویسید 100 عدد تصادفی بین 1000 و 10000 را تولید کرده و در صورتی که اول باشد چاپ کند");
        System.out.println("2- متدی بنویسید 100 عدد تصادفی بین 1000 و 10000 را تولید کرده و بزرگترین عدد و کوچکترین عدد و میانگین اعداد تولید شده را چاپ کند");
        System.out.println("3- متدی بنویسید 100 عدد تصادفی بین 1000 و 10000 را تولید کرده و در صورتی که جزء سری فیبوناچی باشد چاپ کند");
        System.out.println("4- متدی بنویسید 5 عدد تصادفی بین 100 و 200 را تولید کرده و آنها را به شکل صعودی چاپ کند");
        int Choice = input.nextInt();
        if(Choice>=1 && Choice<=4){
            switch (Choice){
                case 1:
                    System.out.println("تمرین اول");
                    genHundredPrime();
                    break;
                case 2:
                    System.out.println("تمرین دوم");
                    genBiggestAndSmallestAndAverage();
                    break;
                case 3:
                    System.out.println("تمرین سوم");
                    genNumberInFibonacci();
                    break;
                case 4:
                    System.out.println("تمرین چهارم");
                    genFiveNumber();
                    break;
            }
        }
        else{
            System.out.println("عدد مورد نظر بین 1 تا 4 پنج است");
        }
    }
    //------------------------------------------//
    public static void genHundredPrime(){
        int min = 1000;
        int max = 10000;
        System.out.println("Generating 100 numbers...");
        System.out.println("From 100 numbers that I've been generated, these are prime: ");
        for(int i = 1; i <=100; i++) {
            int result = (int) (Math.random() * (max - min)) + min;
            if(isPrime(result))
            System.out.println(result);
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //------------------------------------------//
    public static void genBiggestAndSmallestAndAverage(){
        int min = 1000;
        int max = 10000;
        int a = 0;
        int maximum = 1001;
        int minimum = 9999;
        System.out.println("Generating 100 numbers...");
        for(int i = 1; i <=100; i++) {
            int result = (int) (Math.random() * (max - min)) + min;
            System.out.println(result);
            a = result + a;

            if(result < minimum)
            {
                minimum = result;
            }
            else if(result > maximum)
            {
                maximum = result;
            }
        }
        System.out.println("Minimum: "+minimum);
        System.out.println("Maximum: "+maximum);
        int average = a/100;
        System.out.println("Average of these numbers is: "+average);
    }
    //------------------------------------------//
    public static void genNumberInFibonacci(){
        int min = 1000;
        int max = 10000;
        System.out.println("Generating 100 numbers...");
        System.out.println("! * The numbers are very unlikely to be in the fibonacci series. * !");
        System.out.println("From 100 numbers that I've been generated, these are in fibonacci series: ");
        for(int i = 1; i <=100; i++) {
            int result = (int) (Math.random() * (max - min)) + min;
            //System.out.println(result);
            if(isFibonacci(result))
                System.out.println(result);
        }
    }
    public static boolean isFibonacci(int f){
        int a = 1;
        int b = 1;
        int c = 0;
        while (a + b < 10000) {
            c = a + b;
            if (c == f)
                return true;
            a = b;
            b = c;
        }
        return false;
    }
    //------------------------------------------//
    public static void genFiveNumber() {
        int min = 100;
        int max = 200;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int i = 1;
        System.out.println("Generating 5 numbers...");
        while (i <=5) {
            if(i ==1){
                result1 = (int) (Math.random() * (max - min)) + min;
            }
            if(i ==2){
                result2 = (int) (Math.random() * (max - min)) + min;
            }
            if(i ==3){
                result3 = (int) (Math.random() * (max - min)) + min;
            }
            if(i ==4){
                result4 = (int) (Math.random() * (max - min)) + min;
            }
            if(i ==5){
                result5 = (int) (Math.random() * (max - min)) + min;
            }
            i++;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println("---------- Sort ascending numbers ----------");
        if(result1>result2 && result1>result3 && result1>result4 && result1>result5){
            if(result2>result3 && result2>result4 && result2>result5){
                if(result3>result4 && result3>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                    }
                }
                if(result4>result3 && result4>result5){

                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                    }
                }
                if(result5>result4 && result5>result3){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                        

                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                    }
                }
            }
            if(result3>result2 && result3>result4 && result3>result5){
                if(result2>result4 && result2>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                }
                if(result4>result2 && result4>result5){
                    System.out.println(result4);
                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                }
                if(result5>result4 && result5>result2){
                    
                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                    }
                }
            }
            if(result4>result2 && result4>result3 && result4>result5){
                if(result2>result3 && result2>result5){
                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                    }
                }
                if(result3>result2 && result3>result5){
                    
                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);

                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);
                    }
                }
                if(result5>result3 && result5>result2){
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                    }
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                    }
                }
            }
            if(result5>result2 && result5>result3 && result5>result4){
                if(result2>result3 && result2>result4){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                }
                if(result3>result2 && result3>result4){
                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                }
                if(result4>result3 && result4>result2){
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                    }
                }
            }
        }
        if(result2>result1 && result2>result3 && result2>result4 && result2>result5){
            if(result1>result3 && result1>result4 && result1>result5){
                if(result3>result4 && result3>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                    }
                }
                if(result4>result3 && result4>result5){

                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                    }
                }
                if(result5>result4 && result5>result3){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);


                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);
                    }
                }
            }
            if(result3>result1 && result3>result4 && result3>result5){
                if(result1>result4 && result1>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                }
                if(result4>result1 && result4>result5){
                    System.out.println(result4);
                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                }
                if(result5>result4 && result5>result1){

                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                    }
                }
            }
            if(result4>result1 && result4>result3 && result4>result5){
                if(result1>result3 && result1>result5){
                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                    }
                }
                if(result3>result1 && result3>result5){

                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);

                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);
                    }
                }
                if(result5>result3 && result5>result1){
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                    }
                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                    }
                }
            }
            if(result5>result1 && result5>result3 && result5>result4){
                if(result1>result3 && result1>result4){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                }
                if(result3>result1 && result3>result4){
                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                }
                if(result4>result3 && result4>result1){
                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                    }
                }
            }
        }
        if(result3>result2 && result3>result1 && result3>result4 && result3>result5){
            if(result2>result1 && result2>result4 && result2>result5){
                if(result1>result4 && result1>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                    }
                }
                if(result4>result1 && result4>result5){

                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                    }
                }
                if(result5>result4 && result5>result1){
                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);


                    }
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);
                    }
                }
            }
            if(result1>result2 && result1>result4 && result1>result5){
                if(result2>result4 && result2>result5){
                    if(result4>result5){
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                    if(result5>result4){
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                }
                if(result4>result2 && result4>result5){
                    System.out.println(result4);
                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                }
                if(result5>result4 && result5>result2){

                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                    }
                }
            }
            if(result4>result2 && result4>result1 && result4>result5){
                if(result2>result1 && result2>result5){
                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                    }
                }
                if(result1>result2 && result1>result5){

                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);

                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);
                    }
                }
                if(result5>result1 && result5>result2){
                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                    }
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                        System.out.println(result3);
                    }
                }
            }
            if(result5>result2 && result5>result1 && result5>result4){
                if(result2>result1 && result2>result4){
                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                }
                if(result1>result2 && result1>result4){
                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                }
                if(result4>result1 && result4>result2){
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                        System.out.println(result3);
                    }
                }
            }
        }
        if(result4>result2 && result4>result3 && result4>result1 && result4>result5){
            if(result2>result3 && result2>result1 && result2>result5){
                if(result3>result1 && result3>result5){
                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                    }
                }
                if(result1>result3 && result1>result5){

                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                    }
                }
                if(result5>result1 && result5>result3){
                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);


                    }
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result4);
                    }
                }
            }
            if(result3>result2 && result3>result1 && result3>result5){
                if(result2>result1 && result2>result5){
                    if(result1>result5){
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                    if(result5>result1){
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                }
                if(result1>result2 && result1>result5){
                    System.out.println(result1);
                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                }
                if(result5>result1 && result5>result2){

                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result4);
                    }
                }
            }
            if(result1>result2 && result1>result3 && result1>result5){
                if(result2>result3 && result2>result5){
                    if(result3>result5){
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                    }
                    if(result5>result3){
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                    }
                }
                if(result3>result2 && result3>result5){

                    if(result2>result5){
                        System.out.println(result5);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);

                    }
                    if(result5>result2){
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);
                    }
                }
                if(result5>result3 && result5>result2){
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                    }
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result1);
                        System.out.println(result4);
                    }
                }
            }
            if(result5>result2 && result5>result3 && result5>result1){
                if(result2>result3 && result2>result1){
                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                }
                if(result3>result2 && result3>result1){
                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                }
                if(result1>result3 && result1>result2){
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                        System.out.println(result4);
                    }
                }
            }
        }
        if(result5>result2 && result5>result3 && result5>result4 && result5>result1){
            if(result2>result3 && result2>result4 && result2>result1){
                if(result3>result4 && result3>result1){
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                    }
                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result5);
                    }
                }
                if(result4>result3 && result4>result1){

                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                    }
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result5);
                    }
                }
                if(result1>result4 && result1>result3){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);


                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result5);
                    }
                }
            }
            if(result3>result2 && result3>result4 && result3>result1){
                if(result2>result4 && result2>result1){
                    if(result4>result1){
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                    if(result1>result4){
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                }
                if(result4>result2 && result4>result1){
                    System.out.println(result4);
                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                }
                if(result1>result4 && result1>result2){

                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result5);
                    }
                }
            }
            if(result4>result2 && result4>result3 && result4>result1){
                if(result2>result3 && result2>result1){
                    if(result3>result1){
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                    }
                    if(result1>result3){
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result5);
                    }
                }
                if(result3>result2 && result3>result1){

                    if(result2>result1){
                        System.out.println(result1);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);

                    }
                    if(result1>result2){
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result5);
                    }
                }
                if(result1>result3 && result1>result2){
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                    }
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result4);
                        System.out.println(result5);
                    }
                }
            }
            if(result1>result2 && result1>result3 && result1>result4){
                if(result2>result3 && result2>result4){
                    if(result3>result4){
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                    if(result4>result3){
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                }
                if(result3>result2 && result3>result4){
                    if(result2>result4){
                        System.out.println(result4);
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                    if(result4>result2){
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result3);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                }
                if(result4>result3 && result4>result2){
                    if(result3>result2){
                        System.out.println(result2);
                        System.out.println(result3);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                    if(result2>result3){
                        System.out.println(result3);
                        System.out.println(result2);
                        System.out.println(result4);
                        System.out.println(result1);
                        System.out.println(result5);
                    }
                }
            }
        }
    }
}