package com.DevOperations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OperationsTest {
        @Test
        public void testadd1() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(30, op.add());
        }
        @Test
        public void testadd2() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(30, op.add());
        }
        @Test
        public void testsub1() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(20, op.sub());
        }
        @Test
        public void testsub2() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(20, op.sub());
        }
        @Test
        public void testmulti1() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(125, op.multi());
        }
        @Test
        public void testmulti2() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(125, op.multi());
        }
        @Test
        public void testdiv1() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(5, op.div());
        }
        @Test
        public void testdiv2() 
        {
        	Operations op=new Operations();
        	Assert.assertEquals(5, op.div());
        }
}
