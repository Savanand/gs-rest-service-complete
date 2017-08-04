package hello;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import beans.AuthResponse;
import beans.Greeting;
import beans.ResponseStatus;
import beans.Roles;
import beans.User;
import beans.UserLogin;
import beans.UserLoginToken;
import beans.UserProfile;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    
    @RequestMapping("/api/register")
    public ResponseEntity<?> registerUser(final HttpServletResponse response,
			@RequestBody(required = true) final UserProfile userProfile) {
    	
    	// get 
		System.out.println("got UserProfile values in API "+ userProfile);

		ResponseStatus responseStatus = new ResponseStatus();
		Map<String, String> errorMap = new LinkedHashMap<>();

		boolean errors_flag=false;
		if(errors_flag){
			responseStatus.setCode(HttpStatus.BAD_REQUEST.toString());
			responseStatus.setMessage((String) errorMap.values().toArray()[0]);
			responseStatus.setErrors(errorMap);
			return ResponseEntity.badRequest().body(responseStatus);

		}
	
		// creating temporary user
		User newUser = new User();
		newUser.setFirstName(userProfile.getFirstName());
		newUser.setLastName(userProfile.getLastName());
		newUser.setPassword(userProfile.getPassword());
		newUser.setZipCode(userProfile.getZipCode());
		newUser.setUserName(userProfile.getEmail());
		newUser.setActive(true);
		
		if (newUser != null) {
			responseStatus.setCode(HttpStatus.CREATED.toString());
			responseStatus.setMessage("User created successfully.");
			responseStatus.setTokenId("bad18eba1ff45jk7858b8ae88a77fa30");
		} else {
			responseStatus.setCode(HttpStatus.BAD_REQUEST.toString());
			responseStatus.setMessage("Unable to create user.");
		}
		if (responseStatus.getCode().equalsIgnoreCase(HttpStatus.BAD_REQUEST.toString())) {
			System.out.println("debug: registerUser: Complete: Failure");
			return ResponseEntity.badRequest().body(responseStatus);
		} else {
			System.out.println("debug: registerUser: Complete: Success");
			return ResponseEntity.ok().body(responseStatus);
		}

    }
    
    @RequestMapping("/api/authenticate")
    public ResponseEntity<?> authenticate(final HttpServletResponse response,
			@RequestBody(required = true) final Map<String, String> credentialsMap) {
		
    	// get 
    	UserProfile userProfile = new UserProfile();
		UserLogin userLogin = new UserLogin();
		Map<String, String> errorMap = new LinkedHashMap<>();
		ResponseStatus responseStatus = new ResponseStatus();
		AuthResponse authResponse = null;

		String userName = credentialsMap.get("userName");
		String password = credentialsMap.get("password");
		String tokenId = credentialsMap.get("tokenId");
		
		System.out.println("Values got, username-"+userName+" and password-"+password + " and tokenId-"+ tokenId);
		
		
		//String secretKey = credentialsMap.get("secretKey");
		userProfile.setEmail(userName);
		userProfile.setPassword(password);
		
//		boolean errors_flag=false;
//		if(errors_flag){
//			authResponse = new AuthResponse(null);
//			authResponse.setAuthenticated(false);
//			authResponse.setSuccess(false);
//			responseStatus.setCode(HttpStatus.BAD_REQUEST.toString());
//			responseStatus.setMessage((String) errorMap.values().toArray()[0]);
//			responseStatus.setErrors(errorMap);
//			authResponse.setResponseStatus(responseStatus);
//			return ResponseEntity.badRequest().body(authResponse);
//
//		}
//	
		// creating temporary user
		User newUser = new User();
		newUser.setPassword("aniket.sjsu@gmail.com");
		newUser.setUserName("secret123");
		
		
		try {
			//System.out.println(userName + "aniket.sjsu@gmail.com");
			System.out.println("aniket.sjsu@gmail.com".equals(userName));
			//System.out.println("aniket.sjsu@gmail.com".equalsIgnoreCase(userName));
			System.out.println("secret123".equals(password));
			System.out.println("bad18eba1ff45jk7858b8ae88a77fa30".equals(tokenId));
			
			if("aniket.sjsu@gmail.com".equals(userName) && "secret123".equals(password) && "bad18eba1ff45jk7858b8ae88a77fa30".equals(tokenId)){
				
				
				System.out.println("user authenticated");
			//			UserLoginToken token = authenticationService.authenticate(userName, password, secretKey);//authenticate and create token
//			userProfile = userService.toUserProfile(token.getUser()); // get user profile
//			userService.createSessionDetails(userName, token.getId()); // set session details with username, id			
//			Roles role = userService.getUserByUserName(userName).getRoles();		//get roles	 
//			authResponse = new AuthResponse(token.getId(), userProfile, role); // set auth response with id, userprofile and role
			authResponse = new AuthResponse(null);
			authResponse.setAuthenticated(true);
			authResponse.setSuccess(true);
			responseStatus.setCode(HttpStatus.OK.toString());
			responseStatus.setTokenId(tokenId);
			authResponse.setResponseStatus(responseStatus);
			System.out.println("authenticate: Complete: Success");
			return ResponseEntity.ok(authResponse);
			}
			else{
				
				System.out.println("in else user -not authenticated");
				
				authResponse = new AuthResponse(null);
				authResponse.setAuthenticated(false);
				authResponse.setSuccess(false);
				responseStatus.setCode(HttpStatus.BAD_REQUEST.toString());
				responseStatus.setMessage((String) errorMap.values().toArray()[0]);
				responseStatus.setErrors(errorMap);
				authResponse.setResponseStatus(responseStatus);
				return ResponseEntity.badRequest().body(authResponse);
			
			}

		} catch (Exception e) {
			System.out.println("in exception");
			
			authResponse = new AuthResponse(null);
			authResponse.setAuthenticated(false);
			authResponse.setSuccess(false);
			responseStatus.setCode(HttpStatus.BAD_REQUEST.toString());
			responseStatus.setMessage(e.getMessage());
			authResponse.setResponseStatus(responseStatus);
			System.out.println("authenticate: Complete: Failed");
			return ResponseEntity.badRequest().body(authResponse);
		}

    }
}
