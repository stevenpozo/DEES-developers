
package ec.edu.espe.Spa.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class ServiceControllerTest {
    
    public ServiceControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validateHour method, of class ServiceController.
     */
    @Test
    public void testValidateHour() {
        System.out.println("validateHour");
        String hour = "";
        ServiceController instance = new ServiceController();
        Boolean expResult = null;
        Boolean result = instance.validateHour(hour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtainInteger method, of class ServiceController.
     */
    @Test
    public void testObtainInteger() {
        System.out.println("obtainInteger");
        String value = "";
        ServiceController instance = new ServiceController();
        int expResult = 0;
        int result = instance.obtainInteger(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
