package one.drix.mdn.text.interactivity.hover;

import lombok.AllArgsConstructor;
import lombok.Getter;
import one.drix.mdn.text.interactivity.Action;

@AllArgsConstructor
@Getter
public class HoverEvent implements OnHover {

    private final Action action;
    private final String value;

    public static final Action
        SHOW_TEXT = new Action("show_text", "value");
        //SHOW_ITEM = new Action("show_item", "id", "count", "components"),
        //SHOW_ENTITY = new Action("show_entity", "name", "id", "uuid");

    @Override
    public HoverEvent showText(String value) {
        return new HoverEvent(SHOW_TEXT, value);
    }
}
