package sel.stories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import sel.BaseTest;
import sel.steps.GoogleNewsSteps;
//import pricingservice.steps.PriceAssertionSteps;
//import pricingservice.steps.PriceInRootCategorySteps;

/**
 * Created by carlosesteves on 09/09/15.
 */
public class GoogleNewsTest extends BaseTest {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new GoogleNewsSteps());
    }
}
