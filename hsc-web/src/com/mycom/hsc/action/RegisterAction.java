package com.mycom.hsc.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String firstName;
	private String lastName;
	private String email;
	private String reEmail;
	private String password;
	private String error;

	public String execute() {
		if (valid()) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}


	private boolean valid() {
		if ( (getFirstName().length() == 0) ||
				(getLastName().length() == 0)){	
			setError("You must fill in all of the fields.");
			return false;
			
		}
				
		if ( this.getEmail().length() == 0 ){	

			setError("Please enter a valid email address." );
			return false;
			
		}
		if ( !this.getEmail().equals(this.getReEmail()) ){	

		 	setError("Your emails do not match. Please try again." );
		 	return false;
			
		}
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReEmail() {
		return reEmail;
	}

	public void setReEmail(String reEmail) {
		this.reEmail = reEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

}
