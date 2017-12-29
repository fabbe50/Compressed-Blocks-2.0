package com.fabbe50.compressedblocks.core.utils.helper;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * Created by fabbe on 03/12/2017 - 3:03 AM.
 */
public class LogHelper {
    /*	Made for easy logging by Pahimar!
	 * 	Information/code obtained, modified and printed in class by fabbe50/Teemo
	 *
	 * 	Usage: LogHelper.<level>(messageToPrint);
	 * 	@func all   - All events should be logged.
	 * 	@func debug - A general debugging event.
	 * 	@func error - An error in the application, possibly recoverable.
	 * 	@func fatal - A severe error that will prevent the application from continuing.
	 * 	@func info  - An event for informational purposes.
	 * 	@func finfo - An event for informational purposes, that overrides the mods config-option.
	 * 	@func off   - No events will be logged.
	 * 	@func trace - A fine-grained debug message, typically capturing the flow through the application.
	 * 	@func warn  - An event that might possible lead to an error.
	 */

    private static void log(Level level, Object object) {
        getLogger().log(level, object);
    }

    private static Logger logger;
    private static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        LogHelper.logger = logger;
    }

    public static void all(Object object) {log(Level.ALL, object);}
    public static void debug(Object object) {log(Level.DEBUG, object);}
    public static void error(Object object) {log(Level.ERROR, object);}
    public static void fatal(Object object) {log(Level.FATAL, object);}
    public static void info(Object object) {{log(Level.INFO, object);}}
    public static void off(Object object) {log(Level.OFF, object);}
    public static void trace(Object object) {log(Level.TRACE, object);}
    public static void warn(Object object) {log(Level.WARN, object);}
}
