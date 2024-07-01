package school.sptech.provider.pizzaria;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import school.sptech.factory.ItemPedidoFactory;
import school.sptech.factory.PedidoDeliveryFactory;
import school.sptech.factory.PedidoRestauranteFactory;

import java.util.List;
import java.util.stream.Stream;

public class QtdPedidosDeliveryProvider implements ArgumentsProvider {
  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    Object i1 = ItemPedidoFactory.build("CALABRESA", 2);
    Object i2 = ItemPedidoFactory.build("MUSSARELA", 3);
    Object i3 = ItemPedidoFactory.build("FRANGO", 1);
    Object i4 = ItemPedidoFactory.build("CARNE", 2);
    Object i5 = ItemPedidoFactory.build("PALMITO", 1);
    Object i6 = ItemPedidoFactory.build("CHOCOLATE", 3);

    Object p1 = PedidoDeliveryFactory.build("Paulo", "PENDENTE", List.of(i1), 20.0);
    Object p2 = PedidoDeliveryFactory.build("Pedro", "EM_PREPARO", List.of(i4, i5, i6), 5.0);
    Object p3 = PedidoDeliveryFactory.build("Bianca", "EM_PREPARO", List.of(i1), 10.0);
    Object p4 = PedidoDeliveryFactory.build("Maria", "CONCLUIDO", List.of(i1, i6), 3.0);
    Object p5 = PedidoDeliveryFactory.build("João", "PENDENTE", List.of(i2, i5), 15.0);

    Object p6 = PedidoRestauranteFactory.build("Diego", "PENDENTE", List.of(i2, i5), 15.0, true);
    Object p7 = PedidoRestauranteFactory.build("Carlos", "CONCLUIDO", List.of(i2, i3, i5), 15.0, false);
    Object p8 = PedidoRestauranteFactory.build("Fernando", "CONCLUIDO", List.of(i1, i2, i3), 5.0, true);
    Object p9 = PedidoRestauranteFactory.build("Ricardo", "CONCLUIDO", List.of(i3, i4), 50.0, true);
    Object p10 = PedidoRestauranteFactory.build("Lucas", "EM_PREPARO", List.of(i1, i2, i3, i4, i5), 15.0, false);

    return Stream.of(
        Arguments.of("Pizzaria 1", "(11) 99999-9999", List.of(p1, p2, p3, p4, p5), 5),
        Arguments.of("Pizzaria 2", "(11) 99999-9999", List.of(p1, p2, p3, p6), 3),
        Arguments.of("Pizzaria 3", "(11) 99999-9999", List.of(p1, p2, p3, p6, p7, p8), 3),
        Arguments.of("Pizzaria 4", "(11) 99999-9999", List.of(p6, p7, p8, p9), 0),
        Arguments.of("Pizzaria 5", "(11) 99999-9999", List.of(), 0)
    );
  }
}
