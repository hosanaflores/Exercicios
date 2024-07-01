package school.sptech.factory;

import school.sptech.Genero;
import school.sptech.Serie;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SerieFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Serie> clazz = Serie.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "nome", "nota", "classificacaoEtaria", "genero" };
    String[] nomeCampos = { "episodios", "temporadas", "duracaoEpisodio" };

    for (String campoNome : nomeCamposSuper) {
      Field campo = superClazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  public static Object build(String nome, Double nota, Integer classificacaoEtaria, String genero, Integer episodios, Integer temporadas, Integer duracaoEpisodio) throws ReflectiveOperationException {
    Object obj = new Serie();
    campos().get("nome").set(obj, nome);
    campos().get("nota").set(obj, nota);
    campos().get("classificacaoEtaria").set(obj, classificacaoEtaria);
    campos().get("genero").set(obj, Genero.valueOf(genero));
    campos().get("episodios").set(obj, episodios);
    campos().get("temporadas").set(obj, temporadas);
    campos().get("duracaoEpisodio").set(obj, duracaoEpisodio);

    return obj;
  }
}
