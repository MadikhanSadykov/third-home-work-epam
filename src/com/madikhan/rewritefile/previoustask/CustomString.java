package com.madikhan.rewritefile.previoustask;

import java.util.*;

public class CustomString {


    public static List<String> splitOddAndEvenChars(String string) {

        List<String> twoSplitStrings = new ArrayList<>();
        StringBuilder oddChars = new StringBuilder();
        StringBuilder evenChars = new StringBuilder();

        for (int indexOfChar = 1; indexOfChar <= string.length(); indexOfChar++) {
            if (indexOfChar % 2 == 0) {
                evenChars.append(string.charAt(indexOfChar - 1));
            } else {
                oddChars.append(string.charAt(indexOfChar - 1));
            }
        }

        twoSplitStrings.add(oddChars.toString());
        twoSplitStrings.add(evenChars.toString());

        return twoSplitStrings;

    }


    public static int getAmountOfDigits(String string) {

        int count = 0;
        char[] arrayOfCharacters = string.toCharArray();

        for ( char character : arrayOfCharacters ) {
            if ( character >= '0' && character <= '9' ) {
                count++;
            }
        }
        return count;
    }


    public static String separateDigits(String string) {

        StringBuilder stringOfDigits = new StringBuilder();

        for ( char character : string.toCharArray() ) {
            if ( character > '0' && character < '9') {
                stringOfDigits.append(character);
            }
        }
        return stringOfDigits.toString();
    }


    public static String removeDuplicates(String string) {

        Set<Character> setOfCharacters = new HashSet<>();
        StringBuilder withoutDuplicates = new StringBuilder();


        for ( char character : string.toCharArray() ) {
            if ( setOfCharacters.contains(character) ) {
                continue;
            }
            setOfCharacters.add(character);
            withoutDuplicates.append(character);
        }
        return withoutDuplicates.toString();
    }


    public static int getFrequencyOfCharacter(String string, char desiredCharacter) {

        int frequencyCounter = 0;

        for (char character : string.toCharArray()) {
            if (character == desiredCharacter) {
                frequencyCounter++;
            }
        }
        return frequencyCounter;
    }


    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }


    public static int getAmountOfSubstrings(String string, String substring) {

        int substringCounter = 0;
        int searchingFromIndex = 0;

        while ( (searchingFromIndex = string.indexOf(substring, searchingFromIndex)) != -1 ) {
            substringCounter++;
            searchingFromIndex += substring.length() - 1;
        }
        return substringCounter;
    }


    public static String reverseWords(String string) {

        String reversedWords = "";
        List<String> wordsInString = Arrays.asList(string.split(" "));
        Collections.reverse(wordsInString);
        for (String word : wordsInString){
            reversedWords = reversedWords.concat(word + " ");
        }

        return reversedWords;
    }


    public static String sortArrayOfStrings(String string) {
        String[] arrayOfStrings = string.split(" ");
        Arrays.sort(arrayOfStrings);
        return String.join(" ", arrayOfStrings);
    }


    public static int getLengthOfShortestWord(String string) {


        String[] wordsInString = string.split(" ");
        String shortestWord = wordsInString[0];

        for (int index = 0; index < wordsInString.length; index++) {
            if (wordsInString[index].length() < shortestWord.length()){
                shortestWord = wordsInString[index];
            }
        }

        return shortestWord.length();
    }


    public static int getAmountOfWords(String string) {
        return string.split(" ").length;
    }

    public static String insertSpace(String string, int offset){
        return new StringBuilder(string).insert(offset, " ").toString();
    }


    public static boolean isPalindrome(String string) {

        int left = 0;
        int right = string.length() - 1;

        String caseIndependentString = string.toLowerCase();

        while (right > left) {
            if (caseIndependentString.charAt(left) != caseIndependentString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static String replaceSubstring(String string, String oldString, String newString) {
        return string.replace(oldString, newString);
    }


    public static int getDistanceBetweenStrings(String string, String firstSubstring, String secondSubstring) {
        return string.indexOf(secondSubstring) - string.indexOf(firstSubstring) - firstSubstring.length();
    }

}
