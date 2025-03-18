package event;

import java.beans.PropertyChangeEvent;

public interface PropertyChangedListener {

    void propertyChanged(final PropertyChangeEvent e);
}
