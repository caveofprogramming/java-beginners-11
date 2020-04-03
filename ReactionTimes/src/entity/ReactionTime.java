package entity;

import java.util.Date;

/*
 * 
 * Represents a reaction time test.
 *
 */

public class ReactionTime {
	private Date date;
	private long reactionTime;

	public ReactionTime(Date date, long reactionTime) {
		this.date = date;
		this.reactionTime = reactionTime;
	}

	public Date getDate() {
		return date;
	}

	public long getReactionTime() {
		return reactionTime;
	}

}
