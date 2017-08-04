/**
 * 
 */
package beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class ResponseStatus implements Serializable {
	private String code;
	private String message;
	private String type;
	private String tokenId;
	private Map<String, String> errors = new HashMap<>();
	
	public ResponseStatus() {
		super();
	}

	public ResponseStatus(String code, String message, String tokenId) {
		super();
		this.code = code;
		this.message = message;
		this.tokenId = tokenId;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @return errors
	 */
	public Map<String, String> getErrors() {
		return errors;
	}
	
	/**
	 * 
	 * @param set the errors
	 */
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	
	
}