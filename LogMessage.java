public class LogMessage {
private String machineID;
private String description;

public LogMessage(String message) {
	int colon = message.indexOf(":");
	machineID = message.substring(0, colon);
	description = message.substring(colon + 1);
}//end argument constructor

public boolean containsWord(String keyword) {
	if(description.equals(keyword)) {
		return true;
	}//end if
	if (description.indexOf(keyword + " ") == 0) {
		return true;
	}//end if
	if (description.indexOf("" + keyword + " ") != -1) {
		return true;
	}//end if 
	if (description.length() > keyword.length()) {
		if (description.substring(description.length() - 1).equals("" + keyword)) {
			return true;
		}//end if
	}//end if
	return false;
	}//end containsWord

public String getMachineId() {
	return machineID;
	}//end getter
public String getDescription() {
	return description;
	}//end getter

public String toString() {
	String output = "";
	output += machineID + ":" + description;
	return output;
}//end toString	
}//end class