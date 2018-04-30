package requests;

import java.util.HashMap;

public class ParamMap extends HashMap<String, Object> {

    public ParamMap() {
        super();
        add("APIkey", "");
    }

    public ParamMap add(String key, String value) {
        if(key != null && value != null)
            this.put(key, value);
        return this;
    }
}