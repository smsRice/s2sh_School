package com.School.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.imageio.spi.ServiceRegistry;

/**
 * Created by s on 2016/12/22.
 */
public class ErrorAction extends ActionSupport {
    private Exception exception;

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String execute() throws Exception {
        ActionContext.getContext().getValueStack().push(exception.getMessage());
        return ERROR;
    }
}
