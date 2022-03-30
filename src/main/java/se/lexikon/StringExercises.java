package se.lexikon;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise11();





    }


    public static void exercise1(){
        System.out.println("Ex1");
        // part 1
        String name = "Java";
        System.out.println(name);
        System.out.println(name.length());
        // part2
        String sentence = "Long example sentence";
        System.out.println(sentence.charAt(6));
    }


    public static void exercise2(){
        System.out.println("Ex2");

        String sentence = "Even longer example sentence";
        int index1 = sentence.indexOf("o");
        System.out.println(sentence.indexOf("o"));
    }

    public static void exercise3(){
        System.out.println("Ex3");
        String sentence = "Ok this is not as long!";
        System.out.println(sentence.substring(10, 22));
    }

    public static void exercise4(){
        System.out.println("Ex4");
        String scream = "CAPS EQUALS SCREAMING";
        System.out.println(scream.toLowerCase());
        System.out.println(scream.toUpperCase());
    }

    public static void exercise5(){
        System.out.println("Ex5");
        String text = "Java is the worst programming language!";
        System.out.println(text.replace("worst", "best"));
    }

    public static void exercise6(){
        System.out.println("Ex6");
        String str = "\tJ\ta\tv\ta\t ";
        System.out.println(str.trim());
    }

    public static void exercise7(){
        System.out.println("Ex7");
        int i = Integer.parseInt("20");
        System.out.println("20" + 20);
    }

    public static void exercise8(){
        String stringVariable = "Water and Oil";
        String[] array = stringVariable.split(" and ");
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1]);

    }

    public static void exercise9(){
        String str = "Carl, Susie, Fredrick, Bob, Erik";
        String[] strArray = str.split(",");
        System.out.println(Arrays.toString(strArray));
    }

    public static void exercise11(){
        char[] myString = new char[]{'J', 'a', 'v', 'a'};
        String output1 = new String(myString);
        System.out.println("output1 : " + output1);

    }

    public static void exercise10(){

    }






    }


