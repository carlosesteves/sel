package sel.stories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import sel.BaseTest;
import sel.steps.BetwayLiveGamesSteps;

/**
 * Created by carlosesteves on 09/09/15.
 */
public class BetwayLiveGamesTest extends BaseTest {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new BetwayLiveGamesSteps());
    }
}
