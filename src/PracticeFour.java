import java.util.Scanner;
public class PracticeFour {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("یک عدد 3رقمی وارد کنید");
        number = input.nextInt();
        if (number>=100 && number <=999) {
            getAdad(number);
        }
        else{
            System.out.println("لطفا یک عدد بین 100 تا 999 وارد کنید");
        }
    }
    public static void getAdad(int number){
        int hundred = number/100;
        if(number>=100 && number<=199){
            if(number>110&&number<120){
                System.out.print("صد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("صد و ");
                getDahgan0(number);
            }
        }
        else if(number>=200 && number<=299){
            if(number>210&&number<220){
                System.out.print("دویست و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("دویست و ");
                getDahgan0(number);
            }
        }
        else if(number>=300 && number<=399){
            if(number>310&&number<320){
                System.out.print("سیصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("سیصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=400 && number<=499){
            if(number>410&&number<420){
                System.out.print("چهارصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("چهارصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=500 && number<=599){
            if(number>510&&number<520){
                System.out.print("پانصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("پانصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=600 && number<=699){
            if(number>610&&number<620){
                System.out.print("ششصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("ششصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=700 && number<=799){
            if(number>710&&number<720){
                System.out.print("هفتصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("هفتصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=800 && number<=899){
            if(number>810&&number<820){
                System.out.print("هشتصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("هشتصد و ");
                getDahgan0(number);
            }
        }
        else if(number>=900 && number<=999){
            if(number>910&&number<920){
                System.out.print("نهصد و ");
                getYazdah(number);
            }
            else if (number%100==0){
                getSadgan(hundred);
            }
            else {
                System.out.print("نهصد و ");
                getDahgan0(number);
            }
        }
        else{
            System.out.println("404");
        }
    }
    public static void getDahgan0(int ten){
        int tens = ten%100;
        int shart = ten%10;
        if(shart == 0){
            switch (tens){
                case 20:
                    System.out.print(" بیست  ");
                    break;
                case 30:
                    System.out.print(" سی  ");
                    break;
                case 40:
                    System.out.print(" چهل  ");
                    break;
                case 50:
                    System.out.print(" پنجاه  ");
                    break;
                case 60:
                    System.out.print(" شصت  ");
                    break;
                case 70:
                    System.out.print(" هفتاد  ");
                    break;
                case 80:
                    System.out.print(" هشتاد  ");
                    break;
                case 90:
                    System.out.print(" نود  ");
                    break;
            }
        }
        else{
            getDahgan1(tens);
        }
    }
    public static void getDahgan1(int dahagn){
        int dahagnAdad = dahagn/10;
        int YekanAdad = dahagn%10;
        switch (dahagnAdad) {
            case 2:
                System.out.print(" بیست و ");
                break;
            case 3:
                System.out.print(" سی و ");
                break;
            case 4:
                System.out.print(" چهل و ");
                break;
            case 5:
                System.out.print(" پنجاه و ");
                break;
            case 6:
                System.out.print(" شصت و ");
                break;
            case 7:
                System.out.print(" هفتاد و ");
                break;
            case 8:
                System.out.print(" هشتاد و ");
                break;
            case 9:
                System.out.print(" نود و ");
                break;
        }
        getYekan(YekanAdad);
    }
    public static void getYekan(int one){
        switch (one){
            case 1:
                System.out.print(" یک ");
                break;
            case 2:
                System.out.print(" دو ");
                break;
            case 3:
                System.out.print(" سه ");
                break;
            case 4:
                System.out.print(" چهار ");
                break;
            case 5:
                System.out.print(" پنج ");
                break;
            case 6:
                System.out.print(" شش ");
                break;
            case 7:
                System.out.print(" هفت ");
                break;
            case 8:
                System.out.print(" هشت ");
                break;
            case 9:
                System.out.print(" نه ");
                break;
        }
    }
    public static void getYazdah(int eleven){
        int tens = eleven%100;
        switch (tens){
            case 11:
                System.out.print(" یازده ");
                break;
            case 12:
                System.out.print(" دوازده ");
                break;
            case 13:
                System.out.print(" سیزده ");
                break;
            case 14:
                System.out.print(" چهارده ");
                break;
            case 15:
                System.out.print(" پانزده ");
                break;
            case 16:
                System.out.print(" شانزده ");
                break;
            case 17:
                System.out.print(" هفده ");
                break;
            case 18:
                System.out.print(" هجده ");
                break;
            case 19:
                System.out.print(" نوزده ");
                break;
        }
    }
    public static void getSadgan(int hundred){
        switch (hundred){
            case 1:
                System.out.print(" صد ");
                break;
            case 2:
                System.out.print(" دویست ");
                break;
            case 3:
                System.out.print(" سیصد ");
                break;
            case 4:
                System.out.print(" چهارصد ");
                break;
            case 5:
                System.out.print(" پانصد ");
                break;
            case 6:
                System.out.print(" ششصد ");
                break;
            case 7:
                System.out.print(" هفصد ");
                break;
            case 8:
                System.out.print(" هشصد ");
                break;
            case 9:
                System.out.print(" نهصد ");
                break;
        }
    }
}