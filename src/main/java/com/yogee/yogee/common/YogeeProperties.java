package com.yogee.yogee.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Demo class
 *
 * @author Jackqth
 * @date 2018/3/20
 */
@Component
public class YogeeProperties {

    @Value("${com.yogee.yogee.name}")
    private String name;

    @Value("${com.yogee.yogee.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
