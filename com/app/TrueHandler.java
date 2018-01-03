package com.app;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TrueHandler extends TagSupport {


	@Override
	public int doStartTag() throws JspException {
		
		IfTagHandler i=(IfTagHandler)getParent();
		
		boolean condition=i.getCondition();
			if(condition==true)
				return EVAL_BODY_INCLUDE;
			else
				return SKIP_BODY;
				
	}//doStartTag()
	
	

}//class
