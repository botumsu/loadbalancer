package component;

import java.util.List;

public abstract class LoadBalancer {

    List<String> providers;

    public LoadBalancer(List<String> providers) {
        this.providers = providers;
    }

    abstract String get();

    public void register(String provider) {
        this.providers.add(provider);
    }

    public void unregister(String provider) {
        this.providers.remove(provider);
    }
}
