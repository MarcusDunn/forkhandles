import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * https://kotlinlang.org/
     */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_scripting_compiler_embeddable: String =
            "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://junit.org/junit5/
     */
    const val junit_jupiter_api: String = "org.junit.jupiter:junit-jupiter-api:" +
            Versions.org_junit_jupiter

    /**
     * https://junit.org/junit5/
     */
    const val junit_jupiter_engine: String = "org.junit.jupiter:junit-jupiter-engine:" +
            Versions.org_junit_jupiter

    const val de_fayard_buildsrcversions_gradle_plugin: String =
            "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    const val com_github_kt3k_coveralls_gradle_plugin: String =
            "com.github.kt3k.coveralls:com.github.kt3k.coveralls.gradle.plugin:" +
            Versions.com_github_kt3k_coveralls_gradle_plugin

    const val net_saliman_cobertura_gradle_plugin: String =
            "net.saliman.cobertura:net.saliman.cobertura.gradle.plugin:" +
            Versions.net_saliman_cobertura_gradle_plugin

    const val com_jfrog_bintray_gradle_plugin: String =
            "com.jfrog.bintray:com.jfrog.bintray.gradle.plugin:" +
            Versions.com_jfrog_bintray_gradle_plugin

    /**
     * http://github.com/kt3k/coveralls-gradle-plugin/
     */
    const val coveralls_gradle_plugin: String = "org.kt3k.gradle.plugin:coveralls-gradle-plugin:" +
            Versions.coveralls_gradle_plugin

    /**
     * https://github.com/stevesaliman/gradle-cobertura-plugin
     */
    const val gradle_cobertura_plugin: String = "net.saliman:gradle-cobertura-plugin:" +
            Versions.gradle_cobertura_plugin

    /**
     * http://cobertura.sourceforge.net
     */
    const val cobertura: String = "net.sourceforge.cobertura:cobertura:" + Versions.cobertura

    /**
     * https://github.com/npryce/hamkrest
     */
    const val hamkrest: String = "com.natpryce:hamkrest:" + Versions.hamkrest
}
