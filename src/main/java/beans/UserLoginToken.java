/**
 * 
 */
package beans;

import java.io.Serializable;
import java.util.Date;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author balaji
 *
 */

public class UserLoginToken implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private Date createdTime;

	private User user;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the createdTime
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}