/*
 * $HeadURL$
 * $Date$
 * $Revision$
 *
 * Copyright (c) 2012 Cleverlance Enterprise Solutions a.s.
 * http://www.cleverlance.com
 * All Rights Reserved.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for BitOperations. Contains tests of bit .. operations :)
 *
 * @author <a href="mailto:petr.ujezdsky@cleverlance.com">Petr Újezdský</a>
 * @version $Id$
 */
public class BitOperationsTest {

    private static final long STATE_ALL = 2;
    private static final long STATE_CUSTOM = STATE_ALL << 1;
    private static final long STATE_BOTH = STATE_ALL | STATE_CUSTOM;

    private BitOperations bitOperations;

    @Before
    public void setUp() throws Exception {
//        System.out.println("settingUp");
        bitOperations = new BitOperations();
    }

    @After
    public void tearDown() throws Exception {
//        System.out.println("tearingDown");
        bitOperations = null;
    }

    @Test
    public void testBITAND_FcustXScust() throws Exception {
        assertMatch(STATE_CUSTOM, STATE_CUSTOM);
    }

    @Test
    public void testBITAND_FcustXSall() throws Exception {
        assertMatch(STATE_CUSTOM, STATE_ALL);
    }

    @Test
    public void testBITAND_FallxScust() throws Exception {
        assertMatch(STATE_ALL, STATE_BOTH);
    }

    @Test
    public void testBITAND_FallxSall() throws Exception {
        assertMatch(STATE_ALL, STATE_ALL);
    }




    private void assertMatch(long aDB, long bF) {
        long transformed = transform(bF);
        Assert.assertEquals(bitOperations.BITAND(aDB, transformed), transformed);
    }

    private long transform(long a) {
        return a;
    }
}
