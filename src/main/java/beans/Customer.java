package beans;


public class Customer {
	
	private String secretKey;
	
	private String companyName;
	
	public Customer() {
		super();
	}
	
	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}
	
	/**
	 * @param secretKey the secretKey to set
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

}
