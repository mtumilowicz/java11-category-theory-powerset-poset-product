import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by mtumilowicz on 2018-12-20.
 */
class PowerSetPosetProduct<T> {
    final ImmutableSet<T> intersection;

    PowerSetPosetProduct(Set<T> first, Set<T> second) {
        this.intersection = ImmutableSet.copyOf(Sets.intersection(first, second));
    }
}
