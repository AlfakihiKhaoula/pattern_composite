import fs.File;
import fs.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addChild(new File("java.txt"));
        root.addChild(new File("pom.xml"));
        Folder src = (Folder) root.addChild(new Folder("src"));
        src.addChild(new File("data.csv"));
        Folder org = (Folder) src.addChild(new Folder("org"));
        org.addChild(new File("data.bin"));
        src.addChild(new File("config.txt"));
        src.addChild(new File("config2.txt"));
        root.afficher();

    }
}
