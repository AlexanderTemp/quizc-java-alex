package org.fundacionjala.app.quizz.model.validator;

import java.util.List;


public class UpperCaseValidator implements Validator{
	 private static final String ERROR_MESSAGE = "The text format is invalid, it should only contain capital letters ";

	    @Override
	    public void validate(String value, String conditionValue, List<String> errors) {
	        try {
	            for (char i: value.toCharArray()) {
	            	if(i>96&&i<123) {
	            		errors.add(ERROR_MESSAGE);	
	            		break;
	            	}
	            }
	        } catch (NullPointerException exception) {
	            exception.printStackTrace();
	        }
	    }
}
