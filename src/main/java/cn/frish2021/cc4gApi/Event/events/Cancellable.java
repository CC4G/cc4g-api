package cn.frish2021.cc4gApi.Event.events;

public interface Cancellable {

    boolean isCancelled();
    void setCancelled(boolean state);

}
