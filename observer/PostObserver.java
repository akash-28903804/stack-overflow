package stackoverflow.observer;

import stackoverflow.stack.classes.Event;

public interface PostObserver {
    void onPostEvent(Event event);
}