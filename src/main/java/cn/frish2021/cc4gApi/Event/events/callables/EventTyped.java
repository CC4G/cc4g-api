package cn.frish2021.cc4gApi.Event.events.callables;

import cn.frish2021.cc4gApi.Event.events.Event;
import cn.frish2021.cc4gApi.Event.events.Typed;

public abstract class EventTyped implements Event, Typed {

    private final byte type;

    protected EventTyped(byte eventType) {
        type = eventType;
    }

    @Override
    public byte getType() {
        return type;
    }

}
