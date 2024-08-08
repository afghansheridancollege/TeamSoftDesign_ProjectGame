/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author T-Box
 */
public class BlackjackPlayerTest {
    
    public BlackjackPlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addCard method, of class BlackjackPlayer.
     */
    
    

    /**
     * Test of getHandValue method, of class BlackjackPlayer.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        BlackjackPlayer instance = null;
        int expResult = 0;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fail.");
    }

    /**
     * Test of getHand method, of class BlackjackPlayer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        BlackjackPlayer instance = null;
        String expResult = "";
        String result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Fail.");
    }

    /**
     * Test of play method, of class BlackjackPlayer.
     */
    
    
}
 