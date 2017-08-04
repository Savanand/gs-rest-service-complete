package beans;

public class AuthResponse extends ViewResponse {
	private static final long serialVersionUID = 1500824868051652460L;

	private final Object token;

	private final UserProfile userProfile;
	
	private final Roles role;
	
	public AuthResponse(Object token) {
		this(token, null, null);
	}

	public AuthResponse(Object token, UserProfile userProfile, Roles role) {
		this.token = token;
		this.userProfile = userProfile;
		this.role = role;
	}

	public Object getToken() {
		return token;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}
	
	public Roles getRole() {
		return role;
	}
}

