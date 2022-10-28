package org.example.homework12_12;

import java.io.*;
import java.util.*;

/**
 * @author Yehh
 */
public class Format {
    static String lineSeparator = System.lineSeparator();

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("format program require 2 arguments");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("source file does not exists");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("target file does not exists");
            System.exit(3);
        }
        try (Scanner input = new Scanner(sourceFile);
             PrintWriter output = new PrintWriter(targetFile);) {

        }
    }

    void format(Scanner scanner, PrintWriter printWriter) {
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            if (scanner.hasNext()) {
                String s2 = scanner.nextLine();
                if ("}".equals(s1)) {
                    return;
                }
                if ("{".equals(s2)) {
                    printWriter.println(s1.substring(0, s1.length() - Format.lineSeparator.length()) + " {");
                    format(scanner, printWriter);
                }
            }
        }
        return;
    }
}
