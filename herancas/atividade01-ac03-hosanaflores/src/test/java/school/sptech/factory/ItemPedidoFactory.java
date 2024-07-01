package school.sptech.factory;

import school.sptech.ItemPedido;
import school.sptech.Sabor;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ItemPedidoFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<ItemPedido> clazz = ItemPedido.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "sabor", "quantidade" };

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  public static Object build(String sabor, Integer quantidade) throws ReflectiveOperationException {
    Object obj = new ItemPedido();
    campos().get("sabor").set(obj, Sabor.valueOf(sabor));
    campos().get("quantidade").set(obj, quantidade);

    return obj;
  }
}
