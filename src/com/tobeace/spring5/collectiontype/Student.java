package com.tobeace.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String[] course;
    private List<Course> list;
    private Map<String,String> maps;
    private Set<String> sets;

    public void setList(List<Course> list) {
        this.list = list;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void testStudent(){
        System.out.println(course[0]+maps.get(list.get(0)));
        System.out.println(course[1]+maps.get(list.get(1)));
    }

    @Override
    public String toString() {
        return "Student{" +
                "list=" + Arrays.toString(list.toArray()) +
                '}';
    }
}
