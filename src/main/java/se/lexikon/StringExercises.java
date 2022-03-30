package se.lexikon;

public class StringExercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();









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

    }






    }


