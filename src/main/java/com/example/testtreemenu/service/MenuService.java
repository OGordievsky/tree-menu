package com.example.testtreemenu.service;

import com.example.testtreemenu.model.Menu;
import com.example.testtreemenu.model.node.NodeMenu;
import com.example.testtreemenu.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MenuService {
    private MenuRepository repository;

    public MenuService(MenuRepository repository) {
        this.repository = repository;
    }

    public List<NodeMenu> getMenuTree() {
        List<NodeMenu> menuList = repository.getAll().stream().map(NodeMenu::new).toList();
        Map<Long, NodeMenu> resultMenuMap = menuList.stream().collect(Collectors.toMap(NodeMenu::getId, Function.identity()));

        for (NodeMenu menu : menuList) {
            if (menu.getParent() != null) {
                resultMenuMap.get(menu.getParent()).addChildren(menu);
            }
        }
        for (NodeMenu menu : menuList) {
            if (menu.getParent() != null) {
                resultMenuMap.remove(menu.getId());
            }
        }
        return resultMenuMap.values().stream().toList();
    }
}
