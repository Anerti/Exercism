import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private final Map<Integer, String> map = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code, country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!(map.containsKey(code) || map.containsValue(country))) setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Integer code : map.keySet()) {
            if (map.get(code).equals(country)) return code;
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (findDialingCode(country) != null){
            for (Integer key : map.keySet()) {
                if (map.get(key).equals(country)){
                    map.remove(key);
                    map.put(code, country);
                }
            }
        }
    }
}
