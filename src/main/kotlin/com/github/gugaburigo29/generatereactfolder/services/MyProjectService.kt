package com.github.gugaburigo29.generatereactfolder.services

import com.github.gugaburigo29.generatereactfolder.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
