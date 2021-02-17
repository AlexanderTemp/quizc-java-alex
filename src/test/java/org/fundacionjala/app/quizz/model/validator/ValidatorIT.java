package org.fundacionjala.app.quizz.model.validator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorIT {

    @Test
    public void testDateValidator() {
        List<String> errors = new ArrayList<>();
        Validator dateValidator = ValidatorType.DATE.getValidator();

        dateValidator.validate("24/12/2021", null, errors);

        Assert.assertEquals(DateValidator.class, dateValidator.getClass());
        Assert.assertTrue(errors.isEmpty());
    }
}
