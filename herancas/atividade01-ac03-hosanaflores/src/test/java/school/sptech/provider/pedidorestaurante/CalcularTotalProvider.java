package school.sptech.provider.pedidorestaurante;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.ItemPedidoFactory;

import java.util.List;
import java.util.stream.Stream;

public class CalcularTotalProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object i1 = ItemPedidoFactory.build("CALABRESA", 2);
    Object i2 = ItemPedidoFactory.build("MUSSARELA", 3);
    Object i3 = ItemPedidoFactory.build("FRANGO", 1);
    Object i4 = ItemPedidoFactory.build("CARNE", 2);
    Object i5 = ItemPedidoFactory.build("PALMITO", 1);
    Object i6 = ItemPedidoFactory.build("CHOCOLATE", 3);

    return Stream.of(
        Arguments.of("Paulo", "PENDENTE", List.of(i1, i2, i3), 20.0, false, 215.0),
        Arguments.of("Pedro", "PENDENTE", List.of(i4, i5, i6), 5.0, true, 295.0),
        Arguments.of("Bianca", "PENDENTE", List.of(i1), 10.0, true, 100.0),
        Arguments.of("Maria", "PENDENTE", List.of(i1, i6), 3.0, false, 223.0),
        Arguments.of("João", "PENDENTE", List.of(i2, i5), 15.0, false, 145.0),
        Arguments.of("Lucas", "PENDENTE", List.of(i3, i4), 5.1, true, 140.1)
    );
  }
}
