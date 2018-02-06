package com.aym.exception;

public enum ControllerError {
	SYSTEM_AUTH_MAINTAIN("系统正在维护", 10000003),
    UPDATE_PASSWORD_ERROR("修改密码失败", 10000004),
	CURD_FAILD("数据操作失败",00001),
	LOGIN_FAILD("登陆失败",000002);
	private String errorMessage;
    private Integer errorCode;

    ControllerError(String errorMessage, Integer errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
