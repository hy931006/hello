package hello; /**
 * Created by heyang on 16/3/26.
 */

@JugglerAnnotation
public class Juggler implements Performer {
    private int bags = 3;

    public Juggler() {
    }

    public Juggler(int bags){
        this.bags=bags;
    }

    @Override
    public void perform() throws PerformenceException {
        System.out.println("JUGGLING "+bags+" beanbags.");
    }
}
