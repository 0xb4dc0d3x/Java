import java.util.Scanner;
public class PracticeThree {
    public static void main(String[] args){
        int days;
        int day;
        
        Scanner input = new Scanner(System.in);
        System.out.println("روز سال را وارد کنید");
        days = input.nextInt();
        if (days>=1 && days<=366){
            if(days>=1 && days<=186){
                if(days>=1 && days <=31){
                    System.out.println("ماه اول سال");
                    System.out.println("و " + days + " روز");
                }
                else if(days>=32 && days <=62){
                    System.out.println("ماه دوم سال");
                    day = days-32;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if(days>=63 && days <=93){
                    System.out.println("سومین ماه سال");
                    day = days-63;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if(days>=94 && days <=124){
                    System.out.println("چهارمین ماه سال");
                    day = days-94;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if(days >=125 && days <=155){
                    System.out.println("پنجمین ماه سال");
                    day = days-125;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if(days >=156 && days <=186){
                    System.out.println("ششمین ماه سال");
                    day = days-156;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else{
                    System.out.println("It will never run");
                }
            }
            else{
                if (days>=187 && days<=216){
                    System.out.println("هفتمین ماه سال");
                    day = days-187;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if (days>=217 && days<=246){
                    System.out.println("هشتمین ماه سال");
                    day = days-217;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if (days>=247 && days<=276){
                    System.out.println("نهمین ماه سال");
                    day = days-247;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if (days>=277 && days<=306){
                    System.out.println("دهمین ماه سال");
                    day = days-277;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if (days>=307 && days<=336){
                    System.out.println("یازدهمین ماه سال");
                    day = days-307;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if (days>=337 && days<=365){
                    System.out.println("دوازدهمین ماه سال");
                    day = days-337;
                    ++day;
                    System.out.println("و " + day + " روز");
                }
                else if(days ==366){
                    System.out.println("سال کبیسه");
                    System.out.println("ماه دوازدهم");
                    System.out.println("30امین روز");
                }
                else {
                    System.out.println("It will never run");
                }
            }
        }
        else{
            System.out.println(days + " is not valid");
        }
    }
}