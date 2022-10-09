package com.example.treemenu.model.node

import com.example.treemenu.model.Menu

class NodeMenu(menu: Menu) {
    var id: Int
    var parent: Int?
    private val children: MutableList<NodeMenu>
    var name: String

    init {
        id = menu.id!!
        parent = menu.pid
        children = ArrayList()
        name = menu.name!!
    }

    fun addChildren(menu: NodeMenu) {
        children.add(menu)
    }

    fun getChildren(): List<NodeMenu> {
        return children
    }
}
