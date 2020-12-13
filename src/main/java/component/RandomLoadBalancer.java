package component;

import java.util.List;
import java.util.Random;

public class RandomLoadBalancer extends LoadBalancer {

    public RandomLoadBalancer(List<String> providers) {
        super(providers);
    }

    @Override
    String get() {
        return providers.get(new Random().nextInt(providers.size()));
    }
}
