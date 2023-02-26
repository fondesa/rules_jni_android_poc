### Rules JNI Android issue POC

This is a very simple POC used to investigate issues
using [rules_jni](https://github.com/fmeum/rules_jni) to cross compile for Android.

Targets of this POC:

- `//src/main/native/poc:cc_jni_lib` -> cc_jni_library containing the C++ JNI bindings
- `//src/main/java/poc:java_jni_lib` -> java_jni_library depending on the target above containing
  the `native` declarations
- `//src/main/java/poc:cli_app` -> java_binary which prints to stdout the value returned
  by `java_jni_lib`
- `//src/main/java/poc:android_app` -> android_binary which _should_ print to LogCat the value
  returned by `java_jni_lib`

Run the CLI app with the following command:

```
bazel run //src/main/java/poc:cli_app
```

Run the Android app with the following command (you can select any Android config in `.bazelrc`):

```
bazel mobile-install //src/main/java/poc:android_app --config=android_x86_64 --start_app
```
