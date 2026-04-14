package xxx;
import java.util.Base64;
public class B64 {
    public static String doBase64(String text, boolean bEncode){
        String res = "";
        if(bEncode){
            res = Base64.getEncoder().encodeToString(text.getBytes());
        }
        else{
            res = new String(Base64.getDecoder().decode(text));
        }
        return res;
    }
    public static void main(String[] args) {
        String text = "Hello World!";
        String encText = doBase64(text, true);
        String decText = doBase64(encText, false);
        System.out.println(encText + "\n" + decText);
    }
}
