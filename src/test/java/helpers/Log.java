package helpers;
import org.apache.log4j.Logger;

/**
 * Created by July on 7/7/17.
 */
public class Log {

	public static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
		Log.info(message);
	}

}