/**
 * To define plugins
 */
object BuildPlugins {
}

/**
 * To define dependencies
 */
object Deps {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val testEspressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}" }

    //GraphQL
    val apolloRuntime by lazy { "com.apollographql.apollo3:apollo-runtime:${Versions.apolloRuntime}" }

    //Compose UI
    val material3 by lazy {"androidx.compose.material3:material3:${Versions.material3}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.composeVersion}"}
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.composeVersion}"}
    val uiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"}
    val uiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.composeVersion}" }
    val uiTestJunit4 by lazy {"androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"}
    val uiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"}
    val androidxTestExt by lazy {"androidx.test.ext:junit:${Versions.androidxTestExt}"}
    val datastorePreferences by lazy {"androidx.datastore:datastore-preferences:${Versions.datastorePreferences}"}
    val securityCrypto by lazy {"androidx.security:security-crypto:${Versions.securityCrypto}"}

    // Compose dependencies
    val lifecycle_viewmodel_compose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle_viewmodel_compose}"}
    val navigation_compose by lazy { "androidx.navigation:navigation-compose:${Versions.navigation_compose}"}
    val accompanist_flowlayout by lazy { "com.google.accompanist:accompanist-flowlayout:${Versions.accompanist_flowlayout}"}
}

