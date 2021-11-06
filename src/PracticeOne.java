import java.util.Scanner;
public class PracticeOne {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        number = input.nextInt();
        if(number >=1 && number <= 9){
            if (number == 1){
                System.out.println("one");
                System.out.println("یک");
            }
            else if (number == 2){
                System.out.println("two");
                System.out.println("دو");
            }
            else if (number == 3){
                System.out.println("three");
                System.out.println("سه");
            }
            else if (number == 4){
                System.out.println("four");
                System.out.println("چهار");
            }
            else if (number == 5){
                System.out.println("five");
                System.out.println("پنج");
            }
            else if (number == 6){
                System.out.println("six");
                System.out.println("شش");
            }
            else if (number == 7){
                System.out.println("seven");
                System.out.println("هفت");
            }
            else if (number == 8){
                System.out.println("eight");
                System.out.println("هشت");
            }
            else if (number == 9){
                System.out.println("nine");
                System.out.println("نه");
            }
            else{
                System.out.println("It will never run");
            }
        }
        else{
            System.out.println(number + " is not valid\n please choose number between 1 and 9");
        }
    }
}
