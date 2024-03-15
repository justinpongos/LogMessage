import java.util.ArrayList;
public class LogDriver {
public static void main (String [] args) {
	ArrayList<String> theLog = new ArrayList<String>();
	
	theLog.add("CLIENT3:security alert - repeat login failures");
	theLog.add("Websever:disk offline");
	theLog.add("SEVER1:not found");
	theLog.add("SEVER2:rerror on disk DSK1");
	theLog.add("SEVER1:write error on disk DSK2");
	theLog.add("Webserver:error on /dev/disk");

	SystemLog log1 = new SystemLog(theLog);
	log1.removeMessages("disk");
	System.out.print(log1);
}//end main
}//end class