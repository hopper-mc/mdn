package one.drix.mdn.text.interactivity.click;

import lombok.AllArgsConstructor;
import lombok.Getter;
import one.drix.mdn.text.interactivity.Action;

@AllArgsConstructor
@Getter
public class ClickEvent implements OnClick {

    private final Action action;
    private final String value;

    public static final Action
        OPEN_URL = new Action("open_url", "url"),
        OPEN_FILE = new Action("open_file", "path"),
        RUN_COMMAND = new Action("run_command", "command"),
        SUGGEST_COMMAND = new Action("suggest_command", "command"),
        CHANGE_PAGE = new Action("change_page", "page"),
        COPY_TO_CLIPBOARD = new Action("copy_to_clipboard", "value");

    @Override
    public ClickEvent openUrl(String url) {
        return new ClickEvent(OPEN_URL, url);
    }

    @Override
    public ClickEvent openFile(String path) {
        return new ClickEvent(OPEN_FILE, path);
    }

    @Override
    public ClickEvent runCommand(String command) {
        return new ClickEvent(RUN_COMMAND, command);
    }

    @Override
    public ClickEvent suggestCommand(String command) {
        return new ClickEvent(SUGGEST_COMMAND, command);
    }

    @Override
    public ClickEvent changePage(int page) {
        return new ClickEvent(CHANGE_PAGE, String.valueOf(page));
    }

    @Override
    public ClickEvent copyToClipboard(String value) {
        return new ClickEvent(COPY_TO_CLIPBOARD, value);
    }
}
