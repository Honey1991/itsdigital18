package main.java.finedine.cache.com;

import java.util.HashMap;
import java.util.Map;

public class MostRecentlyLoggedInUsers {
	private static Map<String, String> loggedInUsers = null;
	private static MostRecentlyLoggedInUsers mostRecentlyLoggedInUsers = null;
	private MostRecentlyLoggedInUsers(){
		
	}
	public static MostRecentlyLoggedInUsers getInstance() {
		if (null == mostRecentlyLoggedInUsers) {
			mostRecentlyLoggedInUsers = new MostRecentlyLoggedInUsers();
			loggedInUsers = new HashMap<String, String>();
		}
		return mostRecentlyLoggedInUsers;
	}

	public static Map<String, String> getLoggedInUsers() {
		return loggedInUsers;
	}

	public static void setLoggedInUsers(Map<String, String> loggedInUsers) {
		MostRecentlyLoggedInUsers.loggedInUsers = loggedInUsers;
	}

}