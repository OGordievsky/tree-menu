package com.example.testtreemenu.service;

import com.example.testtreemenu.model.node.NodeMenu;
import com.example.testtreemenu.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {
    private MenuRepository repository;

    public MenuServiceImpl(MenuRepository repository) {
        this.repository = repository;
    }

    public List<NodeMenu> getMenuTree() {
        List<NodeMenu> menuList = repository.findAll().stream().map(NodeMenu::new).toList();
        Map<Integer, NodeMenu> resultMenuMap = menuList.stream().collect(Collectors.toMap(NodeMenu::getId, Function.identity()));

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
