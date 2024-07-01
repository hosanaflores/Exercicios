package school.sptech.factory;

import school.sptech.Livraria;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Livraria> clazz = Livraria.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "produtos" };

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  public static Object build(String nome, List<?> produtos) throws ReflectiveOperationException {
    Object obj = new Livraria();
    campos().get("nome").set(obj, nome);
    campos().get("produtos").set(obj, new ArrayList<>(produtos));

    return obj;
  }
}
