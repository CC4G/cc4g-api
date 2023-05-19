package cn.frish2021.cc4gApi;

import cn.frish2021.cc4gApi.Event.EventManager;
import cn.frish2021.cc4gApi.Module.ModuleManager;

public class CC4G {
    public void run(Object object) {
        System.out.println("CC4G-api Run!!!!");
        ModuleManager moduleManager = new ModuleManager();
        EventManager.register(this);
    }
    public void shut(Object object) {
        System.out.println("CC4G-api Shut!!!!");
        EventManager.unregister(this);
    }
}
