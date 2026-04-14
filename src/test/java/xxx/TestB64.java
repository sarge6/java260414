package xxx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestB64 {
    @Test
    public void testB64(){
        String origText = "Hello Text!";
        String encText = B64.doBase64(origText, true);
        String decText = B64.doBase64(encText, false);
        Assertions.assertEquals(origText, decText, "Base64 Conversion failed");
        System.out.println(encText + "\n" + decText);
    }
}
