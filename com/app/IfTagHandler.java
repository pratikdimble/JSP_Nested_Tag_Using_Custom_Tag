package com.app;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class IfTagHandler extends TagSupport {
	
	private boolean condition;
	
	
	public boolean getCondition() {
		return condition;
	}


	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	

	@Override
	public int doStartTag() throws JspException {
		
			return EVAL_BODY_INCLUDE;
	}//doStartTag()
	
	

}//class
