package fs;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composante{
    private List<Composante> composantes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println(getTab() + "- Folder : " +name );
        for (Composante c : composantes){
            c.afficher();
        }
    }
    public Composante addChild(Composante c){
        this.composantes.add(c);
        c.level = this.level + 1;
        return c;
    }
}
