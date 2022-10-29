package org.example.homework12_12;

import java.io.*;
import java.util.*;

/**
 * @author Yehh
 */
public class Format {

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
             PrintWriter output = new PrintWriter(targetFile)) {
            format(input, output);
        }
    }

    static void format(Scanner scanner, PrintWriter printWriter) {
        String s1 = scanner.nextLine();
        if (s1.matches(" *}")) {
            return;
        }
        while (scanner.hasNext()) {
            String s2 = scanner.nextLine();
            if (s2.matches(" *\\{")) {
                printWriter.println(s1 + " {");
                format(scanner, printWriter);
                printWriter.println(s2.substring(0, s2.length() - 1) + "}");
            } else {
                printWriter.println(s1);
                s1 = s2;
            }
        }
    }
}
