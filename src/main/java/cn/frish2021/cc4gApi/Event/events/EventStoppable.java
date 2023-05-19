package cn.frish2021.cc4gApi.Event.events;

public abstract class EventStoppable implements Event {

    private boolean stopped;

    protected EventStoppable() {
    }

    public void stop() {
        stopped = true;
    }

    public boolean isStopped() {
        return stopped;
    }

}
