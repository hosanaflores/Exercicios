package school.sptech.provider.pedido;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.ItemPedidoFactory;
import school.sptech.factory.PedidoDeliveryFactory;

import java.util.List;
import java.util.stream.Stream;

public class AdicionarItemProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object i1 = ItemPedidoFactory.build("CALABRESA", 2);
    Object i2 = ItemPedidoFactory.build("MUSSARELA", 3);
    Object i3 = ItemPedidoFactory.build("FRANGO", 1);
    Object i4 = ItemPedidoFactory.build("CARNE", 2);
    Object i5 = ItemPedidoFactory.build("PALMITO", 1);
    Object i6 = ItemPedidoFactory.build("CHOCOLATE", 3);

    return Stream.of(
        Arguments.of("Paulo", "PENDENTE", List.of(i1, i2, i3), "CHOCOLATE", 2, List.of(i1, i2, i3, ItemPedidoFactory.build("CHOCOLATE", 2))),
        Arguments.of("Pedro", "PENDENTE", List.of(i4, i5, i6), "CALABRESA", 1, List.of(i4, i5, i6, ItemPedidoFactory.build("CALABRESA", 1))),
        Arguments.of("Bianca", "PENDENTE", List.of(i1), "MUSSARELA", 3, List.of(i1, ItemPedidoFactory.build("MUSSARELA", 3))),
        Arguments.of("Maria", "PENDENTE", List.of(i1, i6), "CARNE", 2, List.of(i1, i6, ItemPedidoFactory.build("CARNE", 2))),
        Arguments.of("João", "PENDENTE", List.of(i2, i5), "PALMITO", 1, List.of(i2, i5, ItemPedidoFactory.build("PALMITO", 1)))
    );
  }
}
