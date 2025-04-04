package one.drix.mdn.text.format;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextDecoration {

    private final String value;

    public static final TextDecoration
        BOLD = new TextDecoration("bold"),
        ITALIC = new TextDecoration("italic"),
        UNDERLINED = new TextDecoration("underlined"),
        STRIKETHROUGH = new TextDecoration("strikethrough"),
        OBFUSCATED = new TextDecoration("obfuscated");
}
