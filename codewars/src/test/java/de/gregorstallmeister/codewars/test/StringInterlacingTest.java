package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.StringInterlacing;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/56e120ee2bb224eaa3000ba2/train/java

public class StringInterlacingTest {
    @Test
    public void interlaceTestAFirst(){
        assertEquals("HWeolrllod", StringInterlacing.interlaceFirst("Hello", "World"));
    }
    @Test
    public void interlaceTestBFirst(){
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlaceFirst("Gimme", "some lovin'"));
    }
    @Test
    public void interlaceTestCFirst(){
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlaceFirst("some lovin'", "Gimme"));
    }

    @Test
    public void interlaceTestA(){
        assertEquals("HWeolrllod", StringInterlacing.interlace("Hello", "World"));
    }
    @Test
    public void interlaceTestB(){
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("Gimme", "some lovin'"));
    }
    @Test
    public void interlaceTestC(){
        assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("some lovin'", "Gimme"));
    }
}
