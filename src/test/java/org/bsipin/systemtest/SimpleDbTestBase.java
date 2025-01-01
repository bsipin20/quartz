package org.bsipin.systemtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.bsipin.Database;

/**
 * Base class for all SimpleDb test classes. 
 * @author nizam
 *
 */
public class SimpleDbTestBase {
	/**
	 * Reset the database before each test is run.
	 */
	@BeforeEach	public void setUp() throws Exception {
		Database.reset();
	}
	
}
