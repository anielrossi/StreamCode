package com;

import java.util.ArrayList;

public class User implements Observer {

	private int userId;
	private String username;
	private ArrayList<Project> userProjects;
	private ArrayList<Activity> userActivities;
	private ArrayList<User> userFriend;
	

	public User(int id, String username){
		this.userId = id;
		this.username = username;
		userProjects = new ArrayList<Project>();
		userActivities = new ArrayList<Activity>();
		userFriend = new ArrayList<User>();
	}
	
	//chain of responsability

	public void next() {
		//chain of responsability
	}

	@Override
	//observer
	public void update() {
		// TODO Auto-generated method s
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Project> getUserProjects() {
		return userProjects;
	}

	public ArrayList<Activity> getUserActivities() {
		return userActivities;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserProjects(ArrayList<Project> userProjects) {
		this.userProjects = userProjects;
	}

	public void setUserActivities(ArrayList<Activity> userActivities) {
		this.userActivities = userActivities;
	}
	
	

}
