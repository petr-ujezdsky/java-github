/*
 * All Rights Reserved.
 */

import java.io.IOException;

import org.apache.log4j.Logger;

import logging.a.A;
import logging.b.B;

/**
 * Description
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class Application {
    private static Logger log = Logger.getLogger(Application.class);

    public static void toDo() {
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }

    public static void main(String[] args) throws IOException {

        log.info("Welcome to testing project");
        log.info("");

        A.toDo();
        B.toDo();
        Application.toDo();
    }
}
