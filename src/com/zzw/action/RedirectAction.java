package com.zzw.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class RedirectAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		ActionContext.getContext().getActionInvocation().
		addPreResultListener(new PreResultListener() {
			@Override
			public void beforeResult(ActionInvocation arg0, String arg1) {
				HttpServletRequest request=ServletActionContext.getRequest();
				String msg=request.getParameter("massage");
				if(msg==null)
					msg=getText("newMessage");
				request.setAttribute("message", msg);
			}
		});
		return SUCCESS;
	}
}
