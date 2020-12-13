package component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLoadBalancer extends LoadBalancer {

    private AtomicInteger position = new AtomicInteger(0);

    public RoundRobinLoadBalancer(List<String> providers) {
        super(providers);
    }

    @Override
    String get() {
        synchronized (position) {
            String provider = providers.get(position.get());
            if (position.get() > providers.size() - 1) {
                position.set(0);
            }
            position.set(position.incrementAndGet());
            return provider;
        }
    }
}
