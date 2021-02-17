package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public interface Validator {
    void validate(String value, String conditionValue, List<String> errors);
}
