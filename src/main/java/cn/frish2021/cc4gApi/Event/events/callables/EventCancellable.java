package cn.frish2021.cc4gApi.Event.events.callables;

import cn.frish2021.cc4gApi.Event.events.Cancellable;
import cn.frish2021.cc4gApi.Event.events.Event;

public abstract class EventCancellable implements Event, Cancellable {

    private boolean cancelled;

    protected EventCancellable() {
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean state) {
        cancelled = state;
    }

}
