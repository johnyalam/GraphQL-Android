plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("com.apollographql.apollo3").version("3.7.1")
}

android {
    namespace = Versions.namespace
    compileSdk = 33

    defaultConfig {
        applicationId = Versions.applicationId
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = Versions.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }
}

dependencies {
    implementation ( Deps.coreKtx)
    implementation ( Deps.appCompact )
    implementation ( Deps.material)
    implementation ( Deps.constraintLayout)
    testImplementation(Deps.junit)
    androidTestImplementation (Deps.testEspressoCore)

    //GraphQL
    implementation( Deps.apolloRuntime)

    //Compose UI
    implementation ( Deps.lifecycleRuntime)
    implementation ( Deps.material3)
    implementation(Deps.activityCompose)
    implementation (Deps.composeUi)
    implementation (Deps.uiToolingPreview)
    androidTestImplementation (Deps.uiTooling)
    debugImplementation (Deps.uiTestJunit4)
    debugImplementation (Deps.uiTestManifest)
}
apollo {
    packageName.set(Versions.packageName)
}