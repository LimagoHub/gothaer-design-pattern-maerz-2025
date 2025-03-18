package event;

public record PropertyChangedEvent(
        Object source,
        String propertyName,
        Object oldValue,
        Object newValue
) {}
