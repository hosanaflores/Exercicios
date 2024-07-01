package school.sptech.factory;

import school.sptech.JogoTabuleiro;
import school.sptech.Raridade;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JogoTabuleiroFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<JogoTabuleiro> clazz = JogoTabuleiro.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "nome", "raridade" };
    String[] nomeCampos = { "qtdPecas" };

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

  public static Object build(String nome, String raridade, Integer qtdPecas) throws ReflectiveOperationException {
    Object obj = new JogoTabuleiro();
    campos().get("nome").set(obj, nome);
    campos().get("raridade").set(obj, Raridade.valueOf(raridade));
    campos().get("qtdPecas").set(obj, qtdPecas);

    return obj;
  }
}
