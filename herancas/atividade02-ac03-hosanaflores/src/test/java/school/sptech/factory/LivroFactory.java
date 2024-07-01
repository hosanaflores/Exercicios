package school.sptech.factory;

import school.sptech.Formato;
import school.sptech.Livro;
import school.sptech.Raridade;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class LivroFactory {

  static Map<String, Field> campos() throws ReflectiveOperationException {
    Class<Livro> clazz = Livro.class;
    Class<?> superClazz = clazz.getSuperclass();

    Map<String, Field> mapCampos = new HashMap<>();
    String[] nomeCamposSuper = { "nome", "raridade" };
    String[] nomeCampos = { "editora", "autor", "qtdPaginas", "formato" };

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

  public static Object build(String nome, String raridade, String editora, String autor, Integer qtdPaginas, String formato) throws ReflectiveOperationException {
    Object obj = new Livro();
    campos().get("nome").set(obj, nome);
    campos().get("raridade").set(obj, Raridade.valueOf(raridade));
    campos().get("editora").set(obj, editora);
    campos().get("autor").set(obj, autor);
    campos().get("qtdPaginas").set(obj, qtdPaginas);
    campos().get("formato").set(obj, Formato.valueOf(formato));

    return obj;
  }
}
