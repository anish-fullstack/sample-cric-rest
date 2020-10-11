package com.sample.rest;

import java.io.Serializable;

public class DTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String profile;

	private String imageURL;

	private String battingStyle;

	private String bowlingStyle;

	private String majorTeams;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getMajorTeams() {
		return majorTeams;
	}

	public void setMajorTeams(String majorTeams) {
		this.majorTeams = majorTeams;
	}

}
