package com.example.blog

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("blog")
class BlogProperties {

    var title: String = "Super Blog"
}
