import org.junit.Test;

import java.util.Set;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2018-12-20.
 */
public class TotalPosetProductIntegerTest {
    
    @Test
    public void empty_intersection() {
        var posetProduct = new TotalPosetProduct<>(Set.of(1), Set.of(2));

        assertTrue(posetProduct.product.isEmpty());
    }

    @Test
    public void notEmpty_intersection() {
        var posetProduct = new TotalPosetProduct<>(Set.of(1, 2), Set.of(2, 3));

        assertThat(posetProduct.product, hasSize(1));
        assertThat(posetProduct.product, contains(2));
    }

}