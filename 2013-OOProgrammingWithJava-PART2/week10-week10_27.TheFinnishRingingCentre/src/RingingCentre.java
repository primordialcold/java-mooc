import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> obs = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (!obs.keySet().contains(bird)) {
            places.add(place);
            obs.put(bird, places);
        } else {
            places = obs.get(bird);
            places.add(place);
            obs.put(bird, places);
        }

    }

    public void observations(Bird bird) {
        if (obs.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
        } else {
            System.out.println(bird.toString() + " observations: " + obs.get(bird).size());
//            System.out.println(obs.get(bird));
            for (Bird b : obs.keySet()) {
                if (b.equals(bird)) {
                    System.out.println(obs.get(b));
                }
            }
        }
    }
}
