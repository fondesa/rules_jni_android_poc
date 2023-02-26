load("@fmeum_rules_jni//jni:defs.bzl", "java_jni_library")
load("@build_bazel_rules_android//android:rules.bzl", "android_binary")
load("@rules_java//java:defs.bzl", "java_binary")

java_jni_library(
    name = "java_jni_lib",
    srcs = [
        "JavaJniLib.java",
    ],
    native_libs = [
        "//src/main/native/poc:cc_jni_lib",
    ],
)

java_binary(
    name = "cli_app",
    srcs = [
        "CliApp.java",
    ],
    main_class = "poc.CliApp",
    deps = [
        ":java_jni_lib",
    ],
)

android_binary(
    name = "android_app",
    manifest = "AndroidManifest.xml",
    srcs = [
        "AndroidApp.java"
    ],
    deps = [
        ":java_jni_lib"
    ],
)