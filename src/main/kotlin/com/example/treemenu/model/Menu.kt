package com.example.treemenu.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test_categories")
class Menu {
    @Id
    var id: Int? = null

    @Column(name = "parent_id")
    var pid: Int? = null

    @Column
    var name: String? = null
}