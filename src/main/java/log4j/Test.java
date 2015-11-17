package log4j;

import org.apache.log4j.Logger;

public class Test {

	final static Logger logger = Logger.getLogger(Test.class);
	
	    public static void main(String[] args) {
	        logger.trace("trace");
	        logger.debug("debug");
	        logger.info("info");
	        logger.warn("warn");
	        logger.error("error");
	        logger.fatal("fatal");
	    }
}
