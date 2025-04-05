package one.drix.mdn.parser;

import com.alibaba.fastjson2.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JsonComponentsTest {

    @Test
    @DisplayName("Test Json Component")
    public void testJsonComponent() {
        JsonComponent hello = new JsonComponent("text", "hello world!");
        JsonComponent colors = new JsonComponent("colors", "red", "green", "blue");

        JSONObject helloJson = new JSONObject();
        helloJson.put("text", "hello world!");

        JSONObject colorsJson = new JSONObject();
        colorsJson.put("colors", List.of("red", "green", "blue"));

        Assertions.assertEquals(helloJson, hello.toJson());
        Assertions.assertEquals(colorsJson, colors.toJson());
    }
}
