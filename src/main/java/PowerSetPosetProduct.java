import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by mtumilowicz on 2018-12-20.
 */
class PowerSetPosetProduct<T> {
    final ImmutableSet<T> product;

    PowerSetPosetProduct(Set<T> first, Set<T> second) {
        this.product = ImmutableSet.copyOf(Sets.intersection(first, second));
    }
}
