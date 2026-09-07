import java.util.HashMap;
import java.util.Map;
public class Codec {
    private final Map<String, String> urlMap = new HashMap<>();
    private int id = 0;
    private static final String BASE_URL = "http://tinyurl.com/";
    public String encode(String longUrl) {
        id++;
        String shortKey = Integer.toString(id);
        urlMap.put(shortKey, longUrl);
        return BASE_URL + shortKey;
    }
    public String decode(String shortUrl) {
        String shortKey = shortUrl.replace(BASE_URL, "");
        return urlMap.get(shortKey);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));