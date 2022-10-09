package com.example.treemenu.service

import com.example.treemenu.model.node.NodeMenu
import com.example.treemenu.repository.MenuRepository
import org.springframework.stereotype.Service

@Service
class MenuServiceImpl(private val repository: MenuRepository) : MenuService {

    override val menuTree: List<NodeMenu>
        get() {
            val menuList: List<NodeMenu> = repository.findAll().map { NodeMenu(it!!) }
            val resultMenuMap: MutableMap<Int, NodeMenu> = menuList.associateBy { it.id }.toMutableMap()

            for (menu in menuList) {
                if (menu.parent != null) {
                    resultMenuMap[menu.parent]!!.addChildren(menu)
                }
            }
            for (menu in menuList) {
                if (menu.parent != null) {
                    resultMenuMap.remove(menu.id)
                }
            }
            return resultMenuMap.values.toList()
        }
}