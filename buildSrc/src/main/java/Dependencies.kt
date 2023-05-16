object AppConfig {
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
}

object Version {
    object AndroidX {
        const val CoreKTX = "1.8.0"
        const val AppCompat = "1.6.1"

        const val ActivityKTX = "1.7.1"
        const val FragmentKTX = "1.5.7"

        const val Lifecycle = "2.6.1"
        const val Navigation = "2.5.3"
    }

    object Google {
        const val Material = "1.9.0"
        const val Hilt = "2.46"
    }

    object Libraries {
        // Retrofit
        const val Retrofit2= "2.9.0"
        const val Retrofit2Scalars = "2.6.4"
        const val Retrofit2LoggingInterceptor = "4.9.2"

        // Glide
        const val Glide = "4.14.2"
        const val GlideCompiler = "4.14.2"
    }

    object Test {
        const val JUnit = "4.13.2"
        const val AndroidJUnit = "1.1.5"
        const val EspressoCore = "3.5.1"
    }
}

object AndroidX {
    const val CoreKTX = "androidx.core:core-ktx:${Version.AndroidX.CoreKTX}"
    const val AppCompat = "androidx.appcompat:appcompat:${Version.AndroidX.AppCompat}"

    const val ActivityKTX = "androidx.activity:activity-ktx:${Version.AndroidX.ActivityKTX}"
    const val FragmentKTX = "androidx.fragment:fragment-ktx:${Version.AndroidX.FragmentKTX}"

    val Lifecycle = listOf(
        "androidx.lifecycle:lifecycle-viewmodel-ktx:",
        "androidx.lifecycle:lifecycle-livedata-ktx:",
    ).map { it + Version.AndroidX.Lifecycle }

    val Navigation = listOf(
        "androidx.navigation:navigation-fragment-ktx:",
        "androidx.navigation:navigation-ui-ktx:",
    ).map { it + Version.AndroidX.Navigation }
}

object Google {
    const val Material = "com.google.android.material:material:${Version.Google.Material}"

    // Hilt
    const val Hilt = "com.google.dagger:hilt-android:${Version.Google.Hilt}"
    const val HiltCompiler = "com.google.dagger:hilt-compiler:${Version.Google.Hilt}"
}

object Libraries {
    val Retrofit2 = listOf(
        "com.squareup.retrofit2:retrofit:${Version.Libraries.Retrofit2}",
        "com.squareup.retrofit2:converter-gson:${Version.Libraries.Retrofit2}",
        "com.squareup.retrofit2:converter-scalars:${Version.Libraries.Retrofit2Scalars}",
        "com.squareup.okhttp3:logging-interceptor:${Version.Libraries.Retrofit2LoggingInterceptor}",
    )

    const val Glide = "com.github.bumptech.glide:glide:${Version.Libraries.Glide}"
    const val GlideCompiler = "com.github.bumptech.glide:compiler:${Version.Libraries.GlideCompiler}"
}

object Test {
    const val JUnit = "junit:junit:${Version.Test.JUnit}"
    const val AndroidJUnit = "androidx.test.ext:junit:${Version.Test.AndroidJUnit}"
    const val EspressoCore = "androidx.test.espresso:espresso-core:${Version.Test.EspressoCore}"
}