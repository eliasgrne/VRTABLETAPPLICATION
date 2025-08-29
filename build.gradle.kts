// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // These plugins are declared here for version management and distribution to sub-modules.
    // They are NOT applied directly to the root project.
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    // If you have other top-level plugins like Google Services, they might be here too,
    // but they should also typically use 'apply false' if they are applied per-module.
}

// Allprojects and other top-level configurations would go here, if any.
// For example:
// allprojects {
//     repositories {
//         google()
//         mavenCentral()
//     }
// }
