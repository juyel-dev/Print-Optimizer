-keepattributes *Annotation*
-dontwarn org.jetbrains.annotations.**

-keepclasseswithmembernames class * {
    native <methods>;
}
