package com.example.treemenu.repository

import com.example.treemenu.model.Menu
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MenuRepository : JpaRepository<Menu?, Long?> {
}