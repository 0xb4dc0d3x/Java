import java.util.Scanner;
public class PracticeTwo {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter third number");
        num3 = input.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the greatest number");
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3 +" is the greatest number");
        }



        else if (num1==num2 && num3<num1){
            System.out.println(num1 + " is the greatest number" );
        }
        else if (num1==num3 && num2<num1){
            System.out.println(num1 + " is the greatest number" );
        }
        else if (num2==num3 && num1<num2){
            System.out.println(num2 +" is the greatest number" );
        }



        else{
            System.out.println("It will never run");
        }
    }
}
