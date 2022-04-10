package com.madikhan.rewritefile;

import com.madikhan.rewritefile.previoustask.CustomString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputPath = "resources/input.txt";
        String outputPath = "resources/output.txt";
        List<String> inputContent = readFile(inputPath);

        handleInputContent(inputContent);

        writeFile(outputPath, inputContent);


    }

    public static List<String> readFile(String path) throws IOException {

        List<String> content = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            content.add(scanner.nextLine());
        }

        inputStream.close();
        scanner.close();

        return content;
    }


    public static List<String> handleInputContent(List<String> inputContent) {

        String line = inputContent.get(0);
        inputContent.remove(0);
        inputContent.add(0, CustomString.reverseString(line));

        line = inputContent.get(1);
        inputContent.remove(1);
        inputContent.add(1, CustomString.reverseString(CustomString.reverseWords(line)) );

        line = inputContent.get(2);
        inputContent.remove(2);
        inputContent.add(2, CustomString.separateDigits(line));

        line = inputContent.get(3);
        inputContent.remove(3);
        inputContent.add(3, CustomString.sortArrayOfStrings(line));

        return inputContent;
    }


    public static void writeFile(String path, List<String> outputContent) throws IOException {

        FileOutputStream outputStream = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(outputStream);


        for (String line : outputContent) {
            printStream.println(line);
        }


        printStream.close();
        outputStream.close();

    }
}
