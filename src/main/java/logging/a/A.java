/*
 * All Rights Reserved.
 */
package logging.a;


import org.apache.log4j.Logger;

/**
 * Class A for logging tests
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class A {

    private static Logger log = Logger.getLogger(A.class);

    public static void toDo() {
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
