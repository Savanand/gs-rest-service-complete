/**
 * 
 */
package beans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class User implements Serializable {
	
	private String userName;
	
	private String password;
	
	private String firstName;
	
	private String lastName;

	private Boolean active = true;
	
	private String resetToken;
	
	private Date resetTokenCreatedAt ;

	private String zipCode;
	
	private String country;

	private String profileUrl;
	
	private Customer customer;
	
	private Roles roles;
	
	private Set<Watchlist> watchlists = new HashSet<Watchlist>();

	
	public Set<Watchlist> getWatchlists() {
		return watchlists;
	}

	public void setWatchlists(Set<Watchlist> watchlists) {
		this.watchlists = watchlists;
	}

	public User() {
		super();
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	/**
	 * 
	 * @return resetToken
	 */
	public String getResetToken() {
		return resetToken;
	}
	
	/**
	 * 
	 * @param resetToken
	 */
	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
	
	/**
	 * 
	 * @return resetTokenCreatedAt
	 */
	public Date getResetTokenCreatedAt() {
		return resetTokenCreatedAt;
	}
	
	/**
	 * 
	 * @param resetTokenCreatedAt
	 */
	public void setResetTokenCreatedAt(Date resetTokenCreatedAt) {
		this.resetTokenCreatedAt = resetTokenCreatedAt;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 * 
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the profileUrl
	 */
	public String getProfileUrl() {
		return profileUrl;
	}

	/**
	 * @param profileUrl the profileUrl to set
	 */
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}