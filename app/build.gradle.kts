plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.johncastle.composeexample"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.johncastle.composeexample"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    //compose needed
    buildFeatures {
         compose=true

    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    //compose needed
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    //kotlin needed
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //ALL DEPENDENCIES COMPOSE NEEDED
    implementation ("androidx.compose.ui:ui:1.2.1")
    // Tooling support (Previews, etc.)
    implementation ("androidx.compose.ui:ui-tooling:1.2.1")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation ("androidx.compose.foundation:foundation:1.2.1")
    // Material Design
    implementation ("androidx.compose.material:material:1.2.1")
    // Material design icons
    implementation ("androidx.compose.material:material-icons-core:1.2.1")
    implementation ("androidx.compose.material:material-icons-extended:1.2.1")
    // Integration with activities
    implementation ("androidx.activity:activity-compose:1.5.1")
    // Integration with ViewModels
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")
    // Integration with observables
    implementation ("androidx.compose.runtime:runtime-livedata:1.2.1")
    implementation ("androidx.compose.runtime:runtime-rxjava2:1.2.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.5.0")

    // UI Tests
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.2.1")}