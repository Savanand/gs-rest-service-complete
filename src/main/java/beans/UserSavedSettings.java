/**
 * 
 */
package beans;

import java.io.Serializable;

public class UserSavedSettings implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userName;

	private String savedSettings;

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
	 * @return the savedSettings
	 */
	public String getSavedSettings() {
		return savedSettings;
	}

	/**
	 * @param savedSettings the savedSettings to set
	 */
	public void setSavedSettings(String savedSettings) {
		this.savedSettings = savedSettings;
	}
}
