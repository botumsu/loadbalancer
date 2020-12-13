import component.LoadBalancer;
import component.RandomLoadBalancer;
import component.RoundRobinLoadBalancer;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        LoadBalancer randomLoadBalancer = new RandomLoadBalancer(Arrays.asList(new String[10]));
        LoadBalancer roundRobinLoadBalancer = new RoundRobinLoadBalancer(Arrays.asList(new String[10]));
    }

}
