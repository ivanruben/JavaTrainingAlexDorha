package zPractice;

import java.util.Locale;

public class Main {
    static String makeEvenWordsUppercase(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                builder.append(array[i].toUpperCase()).append(" ");
            } else {
                builder.append(array[i]).append(" ");
            }
        }
        return builder.toString();
    }

    // do not change code from below
    public static void main(String[] args) {
        String sentence = "Green hot-dog with cucumber and mustard";
        String result = makeEvenWordsUppercase(sentence);
        System.out.println(result);
    }
    // do not change the code above
}

/*ublic class Main {
    public static void main(String[] args) {
        String string = "Acesta este un mode de a splitui stringurile";
        String [] array = string.split("");
        printeaza(array);
    }
    public static void printeaza(String[] array){
        for(String element :array){
            System.out.println(element);
        }
    }
}*/

 /*   static int[] sortIntArrayOnlyEvenNumbers(int[] input) {
        int size = 0;
        for (int element : input) {
            if (element % 2 == 0) {
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int element : input) {
            if (element % 2 == 0) {
                result[index] = element;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] firstArray = {2, 0, 7, 4, 5, 13, 6, 8, 10, 49, 28, -4, 5, 3};
        int[] secondArray = {0, 1, 4, 5, 1, 6, 2, 7, 81, 20, 10, 44, 11, 7};
        printArray(sortIntArrayOnlyEvenNumbers(firstArray));
        printArray(sortIntArrayOnlyEvenNumbers(secondArray));
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    // do not change code from below
}
*/

// do not change the code above

    /*static String[] sortNamesStartWithLetterB(String[] names) {
        int size = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B') {
                size++;
            }
        }
        String[] result = new String[size];
        int index = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B' ) {
                result[index] = name;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // do not change code from below
        *//*String[] names = {"Ben", "Bob", "Alice", "Mikel", "Brian", "Brandon", "Nick", "Ryan"};
        String[] namesStartsLetterB = sortNamesStartWithLetterB(names);
        for (String name : namesStartsLetterB) {
                    System.out.print(name + ", ");
        }*//*
    }
    // do not change the code above*/
