package cn.frish2021.cc4gApi.Module;

public class Module {
    public String name;
    public boolean enabled;
    public Category category;
    public Module(String name, boolean enabled, Category category) {
        this.name = name;
        this.enabled = enabled;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
