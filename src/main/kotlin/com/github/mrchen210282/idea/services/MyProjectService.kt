package com.github.mrchen210282.idea.services

import com.intellij.openapi.project.Project
import com.github.mrchen210282.idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
