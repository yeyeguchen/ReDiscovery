/*
 * 
 * Copyright 2014, Armenak Grigoryan, and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package com.strider.datadefender.functions;

import com.strider.datadefender.AnonymizerException;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
import static org.apache.log4j.Logger.getLogger;

/**
 * @author Armenak Grigoryan
 */
public class UtilsTest extends TestCase {
    
    /**
     * Initializes logger
     */
    private static Logger log = getLogger(UtilsTest.class);    
    
    public UtilsTest(final String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getClassName method, of class Utils.
     * @throws com.strider.datadefender.AnonymizerException
     */
    public void testGetClassName() throws AnonymizerException {
        log.info("Executing testGetClassName ...");
        
        final String fullClassName = "com.strider.dataanonymizer.functions.CoreFunctions";
        final String expResult = "com.strider.dataanonymizer.functions";
        
        log.debug("Parameter: " + fullClassName);
        log.debug("Expected result:" + expResult);

        final String result = Utils.getClassName(fullClassName);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getMethodName method, of class Utils.
     * @throws com.strider.datadefender.AnonymizerException
     */
    public void testGetMethodName() throws AnonymizerException {
        final String fullClassName = "com.strider.dataanonymizer.functions.CoreFunctions";
        final String expResult = "CoreFunctions";
        
        log.debug("Parameter: " + fullClassName);
        log.debug("Expected result:" + expResult);

        final String result = Utils.getMethodName(fullClassName);
        
        assertEquals(expResult, result);
    }    
}
