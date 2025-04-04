package one.drix.mdn.text.interactivity.click;

public interface OnClick {
    ClickEvent openUrl(final String url);
    ClickEvent openFile(final String path);
    ClickEvent runCommand(final String command);
    ClickEvent suggestCommand(final String command);
    ClickEvent changePage(final int page);
    ClickEvent copyToClipboard(final String value);
}
