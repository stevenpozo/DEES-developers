
package ec.edu.espe.Spa.controller;

import org.bson.Document;
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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
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
     * Test of RegisterAndBuildDocument method, of class CustomerController.
     */
    @Test
    public void testRegisterAndBuildDocument() {
        System.out.println("RegisterAndBuildDocument");
        String firstName = "";
        String lastName = "";
        String identification = "";
        String cellphone = "";
        String email = "";
        String typeOfService = "";
        String cost = "";
        String timeOfTreatment = "";
        String date = "";
        String hourOfAttention = "";
        CustomerController instance = null;
        Document expResult = null;
        Document result = instance.RegisterAndBuildDocument(firstName, lastName, identification, cellphone, email, typeOfService, cost, timeOfTreatment, date, hourOfAttention);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
