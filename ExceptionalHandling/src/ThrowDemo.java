public class ThrowDemo {
    static void Demoproc() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside Demo");
            throw e;
        }
    }

    public static void main(String arg[]) {
        try {
            Demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

