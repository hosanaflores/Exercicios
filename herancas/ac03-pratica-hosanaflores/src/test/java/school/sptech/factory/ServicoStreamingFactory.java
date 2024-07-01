package school.sptech.factory;

import school.sptech.ServicoStreaming;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicoStreamingFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<ServicoStreaming> clazz = ServicoStreaming.class;

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCampos = { "nome", "midias" };

    for (String campoNome : nomeCampos) {
      Field campo = clazz.getDeclaredField(campoNome);
      campo.trySetAccessible();

      mapCampos.put(campoNome, campo);
    }

    return mapCampos;
  }

  public static Object build(String nome, List<?> midias) throws ReflectiveOperationException {
    Object obj = new ServicoStreaming();
    campos().get("nome").set(obj, nome);
    campos().get("midias").set(obj, new ArrayList<>(midias));

    return obj;
  }
}
