package poc;

public class CliApp {
    public static void main(String[] args) {
        final JavaJniLib lib = new JavaJniLib();
        System.out.println("CliApp JNI lib returns: " + lib.jniMethod());
    }
}
