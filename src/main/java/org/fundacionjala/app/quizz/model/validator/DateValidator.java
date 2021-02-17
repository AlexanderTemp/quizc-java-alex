package org.fundacionjala.app.quizz.model.validator;

import java.text.ParseException;
import java.util.List;

import org.fundacionjala.app.quizz.model.configuration.DateConfiguration;

public class DateValidator implements Validator {

    private static final String ERROR_MESSAGE = "The date format is invalid, it should have the format dd/MM/yyyy";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        try {
            DateConfiguration.FORMATTER.parse(value);
        } catch (ParseException exception) {
            errors.add(ERROR_MESSAGE);
        }
    }
}
