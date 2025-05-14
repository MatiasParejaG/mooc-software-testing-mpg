package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    void shouldApply90PercentDiscountForHomeProducts() {
        // Configurar mock
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product homeProduct = new Product("Sofa", 100.0, "HOME");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(homeProduct));
        // Ejecutar
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        // Verificar
        assertEquals(90.0, homeProduct.getPrice(), 0.001); // 100 * 0.9
    }

    @Test
    void shouldApply110PercentForBusinessProducts() {
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product businessProduct = new Product("Printer", 100.0, "BUSINESS");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(businessProduct));
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        assertEquals(110.0, businessProduct.getPrice(), 0.001); // 100 * 1.1
    }

    @Test
    void shouldNotChangePriceForOtherCategories() {
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product otherProduct = new Product("Book", 100.0, "OTHER");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(otherProduct));
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        assertEquals(100.0, otherProduct.getPrice(), 0.001); // Sin cambios
    }
}
