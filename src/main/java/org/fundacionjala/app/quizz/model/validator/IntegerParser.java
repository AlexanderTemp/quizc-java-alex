package org.fundacionjala.app.quizz.model.validator;

public final class IntegerParser {

    public static final String ERROR_MESSAGE_INVALID_NUMBER = "The value must be an integer";

    private IntegerParser() {}

    public static int parse(String value) throws NumberFormatException {
        return Integer.parseInt(value);
    }
}
