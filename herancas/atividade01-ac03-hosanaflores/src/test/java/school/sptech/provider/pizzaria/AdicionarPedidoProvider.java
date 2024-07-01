package school.sptech.provider.pizzaria;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.ItemPedidoFactory;
import school.sptech.factory.PedidoDeliveryFactory;

import java.util.List;
import java.util.stream.Stream;

public class AdicionarPedidoProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object i1 = ItemPedidoFactory.build("CALABRESA", 2);
    Object i2 = ItemPedidoFactory.build("MUSSARELA", 3);
    Object i3 = ItemPedidoFactory.build("FRANGO", 1);
    Object i4 = ItemPedidoFactory.build("CARNE", 2);
    Object i5 = ItemPedidoFactory.build("PALMITO", 1);
    Object i6 = ItemPedidoFactory.build("CHOCOLATE", 3);


    Object p1 = PedidoDeliveryFactory.build("Paulo", "PENDENTE", List.of(i1), 20.0);
    Object p2 = PedidoDeliveryFactory.build("Pedro", "PENDENTE", List.of(i4, i5, i6), 5.0);
    Object p3 = PedidoDeliveryFactory.build("Bianca", "PENDENTE", List.of(i1), 10.0);
    Object p4 = PedidoDeliveryFactory.build("Maria", "PENDENTE", List.of(i1, i6), 3.0);
    Object p5 = PedidoDeliveryFactory.build("João", "PENDENTE", List.of(i2, i5), 15.0);

    return Stream.of(
        Arguments.of("Pizzaria 1", "(11) 99999-9999", List.of(), p1, List.of(p1)),
        Arguments.of("Pizzaria 2", "(11) 99999-9999", List.of(p1), p2, List.of(p1, p2)),
        Arguments.of("Pizzaria 3", "(11) 99999-9999", List.of(p1, p2), p3, List.of(p1, p2, p3)),
        Arguments.of("Pizzaria 4", "(11) 99999-9999", List.of(p1, p2, p3), p4, List.of(p1, p2, p3, p4))
    );
  }
}
