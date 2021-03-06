/*
 * All Rights Reserved.
 */
package logging.b;

import org.apache.log4j.Logger;

/**
 * Class B for logging tests
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class B {
    private static Logger log = Logger.getLogger(B.class);

    public static void toDo() {
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
