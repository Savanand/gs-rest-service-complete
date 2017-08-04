
package beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ViewResponse implements Serializable {
	private static final long serialVersionUID = 7991572783960989149L;

	protected boolean isAuthenticated;

	protected boolean isSuccess = true;

	private String timeTaken;

	@Autowired
	private ResponseStatus responseStatus;

	public ViewResponse() {
		super();
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(final boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public void setSuccess(final boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(final ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(String timeTaken) {
		this.timeTaken = timeTaken;
	}
}