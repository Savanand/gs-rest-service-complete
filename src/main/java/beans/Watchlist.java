package beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



import com.fasterxml.jackson.annotation.JsonIgnore;

public class Watchlist implements Serializable{
		
	private Long id;
	
	private String name;
	
	private User user;
	
	private Set<WatchlistDetail> watchlistDetails = new HashSet<WatchlistDetail>();

	public Set<WatchlistDetail> getWatchlistDetails() {
		return watchlistDetails;
	}

	public void setWatchlistDetails(Set<WatchlistDetail> watchlistDetails) {
		this.watchlistDetails = watchlistDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	

}
