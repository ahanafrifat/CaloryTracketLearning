plugins{
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android{
    namespace = "com.ahanafrifat.core_ui"
}