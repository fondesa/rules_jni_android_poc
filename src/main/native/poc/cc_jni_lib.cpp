#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_poc_JavaJniLib_jniMethod(
    JNIEnv *env,
    jobject /* this */) {
    return 78;
}
