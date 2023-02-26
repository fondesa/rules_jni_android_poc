workspace(name = "rules_jni_android_poc")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_android_ndk_commit = "81ec8b79dc50ee97e336a25724fdbb28e33b8d41"
http_archive(
    name = "rules_android_ndk",
    url = "https://github.com/bazelbuild/rules_android_ndk/archive/%s.zip" % rules_android_ndk_commit,
    sha256 = "b29409496439cdcdb50a8e161c4953ca78a548e16d3ee729a1b5cd719ffdacbf",
    strip_prefix = "rules_android_ndk-%s" % rules_android_ndk_commit,
)

rules_jni_version = "0.7.0"
http_archive(
    name = "fmeum_rules_jni",
    sha256 = "530a02c4d86f7bcfabd61e7de830f8c78fcb2ea70943eab8f2bfdad96620f1f5",
    strip_prefix = "rules_jni-%s" % rules_jni_version,
    url = "https://github.com/fmeum/rules_jni/archive/refs/tags/v%s.tar.gz" % rules_jni_version,
)

http_archive(
    name = "build_bazel_rules_android",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
)

load("@build_bazel_rules_android//android:rules.bzl", "android_sdk_repository")
android_sdk_repository(
    name = "androidsdk",
    api_level = 33,
    build_tools_version = "33.0.0",
)

load("@rules_android_ndk//:rules.bzl", "android_ndk_repository")

android_ndk_repository(
    name = "androidndk",
    api_level = 33,
)

load("@fmeum_rules_jni//jni:repositories.bzl", "rules_jni_dependencies")

rules_jni_dependencies()

http_archive(
    name = "rules_java",
    urls = [
        "https://github.com/bazelbuild/rules_java/releases/download/5.4.1/rules_java-5.4.1.tar.gz",
    ],
    sha256 = "a1f82b730b9c6395d3653032bd7e3a660f9d5ddb1099f427c1e1fe768f92e395",
)

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")
rules_java_dependencies()
rules_java_toolchains()