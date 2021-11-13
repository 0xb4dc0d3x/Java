import java.util.Scanner;
public class PractiveFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("لطفا عدد تمرین مورد نظر را بنویسید\n");
        System.out.println("1- متدی بنویسید که تمام اعداد 4 رقمی را چاپ کند");
        System.out.println("2- متدی بنویسید که تمام اعداد 4 رقمی که یکان و دهگان آن برار است را چاپ کند");
        System.out.println("3- متدی بنویسید که تمام اعداد 4 رقمی که از دو سمت یکسان خوانده میشود را چاپ کند");
        System.out.println("4- متدی بنویسید که تعداد ارقام عدد صحیح ورودی را چاپ کند");
        System.out.println("5- متدی بنویسید که عدد صحیح ورودی را گرفته و 2 برابر معکوس آن را چاپ کند");
        int Choice = input.nextInt();
        if(Choice>=1 && Choice<=5){
            switch (Choice){
                case 1:
                    System.out.println("تمرین اول");
                    printEven();
                    break;
                case 2:
                    System.out.println("تمرین دوم");
                    printUnitsTens();
                    break;
                case 3:
                    System.out.println("تمرین سوم");
                    printTwoSide();
                    break;
                case 4:
                    System.out.println("تمرین چهارم");
                    printIntLength();
                    break;
                case 5:
                    System.out.println("تمرین پنجم");
                    printReverse();
                    break;
            }
        }
        else{
            System.out.println("عدد مورد نظر بین 1 تا 5 پنج است");
        }
    }
    public static void printEven(){
        System.out.println("اعداد 4 رقمی زوج:");
        for (int i = 1000; i <= 9999; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void printUnitsTens(){
        System.out.println("اعداد 4 رقمی که یکان و دهگان برابر باشد:");
        for(int i = 1000; i<=9999; i++){
            int getTens = i/10;
            int getUnit = i%10;
            int getTen = getTens%10;
            if(getTen == getUnit){
                System.out.print(i + " ");
            }
        }
    }
    public static void printTwoSide(){
        System.out.println("اعداد 4 رقمی که از 2 سمت یکسان خوانده میشوند:");
        for(int i = 1000; i<=9999; i++){
            int getThousand = i/1000;
            int getHundred = (i%1000)/100;
            int getTens = ((i%1000)%100)/10;
            int getUnits = ((i%1000)%100)%10;
            if(getThousand==getUnits && getHundred==getTens){
                System.out.print(i + " ");
            }
        }
    }
    public static void printIntLength(){
        // max value of int = 2147483647
        // min value of int = -2147483648

        Scanner input = new Scanner(System.in);
        System.out.println("یک عدد وارد کنید");
        System.out.println("حداقل مقدار مجاز");
        System.out.println("از ۲۱۴۷۴۸۳۶۴۸-");
        System.out.println(" تا ۲۱۴۷۴۸۳۶۴۷");
        System.out.println("می باشد");
        int in = input.nextInt();

        int length = 0;
        long i = 1;
        if(in>=1 && in<=2147483647){
            while (i <= in) {
                length++;
                i = i * 10;
            }
            System.out.println(length);
        }
        else if(in>=-2147483648 && in <=-1){
            while (i >= in){
                length++;
                i = i * -10;
            }
            System.out.println(length);
        }
        else
        {
            System.out.println("عدد درست وارد کنید");
        }
    }

    public static void printReverse()
    {
            {
                System.out.println("عدد را وارد کنید");
                Scanner in = new Scanner(System.in);

                int num = in.nextInt();
                int reverseNum = 0;
                if (num >=1){
                    while (num > 0) {
                        reverseNum = reverseNum * 10 + num % 10;
                        num = num / 10;
                    }
                    System.out.println("برعکس عدد :"+reverseNum);
                    System.out.println("برعکس عدد ضرب در 2 :"+reverseNum*2);
                }
                else if(num <= -1){
                    while (num < 0){
                        reverseNum = reverseNum * 10 + num % 10;
                        num = num / 10;
                    }
                    System.out.println("برعکس عدد :"+reverseNum);
                    System.out.println("برعکس عدد ضرب در 2 :"+reverseNum*2);
                }

            }
    }
}
//int num;
//int reverseNum =0;
// System.out.println("عدد را وارد کنید");
// Scanner in = new Scanner(System.in);
//  num = in.nextInt();
//  while( num != 0 )
//  {
//       reverseNum = reverseNum * 10;
//       reverseNum = reverseNum + num%10;
//      num = num/10;
//  }
//  System.out.println("برعکس عدد :"+reverseNum);
//  System.out.println("برعکس عدد ضرب در 2 :"+reverseNum*2);
