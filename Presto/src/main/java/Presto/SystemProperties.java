package Presto;

import java.io.InputStream;
import java.util.Properties;

import com.google.common.io.Resources;

public class SystemProperties {
	   private static Properties prop;
	    private static Properties getProp() {
	        if (prop == null) {
	            prop = new Properties();
	            InputStream input = null;
	            try {
	                input = Resources.getResource("system.properties").openStream();
	                prop.load(input);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	            return prop;
	    }
	    public static String getSingleProp(String key) {
	        return getProp().getProperty(key);
	    }
	    /**
	     * OBJECTIVE: Get the system.properties file location.
	     */
	    public static final String dataFilePath = getProp().getProperty("dataFilePath");
	    public static final String jiraType = getProp().getProperty("jiraType");
	    public static final String baseLinePath = getProp().getProperty("baseLinePath");
	    public static final String actualPath = getProp().getProperty("actualPath");
	    public static final String outputScreenshotPath = getProp().getProperty("outputScreenshotPath");
	    public static final String testType = getProp().getProperty("testType");
	    public static final String passwordJSON = getProp().getProperty("encryptedJSON");
	    public static final String EDGE_WEBDRIVER = getProp().getProperty("webdriver.edge.driver");
	    public static final String CHROME_WEBDRIVER = getProp().getProperty("webdriver.chrome.driver");
	    public static final String IE_WEBDRIVER = getProp().getProperty("webdriver.ie.driver");
}
