package com.zzw.action;

import com.opensymphony.xwork2.ActionSupport;

public class ResultAction extends ActionSupport {
	private String message;
	private static final long serialVersionUID = 1L;

	public String getMessage() { return message; }
	public void setMessage(String m) { message=m; }
	
	public String dispatcher() throws Exception {
		return "dispatcher";
	}
	
	public String plainText() throws Exception {
		return "plainText";
	}
	
	public String redirect() throws Exception {
		return "redirect";
	}
	
	public String redirectAction() throws Exception {
		return "redirectAction";
	}
}
