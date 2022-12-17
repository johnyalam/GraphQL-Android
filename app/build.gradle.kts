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
        vectorDrawables {
            useSupportLibrary = true
        }
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

    implementation (Deps.coreKtx)
    implementation (Deps.lifecycleRuntime)
    implementation (Deps.activityCompose)

    implementation (Deps.material3)
    testImplementation (Deps.junit)
    androidTestImplementation (Deps.androidxTestExt)
    androidTestImplementation (Deps.testEspressoCore)

    implementation (Deps.composeUi)
    implementation (Deps.uiToolingPreview)
    androidTestImplementation (Deps.uiTestJunit4)
    debugImplementation (Deps.uiTooling)
    debugImplementation (Deps.uiTestManifest)

    //GraphQL
    implementation( Deps.apolloRuntime)

    //Jetpack Data Store
    implementation (Deps.datastorePreferences)

    //Security Crypto
    implementation(Deps.securityCrypto)

    // Compose dependencies
    implementation (Deps.lifecycle_viewmodel_compose )
    implementation (Deps.navigation_compose )
    implementation (Deps.accompanist_flowlayout )
}
apollo {
    packageName.set(Versions.packageName)
}

