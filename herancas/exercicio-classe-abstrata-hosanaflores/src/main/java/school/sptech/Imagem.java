package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

   private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){
    figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
       Double somaTodasAreas = 0.0;
        for (int i = 0; i < figuras.size() ; i++) {
            somaTodasAreas += figuras.get(i).calcularArea();
        }
            return somaTodasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaiorQue20 = new ArrayList<>();
        Double area = 0.0;
        for (int i = 0; i < figuras.size() ; i++) {
            area = figuras.get(i).calcularArea();
            if (area > 20){
              figurasMaiorQue20.add(figuras.get(i));
            }

        }

        return figurasMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> figurasQuadradas = new ArrayList<>();
        Quadrado quadrado;
        for(Figura quadradoDaVez : figuras){
                if(quadradoDaVez instanceof Quadrado){
                    quadrado = (Quadrado) quadradoDaVez;
                    figurasQuadradas.add(quadrado);
                }
        }

        return figurasQuadradas;
    }
}
