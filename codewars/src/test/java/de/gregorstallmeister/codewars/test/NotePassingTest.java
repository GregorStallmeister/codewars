package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.NotePassing;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/57452748976d65946d000599/train/java

public class NotePassingTest {
    @Test
    public void testEmptyNoteFirst() throws Exception {
        assertEquals("Empty notes should still be empty after decoding", "", NotePassing.decipherFirst(""));
    }
    @Test
    public void testLowerCaseNoteFirst() throws Exception {
        assertEquals("Error in deciphering lowercase letters", "school is so boring i can't believe there are so many hours left", NotePassing.decipherFirst("lvahhe bl lh uhkbgz b vtg'm uxebxox maxkx tkx lh ftgr ahnkl exym"));
    }
    @Test
    public void testUpperCaseNoteFirst() throws Exception {
        assertEquals("Error in deciphering uppercase letters", "OMG MAY YOUR DRESS IS SO CUTE",NotePassing.decipherFirst("HFZ FTR RHNK WKXLL BL LH VNMX"));
    }
    @Test
    public void testPunctionationNoteFirst() throws Exception {
        assertEquals("Error in deciphering uppercase letters", "Hey May! Which teacher do you think is nicer, Mr. Jones or Mrs. Patel?",NotePassing.decipherFirst("Axr Ftr! Pabva mxtvaxk wh rhn mabgd bl gbvxk, Fk. Chgxl hk Fkl. Itmxe?" ));
    }

    @Test
    public void testEmptyNote() throws Exception {
        assertEquals("Empty notes should still be empty after decoding", "", NotePassing.decipher(""));
    }
    @Test
    public void testLowerCaseNote() throws Exception {
        assertEquals("Error in deciphering lowercase letters", "school is so boring i can't believe there are so many hours left", NotePassing.decipher("lvahhe bl lh uhkbgz b vtg'm uxebxox maxkx tkx lh ftgr ahnkl exym"));
    }
    @Test
    public void testUpperCaseNote() throws Exception {
        assertEquals("Error in deciphering uppercase letters", "OMG MAY YOUR DRESS IS SO CUTE",NotePassing.decipher("HFZ FTR RHNK WKXLL BL LH VNMX"));
    }
    @Test
    public void testPunctionationNote() throws Exception {
        assertEquals("Error in deciphering uppercase letters", "Hey May! Which teacher do you think is nicer, Mr. Jones or Mrs. Patel?",NotePassing.decipher("Axr Ftr! Pabva mxtvaxk wh rhn mabgd bl gbvxk, Fk. Chgxl hk Fkl. Itmxe?" ));
    }
}
