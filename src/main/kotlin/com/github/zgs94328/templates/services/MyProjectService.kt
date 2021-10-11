package com.github.zgs94328.templates.services

import com.github.zgs94328.templates.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
