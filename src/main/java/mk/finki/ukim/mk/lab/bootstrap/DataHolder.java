package mk.finki.ukim.mk.lab.bootstrap;

import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Balloon> balloons = new ArrayList<>();

    @PostConstruct
    public void init() {
        balloons.add(new Balloon("Green balloon", "Small"));
        balloons.add(new Balloon("Blue balloon", "Medium"));
        balloons.add(new Balloon("Red balloon", "Big"));
        balloons.add(new Balloon("Yellow balloon", "Extra Big"));
    }
}
