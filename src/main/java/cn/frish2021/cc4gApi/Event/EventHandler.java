package cn.frish2021.cc4gApi.Event;

import cn.frish2021.cc4gApi.Event.types.Priority;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandler {

    byte value() default Priority.MEDIUM;
}
