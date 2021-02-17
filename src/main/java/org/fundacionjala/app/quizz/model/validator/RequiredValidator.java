package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class RequiredValidator implements Validator {

    private static final String ERROR_MESSAGE = "This question is required";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        if (value == null || value.equals("")) {
            errors.add(ERROR_MESSAGE);
        }
    }
}
