package wctc.edu;
import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    public String encodeLastName(String lastName) {
        Soundex soundex = new Soundex();
        String enc = soundex.encode(lastName);
        return enc;
    }

}
