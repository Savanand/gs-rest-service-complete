package beans;

import java.io.Serializable;



public class WatchlistDetail implements Serializable{

	private Long id;

	private String shareClassId;

	private int priority;


	private Watchlist watchlist;

	public String getShareClassId() {
		return shareClassId;
	}

	public void setShareClassId(String shareClassId) {
		this.shareClassId = shareClassId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}


	public Watchlist getWatchlist() {
		return watchlist;
	}

	public void setWatchlist(Watchlist watchlist) {
		this.watchlist = watchlist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
