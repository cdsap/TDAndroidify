// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.serialization) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.google.services) apply false
    alias(libs.plugins.crashlytics) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.baselineprofile) apply false
}


allprojects {
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        develocity.testDistribution {
            enabled.set(true)
            remoteExecutionPreferred.set(true)
            maxLocalExecutors.set(0)
            //requirements.set(setOf("os=linux", "jdk=17"))
        }

    }
}
