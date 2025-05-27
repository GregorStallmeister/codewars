package de.gregorstallmeister.codewars.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import de.gregorstallmeister.codewars.AcronymGenerator;
import org.junit.Test;

// https://www.codewars.com/kata/576a599359b11651bc00040e/train/java

public class AcronymGeneratorTest {

    @Test
    public void testSimpleFirst() throws Exception {
        assertThat(AcronymGenerator.createAcronymFirst("Meyer", "Thomas"), is("TM"));
    }

    @Test
    public void testMultipleLastNamesFirst() throws Exception {
        assertThat(AcronymGenerator.createAcronymFirst("Meyer-Schmidt", "Paul"), is("PMS"));
    }

    @Test
    public void testMultipleFirstNamesWithBlankFirst() throws Exception {
        assertThat(AcronymGenerator.createAcronymFirst("Mueller", "Jan Erich"), is("JEM"));
    }

    @Test
    public void testMultipleFirstNamesWithDashFirst() throws Exception {
        assertThat(AcronymGenerator.createAcronymFirst("Schmidt", "Jan-Erich"), is("JES"));
    }

    @Test
    public void testVonNameFirst() throws Exception {
        assertThat(AcronymGenerator.createAcronymFirst("von Lahnstein", "Peter"), is("PvL"));
    }

    @Test
    public void testSimpleSecond() throws Exception {
        assertThat(AcronymGenerator.createAcronymSecond("Meyer", "Thomas"), is("TM"));
    }

    @Test
    public void testMultipleLastNamesSecond() throws Exception {
        assertThat(AcronymGenerator.createAcronymSecond("Meyer-Schmidt", "Paul"), is("PMS"));
    }

    @Test
    public void testMultipleFirstNamesWithBlankSecond() throws Exception {
        assertThat(AcronymGenerator.createAcronymSecond("Mueller", "Jan Erich"), is("JEM"));
    }

    @Test
    public void testMultipleFirstNamesWithDashSecond() throws Exception {
        assertThat(AcronymGenerator.createAcronymSecond("Schmidt", "Jan-Erich"), is("JES"));
    }

    @Test
    public void testVonNameSecond() throws Exception {
        assertThat(AcronymGenerator.createAcronymSecond("von Lahnstein", "Peter"), is("PvL"));
    }

    @Test
    public void testSimple() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Meyer", "Thomas"), is("TM"));
    }

    @Test
    public void testMultipleLastNames() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Meyer-Schmidt", "Paul"), is("PMS"));
    }

    @Test
    public void testMultipleFirstNamesWithBlank() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Mueller", "Jan Erich"), is("JEM"));
    }

    @Test
    public void testMultipleFirstNamesWithDash() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Schmidt", "Jan-Erich"), is("JES"));
    }

    @Test
    public void testVonName() throws Exception {
        assertThat(AcronymGenerator.createAcronym("von Lahnstein", "Peter"), is("PvL"));
    }
}
