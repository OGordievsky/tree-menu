package com.example.testtreemenu.model;

import java.util.List;

public class Menu {
    private Long id;
    private Long pid;
    private String name;


    public Menu(){
    }

    public Menu(String name, Long id, Long pid) {
        this.id = id;
        this.pid = pid;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
