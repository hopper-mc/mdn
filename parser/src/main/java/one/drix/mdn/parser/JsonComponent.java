package one.drix.mdn.parser;

import com.alibaba.fastjson2.JSONObject;
import lombok.Getter;

import java.util.List;

@Getter
public class JsonComponent {

    private final String key;
    private final Object value;

    public JsonComponent(String key, Object... values) {
        this.key = key;
        this.value = values.length == 1 ? values[0] : List.of(values);
    }

    public JsonComponent(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put(key, value);
        return json;
    }
}
