package com.example.testtreemenu.model.node;

import com.example.testtreemenu.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class NodeMenu {
    private Integer id;
    private Integer parent;
    private List<NodeMenu> children;
    private String name;

    public NodeMenu(Menu menu) {
        this.id = menu.getId();
        this.parent = menu.getPid();
        this.children = new ArrayList<>();
        this.name = menu.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChildren(NodeMenu menu){
        this.children.add(menu);
    }

    public List<NodeMenu> getChildren(){
        return this.children;
    }
}
