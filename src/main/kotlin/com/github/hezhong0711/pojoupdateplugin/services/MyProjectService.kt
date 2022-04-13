package com.github.hezhong0711.pojoupdateplugin.services

import com.intellij.openapi.project.Project
import com.github.hezhong0711.pojoupdateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
