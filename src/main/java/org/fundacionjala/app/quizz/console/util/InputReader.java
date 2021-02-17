package org.fundacionjala.app.quizz.console.util;

import java.util.Scanner;

public final class InputReader {
    private static final String INPUT_CURSOR = "> ";
    private static  final Scanner scanner = new Scanner(System.in);

    private InputReader() {}

    public static String readLine() {
        System.out.print(INPUT_CURSOR);
        return scanner.nextLine();
    }

    public static char readOption() {
        return readLine().trim().charAt(0);
    }
}
