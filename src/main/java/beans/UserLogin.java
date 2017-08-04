package beans;

import java.io.Serializable;
import java.util.Date;

public class UserLogin implements Serializable{
	
	private String loginToken;
	
	private String userName;
	
	private Customer customer;
	
	private Date sessionStartTime;
	
	private Date sessionEndTime;
	
	private int status;
	
	public UserLogin() {
		super();
	}
	
	/**
	 * @return the loginToken
	 */
	public String getLoginToken() {
		return loginToken;
	}
	
	/**
	 * @param loginToken the loginToken to set
	 */
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * @param customer the customer to set
	 */	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * @return the sessionStartTime
	 */
	public Date getSessionStartTime() {
		return sessionStartTime;
	}
	
	/**
	 * @param sessionStartTime the sessionStartTime to set
	 */	
	public void setSessionStartTime(Date sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}
	
	/**
	 * @return the sessionEndTime
	 */
	public Date getSessionEndTime() {
		return sessionEndTime;
	}
	
	/**
	 * @param sessionEndTime the sessionEndTime to set
	 */	
	public void setSessionEndTime(Date sessionEndTime) {
		this.sessionEndTime = sessionEndTime;
	}
	
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */	
	public void setStatus(int status) {
		this.status = status;
	}
	
}

