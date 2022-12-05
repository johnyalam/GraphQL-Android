/**
 * To define plugins
 */
object BuildPlugins {
}

/**
 * To define dependencies
 */
object Deps {
    val coreKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val appCompact by lazy {"androidx.appcompat:appcompat:${Versions.appcompat}"}
    val material by lazy {"com.google.android.material:material:${Versions.material}"}
    val constraintLayout by lazy {"androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"}
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val expressoCore by lazy {"androidx.test.espresso:espresso-core:${Versions.espressoCore}"}

    //GraphQL
    val apolloRuntime by lazy {"com.apollographql.apollo3:apollo-runtime:${Versions.apolloRuntime}"}
}
