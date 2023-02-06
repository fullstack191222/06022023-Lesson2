import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //types of variables
        //full numbers
        byte smallByte =45;
        short shortNumber = 4444;
        int regularNumber = -4554600;  //natural number
        long longNumber = 4554600000435350L;

        //fractional number
        float floatNumber = 5.55f;
        double doubleNumber = 1324567.42342342;

        ////////////////////////////////////////////
       // longNumber = (long)doubleNumber;

        //text variables
        String text = "just text";
        char oneChar = 'g';

        //Boolean true false on/off
        boolean isOn  = true;
        boolean flag = true;
        //boolean logicResult = true && true && false && true && true;

        //boolean logicResult = true || false || false || false;
        //operators arithmetical + - / *

        //operator logical
        // not --->  !
        // and ---> &&
        // or  ---> ||

        //comparison operators  true or false
        // ==
        // <
        // >
        // <=
        // >=
        /*int x = 6;
        int y = 6;
        boolean isEqual = x>y;
                                    //true                       &&         //false
        boolean logicResult = (false || false || x>y || false || x==y) && x>y;

        System.out.println(logicResult);*/

        //Exercise
        //create variable int and put  the number how many years before you finished the school
        //print true if the number is 10 otherwise false to not use if..
       /* int yearsAfterSchool = 18;
        int tenYears = 10;
        //boolean isYearsAfterSchoolTen =  yearsAfterSchool == tenYears; //false
        System.out.println("Did I finish the school before ten years? " + (yearsAfterSchool == tenYears));*/


    /*    Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the some greeting and I will print it");
        String someText = scanner.nextLine();
        System.out.println("and the greeting which you entered is : " + someText);
*/
       /* String greeting = scanner.nextLine();//to take the text from the client
        System.out.println("please enter some number");
        int number = scanner.nextInt(); //to take the int form the client
        System.out.println("please enter double number");
        double doubleNumberInput = scanner.nextDouble();*/

        //EXERCISE
        //Get name family name and age from the
        // client save it in the variables and print in the end name family name and age.

       /* //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        //ask user for the name
        System.out.println("please enter your name");
        String name;
        //get the name from the user
        name = scanner.nextLine();
        //ask user for surname
        System.out.println("please enter your surName");
        //get surname from the user
        String surName = scanner.nextLine();
        //asks user to enter the age
        System.out.println("please enter your age");
        //get age (int) from the user
        int age = scanner.nextInt();

        //prints full string with all the input from the user
        System.out.println("my name is : " + name);
        System.out.println(" and my surname is : " + surName);
        System.out.println(" and my age is : " + age);
        */

        //More operators
        // ++  -- += -= ....
        int num = 2;
        //need to add 1
        num = num + 1;//num = 3
        //add 1 with ++
        num++;//num= 4
        num--;//num = 3
        //to add 5 to num
        num = num + 5 ;//8
        //to add 5 to num this is the same as num = num + 5
        num += 5;//13

        //to reduce num by 4
        num = num - 4;//9

        //to reduce 4 with -=
        num -= 4;//5

        num = num*4;//20

        //to multiply by 4 with *=
        num *= 4;//80

        System.out.println(num);







    }
}
