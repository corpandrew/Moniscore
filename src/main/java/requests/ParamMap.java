package requests;

import java.util.HashMap;

public class ParamMap extends HashMap<String, Object> {

    public ParamMap() {
        super();
        add("APIkey", "08d9af6d24ed576921d39fb397e04c3a73a2718b85a53e892041b0b0a2d464b5");
    }

    public ParamMap add(String key, String value) {
        if(key != null && value != null)
            this.put(key, value);
        return this;
    }
}