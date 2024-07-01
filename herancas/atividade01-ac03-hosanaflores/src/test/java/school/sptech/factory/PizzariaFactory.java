package school.sptech.factory;

import school.sptech.Pizzaria;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzariaFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Pizzaria> clazz = Pizzaria.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "telefone", "pedidos" };

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  public static Object build(String nome, String telefone, List<?> pedidos) throws ReflectiveOperationException {
    Object obj = new Pizzaria();
    campos().get("nome").set(obj, nome);
    campos().get("telefone").set(obj, telefone);
    campos().get("pedidos").set(obj, new ArrayList<>(pedidos));

    return obj;
  }
}
