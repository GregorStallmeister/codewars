package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.MorseCodeDecoder;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescriptionFirst() {
        assertThat(MorseCodeDecoder.decodeFirst(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
