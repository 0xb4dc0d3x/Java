import java.util.Scanner;

public class PracticeSix {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("لطفا عدد تمرین مورد نظر را بنویسید\n");
            System.out.println("1- متدی بنویسید که ب.م.م دو عدد را چاپ کند");
            System.out.println("2- متدی بنویسید که عدد صحیح n را گرفته و فاکتوریل آنرا چاپ کند");
            System.out.println("3- متدی بنویسید که دنباله فیبوناچی را کمتر از 10000 را چاپ کند");
            System.out.println("4- متدی بنویسید که اعداد اول دنباله فیبوناچی را تا 10000 چاپ کند");
            System.out.println("5- متدی بنویسید که عدد صحیح n را گرفته و 0 های آنرا پاک کند");
            int Choice = input.nextInt();
            if(Choice>=1 && Choice<=5){
                switch (Choice){
                    case 1:
                        System.out.println("تمرین اول");
                        BMM();
                        break;
                    case 2:
                        System.out.println("تمرین دوم");
                        Factor();
                        break;
                    case 3:
                        System.out.println("تمرین سوم");
                        Fibo(1);
                        break;
                    case 4:
                        System.out.println("تمرین چهارم");
                        Fibo(2);
                        break;
                    case 5:
                        System.out.println("تمرین پنجم");
                        rmZero();
                        break;
                }
            }
            else{
                System.out.println("عدد مورد نظر بین 1 تا 5 پنج است");
            }
        }
        public static void BMM(){
            int a, b, i;
            Scanner intput = new Scanner(System.in);
            System.out. println("عدد اول را وارد کنید");
            a = intput.nextInt();// 12
            System.out. println("عدد دوم را وارد کنید");
            b = intput.nextInt();// 6
            if (a > b)
                i = a;
            else
                i = b;

            while ((a % i != 0) || (b % i != 0)) { // اگر یکی از این ها درست بود انقدر از i کم میشه که هر رو = 0 بشوند
                i--;
            }
            System.out. println("ب.م.م " + a + " و " + b + " میشود " + i);
        }
        public static void Factor() {
            long n;
            long fact = 1;
            Scanner input = new Scanner(System.in);
            System.out. println("عدد را وارد کنید");
            System.out. println("محدودیت تا 25");
            System.out.println("به دلیل محدودیت در متغیر int تا فاکتوریل عدد 19 قابل حل است");
            System.out.println("به دلیل محدودیت در متغیر long تا فاکتوریل عدد 25 قابل حل است");
            n = input.nextInt();
            if (n<=25 && n>=1){
                for (long i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out. println("فاکتوریل " + n + " میشود " + fact);
            }
            else{
                System.out.println("به دلیل محدودیت در متغیر int تا فاکتوریل عدد 19 قابل حل است");
                System.out.println("به دلیل محدودیت در متغیر long تا فاکتوریل عدد 25 قابل حل است");
            }

        }
        public static void Fibo(int x){
            int a = 1;
            int b = 1;
            // چون دو عدد اول دنباله 1 هستند

            int c = 0;

            if(x==1){
                System.out.println("0");
                System.out.println(a);
                System.out.println(b);
                while (a + b <= 10000) {
                    c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
            }
            else{
                while (a + b <= 10000) {
                    c = a + b;
                    if(PrimeFibo(c)==true){
                        System.out.println(c+" ");
                    }
                    a = b;
                    b = c;
                }
            }

        }
        public static boolean PrimeFibo(int n){
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void rmZero(){
            Scanner input = new Scanner(System.in);
            System.out. println("عدد را وارد کنید");
            int num = input.nextInt();

            int result = 0;
            int multiplier = 1;
            while(num != 0) {
                int rm = num % 10;
                if(rm != 0) {
                    result = result + rm * multiplier;
                    multiplier = multiplier * 10;
                }
                num = num / 10;
            }
            System.out.println(result);























        }
}



