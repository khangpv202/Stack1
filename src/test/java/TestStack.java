import Stack.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


/**
 * Created with IntelliJ IDEA.
 * User: khangpv
 * Date: 6/18/13
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    @Test
    public void testCreateStack(){
        Stack a = new Stack();
        assertEquals(a.size(),0);
    }
    @Test
    public void testEmptyStackandPush(){
        Stack a = new Stack();
        a.push("firstValue");
        assertEquals(a.size(),1);
    }
    @Test
    public void testPushOneMoreMember(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondValue");
        a.push("thirdValue");
        assertEquals(a.size(),3);
        //push one more value into stack
        a.push("fourValue");
        assertEquals(a.size(),4);

    }
    @Test
    public void testTop(){
        Stack a = new Stack();
        assertEquals(null, a.top());
    }
    @Test
    public void testPushandTop(){
        Stack a = new Stack();
        a.push("firstValue");
        assertEquals(a.top(),"firstValue");
    }
    @Test
    public void testPopException(){
        Stack a = new Stack();
        try {
            a.pop();
            fail();
        }catch (Exception e){
            assertEquals(e.getMessage()," StackEmptyException");
        }
    }
     @Test
    public void testPop(){
         Stack a = new Stack();
         a.push("firstValue");
         a.push("secondValue");
         a.push("thirdValue");
         assertEquals(a.size(),3);
         //pop :reduce size
         a.pop();
         assertEquals(a.size(),2);
     }
    @Test
    public void testPopforStackHasOneMember(){
        Stack a = new Stack();
        a.push("firstValue");
        assertEquals(a.size(),1);
        a.pop();
        assertEquals(a.size(),0);
    }
    @Test
    public void testTopPop(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondValue");
        a.push("thirdValue");
        String top = a.top();
        String pop = a.pop();
        assertEquals(top,pop);
    }
    @Test
    public void testReversePush(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondValue");
        a.push("thirdValue");
        assertEquals(a.pop(),"thirdValue");
        assertEquals(a.pop(),"secondValue");
        assertEquals(a.pop(),"firstValue");
    }

}
