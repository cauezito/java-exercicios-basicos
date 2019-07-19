package projfinaloo;
public class ProjFinalOO {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vis[] = new Visualizacao[4];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        g[0] = new Gafanhoto("Cauê",22,"F","cauezito");
        g[1] = new Gafanhoto("Amanda",20,"F","amanda25m");
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[1]);
        vis[3] = new Visualizacao(g[1], v[1]);
        
        vis[1].avaliar();
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());
        System.out.println(vis[3].toString());
        System.out.println();
        
        
    }
    
}
