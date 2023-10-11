package zPractice;

public class Substrings {

        static String makeSubstringFromToSymbol(String string, String symbols) {
            int firstIndex = string.indexOf(symbols);
            int lastIndex = string.lastIndexOf(symbols);
            String result = string.substring(firstIndex,lastIndex);
            return result;
        }

        static void findAndPrintFirstAndLastCharacters(String string) {
            char firstChar = string.charAt(0);
            char lastChar = string.charAt(string.length()-1);
            System.out.println("First character = " + firstChar
                    + " . Last character = " + lastChar);
        }

        // do not change code from below
        public static void main(String[] args) {
            String string = "This message need to be refactored within two methods!";
            String symbol = "e";
            findAndPrintFirstAndLastCharacters(makeSubstringFromToSymbol(string, symbol));
        }
        // do not change the code above
    }