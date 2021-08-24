package com.udomsin.review.exception;

// Business exception
public class InputFieldException extends Exception{
	private boolean isUsernameWrong;
	private boolean isPasswordWrong;
	private boolean isAgeWrong;
	private boolean isUserIdWrong;
	
	public InputFieldException(boolean isUsernameWrong, boolean isPasswordWrong, boolean isAgeWrong,
			boolean isUserIdWrong) {
		super();
		this.isUsernameWrong = isUsernameWrong;
		this.isPasswordWrong = isPasswordWrong;
		this.isAgeWrong = isAgeWrong;
		this.isUserIdWrong = isUserIdWrong;
	}
	public boolean isUsernameWrong() {
		return isUsernameWrong;
	}
	public void setUsernameWrong(boolean isUsernameWrong) {
		this.isUsernameWrong = isUsernameWrong;
	}
	public boolean isPasswordWrong() {
		return isPasswordWrong;
	}
	public void setPasswordWrong(boolean isPasswordWrong) {
		this.isPasswordWrong = isPasswordWrong;
	}
	public boolean isAgeWrong() {
		return isAgeWrong;
	}
	public void setAgeWrong(boolean isAgeWrong) {
		this.isAgeWrong = isAgeWrong;
	}
	public boolean isUserIdWrong() {
		return isUserIdWrong;
	}
	public void setUserIdWrong(boolean isUserIdWrong) {
		this.isUserIdWrong = isUserIdWrong;
	}
	
	

}
