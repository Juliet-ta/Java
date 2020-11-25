package com.company;

import java.util.List;

public class CourseWork {
    private final String name;
    private final String description;

    public CourseWork(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return  "CourseWork [" +
                "name = " + name +
                "description = " + description +
                ']';
    }
}
