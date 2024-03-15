import java.util.ArrayList;

public class SystemLog {

private ArrayList<LogMessage> messageList;
private ArrayList<LogMessage> messagesWithKey;

	public SystemLog(ArrayList<String> messageStrings) {
		messageList = new ArrayList <LogMessage> ();
		
		for (int i = 0; i< messageStrings.size(); i++) {
			messageList.add(new LogMessage(messageStrings.get(i)));
		}//end messageKey list with LogMessages
		
		messagesWithKey = new ArrayList <LogMessage>();
	}//end 1 arg constructor
	
	public ArrayList<LogMessage> removeMessages(String key){
		for (int i = 0; i <messageList.size(); i++) {
			if (messageList.get(i).containsWord(key) == true) {
				messagesWithKey.add(messageList.get(i));
				messageList.remove(i);
				i--;
			}//end if 
		}//end for
		
		return messagesWithKey;
	}//end removeMessages
	
	public String toString() {
		String output = "";
		output += "The messages with the keyword are: \n \n";
		for (int i = 0; i < messagesWithKey.size(); i++) {
			output += messagesWithKey.get(i) + "\n";
		}//end for
		output+= "\nThe other messages are:\n \n";
		for (int i = 0; i < messageList.size(); i++) {
			output+= messageList.get(i) + "\n";
		}//end others
		return output;
	}//end toString
}//end class