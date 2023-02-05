import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //method1(args);
        //int max = GetMax(10,7,4);
        //System.out.println(max);

        //int min = GetMin(10, 7, 4);
        //System.out.println(min);

        // System.out.println(isEven(4));

        // System.out.println(name(args));

        /* Car skoda = new Car();
        System.out.println(skoda);
        skoda.stop = "not moving";
        skoda.moving = "is moving";
        skoda.start = "starting the engines";

        System.out.println(skoda.stop);
        System.out.println(skoda.moving);
        System.out.println(skoda.start);
         */

        /*Driver emil = new Driver();
        System.out.println(emil);
        emil.name = "emil";
        emil.age = 23;
        emil.isDriving = false;

        System.out.println(emil.name);
        System.out.println(emil.age);
        System.out.println(emil.isDriving);
         */

        Employee gustav = new Employee("gustav","friis",10000);
        Employee laura = new Employee("laura","friis",30000);

    }

    public static void method1(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if(age <= 18){
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static int GetMax(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));  //if you have more than 3 values then its smarter to use loops because you end up nesting a lot of the code
    }

    public static int GetMin(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }

    public static boolean isEven(int number){
        return number % 2 == 0; // % == 0 checks if the integer will ever reach 0 if divided by 2.
    }

    public static String name(String[] name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.nextLine();

        System.out.println("Enter your middle name");
        String middleName = sc.nextLine();

        System.out.println("Enter your last name");
        String lastName = sc.nextLine();

        String abbreviatedFName = firstName.substring(0,1).toUpperCase();
        String abbreviatedMName = middleName.substring(0,1).toUpperCase();

        return "Welcome " + abbreviatedFName +"." + abbreviatedMName+". " + lastName;
    }
}
