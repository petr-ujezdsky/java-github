/*
 * All Rights Reserved.
 */

import java.io.IOException;

import org.apache.log4j.Logger;

import logging.a.A;
import logging.b.B;

/**
 * Main class.
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class Application {
    private static Logger log = Logger.getLogger(Application.class);

    public static void toDo() {
        log.fatal("Fatal Message!");
        log.error("Error Message!");
        log.warn("Warn Message!");
        log.info("Info Message!");
        log.debug("Debug Message!");
        log.trace("Trace Message!");
    }

    public static void main(String[] args) throws IOException {
        log.info("Welcome to testing project");
        log.info("");

        A.toDo();
        B.toDo();
        Application.toDo();
    }
}
