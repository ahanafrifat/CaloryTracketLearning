plugins{
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android{
    namespace = "com.ahanafrifat.onboarding_domain"
}

//android {
//    namespace 'com.example.namespace'
//}

dependencies {
    implementation(project(Modules.core))
}