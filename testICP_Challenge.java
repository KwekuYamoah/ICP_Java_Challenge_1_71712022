import java.io.IOException;

public class testICP_Challenge {
    public static void main(String[] args) throws IOException {
        ICP_Challenge_1 Essentials = new ICP_Challenge_1 ();
        String primaryFIle = Essentials.filename = "essentials_stock.txt";
        String backupFile = Essentials.backupfile = "backup_essentials_stock.txt";
        Essentials.clearFile(primaryFIle);
        Essentials.clearFile (backupFile);
        Essentials.Stock ();
        Essentials.printStock ();
    }
}
