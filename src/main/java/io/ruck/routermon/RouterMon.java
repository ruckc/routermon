package io.ruck.routermon;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author ruckc
 */
@ApplicationPath("/routermon")
public class RouterMon extends Application {

    private final Set<Object> singletons = Collections.unmodifiableSet(
            new HashSet<>(
                    Arrays.asList(
                            new DhcpResource()
                    )
            )
    );

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
