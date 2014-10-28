/*
 * $HeadURL$
 * $Date$
 * $Revision$
 *
 * Copyright (c) 2012 Cleverlance Enterprise Solutions a.s.
 * http://www.cleverlance.com
 * All Rights Reserved.
 */

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Description
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class Log4jTest {

    private static Logger log = Logger.getLogger(Application.class);

    @Test
    public void testLog() throws Exception {
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
