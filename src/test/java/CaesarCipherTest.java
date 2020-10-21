import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    private CaesarsCipher cipherTest = new CaesarsCipher();

    @Test
    public void testCipheredMessageWithOffset12(){
        assertEquals("nqxxa yud", cipherTest.cipher("Hello Sir", 12));
    }

    @Test
    public void testEmptyString(){
        assertEquals(" ", cipherTest.cipher(" ",12));
    }

}