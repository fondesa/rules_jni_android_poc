package poc;

import com.github.fmeum.rules_jni.RulesJni;

public class JavaJniLib {
    static {
        RulesJni.loadLibrary("cc_jni_lib", JavaJniLib.class);
    }

    public native int jniMethod();
}
