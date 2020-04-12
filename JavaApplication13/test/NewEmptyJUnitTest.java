/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication13.JavaApplication13;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdul Moiz711
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void TestEqualstring() {
        String s1,sub1;
        s1 = "HELLO";
        sub1 = "HEL";
        JavaApplication13 j=new JavaApplication13();
        assertEquals(true,j.substring(s1, sub1));
        
    }
    @Test
    public void TestNotEqualstring() {
        String s1,sub1;
        s1 = "HELLO";
        sub1 = "WORLD";
        JavaApplication13 j=new JavaApplication13();
        assertNotEquals(true,j.substring(s1, sub1));
        
    }
    
    @Test
    public void TestFalsestring() {
        String s1,sub1;
        s1 = "HELLO";
        sub1 = "NEW";
        JavaApplication13 j=new JavaApplication13();
        assertFalse(j.substring(s1, sub1));
        
    }

    @Test
    public void TestNotNullstring() {
        String s1,sub1;
        s1 = "HELLO";
        sub1 = "HEL";
       
        JavaApplication13 j=new JavaApplication13();
        assertNotNull(j.substring(s1, sub1));
    }
    
    @Test
    public void TestTruestring() {
        String s1,sub1;
        s1 = "HELLO";
        sub1 = "HEL";
       
        JavaApplication13 j=new JavaApplication13();
        assertTrue(j.substring(s1, sub1));
    }
    
    @Test
    public void TestSamestring() {
        String s1,sub1,s2,sub2;
        s1 = "HELLO";
        sub1 = "HEL";
        s2 = "WORLD";
        sub2 = "WOR";
        JavaApplication13 j=new JavaApplication13();
        assertSame(j.substring(s1, sub1),j.substring(s2, sub2));
        
    }
    public void TestNotSamestring() {
        String s1,sub1,s2,sub2;
        s1 = "HELLO";
        sub1 = "HEL";
        s2 = "WORLD";
        sub2 = "WOR";
        JavaApplication13 j=new JavaApplication13();
        assertNotSame(j.substring(s1, sub1),j.substring(s2, sub2));
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
