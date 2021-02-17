package org.fundacionjala.app.quizz.model.configuration;

import org.fundacionjala.app.quizz.model.validator.ValidatorType;

public class PickOneConfiguration extends QuestionConfiguration {

    public PickOneConfiguration() {
        super(true, ValidatorType.REQUIRED);
    }

}
