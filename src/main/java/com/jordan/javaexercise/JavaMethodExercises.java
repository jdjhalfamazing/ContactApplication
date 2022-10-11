package com.jordan.javaexercise;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaMethodExercises {
    public static void main(String[] args) {
        JavaMethodExercises methods = new JavaMethodExercises();
        //String[] studentNames = {"Joseph", "Tricia", "John"};
        String[] students = {"Amy", "Jeffery", "Jennifer", "Amber"};

        //String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] numbers = {300, 400, 9, 444, 344, 344, 2222, 441, 333};
        int[] numbers2 = {3, 4, 2, 4, 3, 3, 2, 44, 33};
        int[] numbers3 = {103, 4, 2, 4, 3, 3, 2, 44, 33};


        System.out.println(methods.isOver30(20));
        System.out.println(methods.addTwoNumbers(2, 2));
        System.out.println(methods.subtractTwoNumbers(22, 2));
        int sum;
        String[] studentNames = {"Joseph", "John","Sara"};
                methods.hello(studentNames);
        System.out.println(methods.sum(numbers));
        System.out.println(methods.absoluteDifference(20, 22));
        System.out.println(methods.dayOfWeek(2));
        System.out.println(methods.oddNumbers(45));
        System.out.println(methods.evenNumbers(28));
        System.out.println(methods.upperCase("return-uppercase"));
        System.out.println(methods.lowerCase("RETURN-LOWERCASE"));


        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(22);
        numbers.add(44);
        numbers.add(9);
        numbers.add(4); */
        System.out.println(methods.numberOfItems(students));
        System.out.println(methods.greaterThan10(numbers));
        System.out.println(methods.lesserThan10(numbers2));
        //int[] setOne = {3,3};
      // int[] setTwo = {5,3};

        System.out.println(Arrays.toString(methods.toArray(21, 1,2)));

       // System.out.println(methods.toArray(22,33,22));
        methods.print(numbers3);
        System.out.println(Arrays.toString(methods.larger(numbers3, numbers)));

        //methods.larger(setOne,setTwo);


    }

    public boolean isOver30(int age) {
        boolean isOver30;

        if (age > 30) {
            isOver30 = true;
        } else {
            isOver30 = false;
        }
        return isOver30;
    }


    public int addTwoNumbers(int numberOne, int numberTwo) {
        int addTwoNumbers;

        return numberOne + numberTwo;
    }

    public int subtractTwoNumbers(int numberOne, int numberTwo) {
        int subtractTwoNumbers;
        return numberOne - numberTwo;
    }

    public void hello(String[] studentNames) {
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Hello " + studentNames[i]);
        }
    }

    public int sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];


        }
        System.out.println("The sum is " + sum);

      /*  for(int aNumber : numbers  ){
            sum = sum + aNumber;
        } */

        return sum;

    }

    public int absoluteDifference(int numberOne, int numberTwo) {
        int absoluteDifference;
        if (numberOne < numberTwo) {
            return (Math.abs(numberOne - numberTwo));
        } else {
            return numberOne - numberTwo;
        }

    }

    public String dayOfWeek(int number) {
        String dayOfWeek= " ";

           /* for (int i = 0; i < 7; i++) {


                System.out.println("Today is " + dayOfWeek[i]);

            }*/
        switch (number) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
        }

        return dayOfWeek;
    }
       /* if (number == 1) {
            dayOfWeek = "Sunday";
        } else if (number == 2) {
            dayOfWeek = "Monday";

        } else if (number == 3) {
            dayOfWeek = "Tuesday";

        } else if (number == 4) {
            dayOfWeek = "Wednesday";

        } else if (number == 5) {
            dayOfWeek = "Thursday";
        } else if (number == 6) {
            dayOfWeek = "Friday";
        } else if (number == 7) {
            dayOfWeek = "Saturday";
        }
        System.out.println("The day of the week is " + dayOfWeek);
        return dayOfWeek; */




    public ArrayList  oddNumbers(int upperLimit) {
        ArrayList odd = new ArrayList();

        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 != 0) {
                odd.add(i);


            }

        }
        return odd;
    }

    public ArrayList  evenNumbers(int upperLimit) {
        ArrayList even = new ArrayList();
        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 == 0) {
                even.add(i);
            }

        }
        return even;
    }


    public String upperCase(String text) {
        String upperCase = " ";
        System.out.println(text.toUpperCase());
        return upperCase;
    }

    public String lowerCase(String text) {
        String lowerCase = " ";
        System.out.println(text.toLowerCase());
        return lowerCase;
    }


    public int numberOfItems(String[] students) {
        int numberOfItems = 0;
        System.out.println(students.length);


        return students.length;
    }

    public int greaterThan10(int[] numbers) {
        int greaterThan = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                greaterThan = greaterThan + 1;

            }
        }
        System.out.println("The count of numbers greater than 10 is " + greaterThan);

        return greaterThan;
    }

    public int lesserThan10(int[] numbers) {
        int lessThan = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                lessThan = lessThan + 1;

            }
        }
        System.out.println("The count of numbers less than 10 is " + lessThan);

        return lessThan;
    }


    public int[] toArray(int numberOne, int numberTwo, int numberThree) {
        int[] threeNumbers = {numberOne, numberTwo, numberThree};
        return threeNumbers;

    }

    public void print(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

   public int[] larger(int[]  setOne, int[] setTwo) {
       int sum1 = 0;

       for (int i : setOne) {
           sum1 = sum1 + i;

       }
       int sum2 = 0;

       for (int i : setTwo) {
           sum2 = sum2 + i;
       }


       if (sum1 > sum2){
           return setOne;
       }

        else {
            return setTwo;
       }
   }


}













