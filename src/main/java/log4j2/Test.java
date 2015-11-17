package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	final static Logger logger = LogManager.getLogger(Test.class);
	
	    public static void main(String[] args) {
	        logger.trace("trace");
	        logger.debug("debug");
	        logger.info("info");
	        logger.warn("warn");
	        logger.error("error");
	        logger.fatal("fatal");
	    }
}
