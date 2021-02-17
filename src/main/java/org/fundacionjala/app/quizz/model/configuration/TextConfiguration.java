package org.fundacionjala.app.quizz.model.configuration;

import org.fundacionjala.app.quizz.model.validator.ValidatorType;

public class TextConfiguration extends QuestionConfiguration {
    public TextConfiguration() {
        super(false, ValidatorType.REQUIRED, ValidatorType.MIN_LENGTH, ValidatorType.MAX_LENGTH, ValidatorType.ONLY_UPPERCASE);
    }
}
