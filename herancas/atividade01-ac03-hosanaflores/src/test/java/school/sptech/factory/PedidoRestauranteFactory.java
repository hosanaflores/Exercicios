package school.sptech.factory;

import school.sptech.PedidoDelivery;
import school.sptech.PedidoRestaurante;
import school.sptech.Status;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoRestauranteFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<PedidoRestaurante> clazz = PedidoRestaurante.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "cliente", "status", "itens" };
    String[] nomeCampos = { "gorjeta", "mesaEspecial" };

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

  public static Object build(String cliente, String status, List<?> itens, Double gorjeta, Boolean mesaEspecial) throws ReflectiveOperationException {
    Object obj = new PedidoRestaurante();
    campos().get("cliente").set(obj, cliente);
    campos().get("status").set(obj, Status.valueOf(status));
    campos().get("itens").set(obj, new ArrayList<>(itens));
    campos().get("gorjeta").set(obj, gorjeta);
    campos().get("mesaEspecial").set(obj, mesaEspecial);

    return obj;
  }
}
