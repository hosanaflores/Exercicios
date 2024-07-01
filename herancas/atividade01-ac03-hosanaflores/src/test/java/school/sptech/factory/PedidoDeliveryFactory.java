package school.sptech.factory;

import school.sptech.PedidoDelivery;
import school.sptech.Status;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoDeliveryFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<PedidoDelivery> clazz = PedidoDelivery.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "cliente", "status", "itens" };
    String[] nomeCampos = { "distanciaKm" };

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

  public static Object build(String cliente, String status, List<?> itens, Double distancia) throws ReflectiveOperationException {
    Object obj = new PedidoDelivery();
    campos().get("cliente").set(obj, cliente);
    campos().get("status").set(obj, Status.valueOf(status));
    campos().get("itens").set(obj, new ArrayList<>(itens));
    campos().get("distanciaKm").set(obj, distancia);

    return obj;
  }
}
