package test.com.snippet.practice;

import static org.junit.Assert.*;

import com.snippet.practice.UglyNumber;
import org.junit.Test;

public class UglyNumberTest
{
    private UglyNumber un = new UglyNumber();

    @Test
    public void getUglyNumEfficiently() throws Exception
    {
        int num = un.getUglyNumEfficiently(10);

        assertEquals(12, num);
    }

    @Test
    public void getUglyNum() throws Exception
    {
        int num = un.getUglyNum(10);

        assertEquals(12, num);
    }

}