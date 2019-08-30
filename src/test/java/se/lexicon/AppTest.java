package se.lexicon;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    ///Add test
    @Test
    public void addTrue()
    {
      double number1=1;
      double number2=1;
        assertTrue(App.add(number1,number2)==2 );
    }
    @Test
    public void addFalse()
    {
        double number1=1;
        double number2=1;
        assertFalse(App.add(number1,number2)==3 );
    }

    //Sub test
    @Test
    public void subTrue()
    {
        double number1=1;
        double number2=1;
        assertTrue(App.sub(number1,number2)==0 );
    }
    @Test
    public void subFalse()
    {
        double number1=1;
        double number2=1;
        assertFalse(App.sub(number1,number2)==2);
    }


    //Div test
    @Test
    public void divTrue()
    {
        double number1=1;
        double number2=0;
        assertTrue(App.div(number1,number2)==Double.POSITIVE_INFINITY);
    }
    @Test
    public void divFalse()
    {
        double number1=1;
        double number2=1;
        assertFalse(App.div(number1,number2)==2);
    }

    //Multiplication test
    @Test
    public void multTrue()
    {
        double number1=1;
        double number2=0;
        assertTrue(App.mult(number1,number2)==0);
    }
    @Test
    public void multFalse()
    {
        double number1=1;
        double number2=0;
        assertFalse(App.mult(number1,number2)==1);
    }

}
