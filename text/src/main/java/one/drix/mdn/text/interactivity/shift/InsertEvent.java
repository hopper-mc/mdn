package one.drix.mdn.text.interactivity.shift;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InsertEvent implements OnShiftClick {

    private final String value;

    @Override
    public InsertEvent insert(String value) {
        return new InsertEvent(value);
    }
}
