package poc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AndroidApp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final JavaJniLib lib = new JavaJniLib();
        Log.d("RulesJni", "AndroidApp JNI lib returns: " + lib.jniMethod());
    }
}
