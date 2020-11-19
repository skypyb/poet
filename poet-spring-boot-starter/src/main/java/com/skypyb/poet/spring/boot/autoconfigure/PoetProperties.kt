package com.skypyb.poet.spring.boot.autoconfigure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import javax.validation.constraints.NotNull

@ConfigurationProperties(prefix = "poet")
@Component("poetProperties")
class PoetProperties {
    //默认储存位置
    var storageLocation: @NotNull String? = null

    //是否启用web资源层
    var enableWebResource = true

    //web资源接口请求路径前缀
    var webUrlPrefix = "/poet"

    //默认模块, 在文件保存时若不指定则将直接保存到此模块之中
    var defaultModule: String? = null

    //路径分隔符,  以本地文件系统作为附件储存库时可使用 '/', 适配 unix&win
    var pathDelimiter: @NotNull String? = "/"

    //储存附件信息的表名
    var tableName: @NotNull String? = "tb_poet_annex"
}