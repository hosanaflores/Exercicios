package school.sptech.factory;

import school.sptech.Filme;
import school.sptech.Genero;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class FilmeFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Filme> clazz = Filme.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "nome", "nota", "classificacaoEtaria", "genero" };
    String[] nomeCampos = { "diretor", "duracao", "duracaoCreditos" };

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

  public static Object build(String nome, Double nota, Integer classificacaoEtaria, String genero, String diretor, Integer duracao, Integer duracaoCreditos) throws ReflectiveOperationException {
    Object obj = new Filme();
    campos().get("nome").set(obj, nome);
    campos().get("nota").set(obj, nota);
    campos().get("classificacaoEtaria").set(obj, classificacaoEtaria);
    campos().get("genero").set(obj, Genero.valueOf(genero));
    campos().get("diretor").set(obj, diretor);
    campos().get("duracao").set(obj, duracao);
    campos().get("duracaoCreditos").set(obj, duracaoCreditos);

    return obj;
  }
}
