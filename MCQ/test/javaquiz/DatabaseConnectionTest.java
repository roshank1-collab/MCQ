/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anonymous
 */
public class DatabaseConnectionTest {
    
    public DatabaseConnectionTest() {
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
     * Test of save method, of class DatabaseConnection.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String fullname = "";
        String address = "";
        String contact = "";
        String email = "";
        String password = "";
        DatabaseConnection instance = new DatabaseConnection();
        int expResult = 0;
        int result = instance.save(fullname, address, contact, email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tokenNo method, of class DatabaseConnection.
     */
    @Test
    public void testTokenNo() {
        System.out.println("tokenNo");
        DatabaseConnection instance = new DatabaseConnection();
        String expResult = "";
        String result = instance.tokenNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class DatabaseConnection.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String fullname = "";
        String password = "";
        DatabaseConnection instance = new DatabaseConnection();
        int expResult = 0;
        int result = instance.login(fullname, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class DatabaseConnection.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String subname = "";
        String question = "";
        String option1 = "";
        String option2 = "";
        String option3 = "";
        String option4 = "";
        String correctans = "";
        DatabaseConnection instance = new DatabaseConnection();
        int expResult = 0;
        int result = instance.insert(subname, question, option1, option2, option3, option4, correctans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DatabaseConnection.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String correctanswer = "";
        DatabaseConnection instance = new DatabaseConnection();
        int expResult = 0;
        int result = instance.delete(correctanswer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DatabaseConnection.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String name = "";
        String add = "";
        String contact = "";
        String email = "";
        DatabaseConnection instance = new DatabaseConnection();
        int expResult = 0;
        int result = instance.update(name, add, contact, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class DatabaseConnection.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        String Questions = "";
        DatabaseConnection instance = new DatabaseConnection();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getQuestion(Questions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
