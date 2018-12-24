package com.apex.validations;

public class UserValidation {
	
	private boolean isFieldEmpty(String fieldVal){
		return ((fieldVal==null)||(fieldVal.trim().length()==0));
	}

}
