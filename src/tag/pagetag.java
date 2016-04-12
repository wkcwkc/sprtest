package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class pagetag extends TagSupport{
	private static final long serialVersionUID = -3913342289546737501L;
	
	private String text;//text is the properties
	
	public int doStartTag() throws JspException {
		
		if(text!=null)
		{
		StringBuffer pagerHtml = new StringBuffer();
		
		pagerHtml.append("<h1>"+text+"</h1>");
		
		try {
			pageContext.getOut().write(pagerHtml.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		return super.doStartTag();
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
