public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaByteAndKiloBytes(-1024);
    }

    public static void printMegaByteAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invaid value");
        } else {
            int inMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            String result = kiloBytes + "KB" + "=" + inMegaBytes + " MB" + "and " + remainingKiloBytes + " KB";
            System.out.println(result);
        }


    }
}
