package com.app;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class FalseHandler extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		
		IfTagHandler i=(IfTagHandler)getParent();
		
		boolean condition=i.getCondition();
			if(condition==false)
				return SKIP_BODY;
			else
				return EVAL_BODY_INCLUDE;
				
	}//doStartTag()
	
	

}//class
