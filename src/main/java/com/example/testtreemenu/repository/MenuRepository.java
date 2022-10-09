package com.example.testtreemenu.repository;

import com.example.testtreemenu.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuRepository {

    public List<Menu> getAll() {
        List<Menu> menuList = new ArrayList<>();
        Menu root1 = new Menu("Root1", 0L, null);
        Menu Child1 = new Menu("Child1", 10L, 0L);
        Menu Child2 = new Menu("Child2", 20L, 0L);
        Menu Child3 = new Menu("Child3", 30L, 0L);
        Menu Child31 = new Menu("Child3.1", 31L, 30L);
        Menu Child32 = new Menu("Child3.2", 32L, 30L);
        Menu Child33 = new Menu("Child3.3", 33L, 30L);
        Menu Child21 = new Menu("Child2.1", 21L, 20L);
        Menu Child22 = new Menu("Child2.2", 22L, 20L);
        Menu Child331 = new Menu("Child3.3.1", 331L, 33L);
        Menu root2 = new Menu("Root2", 1L, null);

        menuList.add(root1);
        menuList.add(Child1);
        menuList.add(Child2);
        menuList.add(Child3);
        menuList.add(Child31);
        menuList.add(Child32);
        menuList.add(Child33);
        menuList.add(Child21);
        menuList.add(Child22);
        menuList.add(Child331);
        menuList.add(root2);

        return menuList;
    }
}
