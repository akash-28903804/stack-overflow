package stackoverflow.stack.classes;

import stackoverflow.enums.EventType;

public class Event extends Content{
    private final EventType type;
    private final User actor;
    private final Post targetpost;

    public Event(EventType type, User actor, Post targetPost) {
        this.type = type;
        this.actor = actor;
        this.targetpost = targetPost;

    }
    public EventType getType() { return type; }
    public User getActor() { return actor; }
    public Post getTargetPost() { return targetPost; }
}
