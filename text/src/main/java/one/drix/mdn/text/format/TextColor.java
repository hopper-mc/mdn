package one.drix.mdn.text.format;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextColor {

    private final String value;
    private final String hex;

    public static final TextColor
        BLACK = new TextColor("black", "#000000"),
        DARK_BLUE = new TextColor("dark_blue", "#0000AA"),
        DARK_GREEN = new TextColor("dark_green", "#00AA00"),
        DARK_AQUA = new TextColor("dark_aqua", "#00AAAA"),
        DARK_RED = new TextColor("dark_red", "#AA0000"),
        DARK_PURPLE = new TextColor("dark_purple", "#AA00AA"),
        GOLD = new TextColor("gold", "#FFAA00"),
        GRAY = new TextColor("gray", "#AAAAAA"),
        DARK_GRAY = new TextColor("dark_gray", "#555555"),
        BLUE = new TextColor("blue", "#5555FF"),
        GREEN = new TextColor("green", "#55FF55"),
        AQUA = new TextColor("aqua", "#55FFFF"),
        RED = new TextColor("red", "#FF5555"),
        LIGHT_PURPLE = new TextColor("light_purple", "#FF55FF"),
        YELLOW = new TextColor("yellow", "#FFFF55"),
        WHITE = new TextColor("white", "#FFFFFF");

    public TextColor(String hex) {
        this.value = "hex";
        this.hex = hex;
    }

    public static TextColor from(int r, int g, int b) {
        return new TextColor("", "#");
    }

    public static TextColor from(int c, int m, int y, int k) {
        return new TextColor("", "");
    }
}
