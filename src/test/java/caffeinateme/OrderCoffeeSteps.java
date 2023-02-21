package caffeinateme;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class OrderCoffeeSteps {
    Customer cathy = new Customer();
    Barrista barry = new Barrista();
    String cathysOrder;
    @Given("Cathy is {int} meters from the coffee shop")
    public void cathy_is_n_meters_from_the_coffee_shop(int distanceInMeters) throws Throwable {
       cathy.setDistanceFromShop(distanceInMeters);
    }
    @When("Cathy orders a (.*)$")
    public void cathy_orders_a(String order) throws  Throwable {
        cathysOrder = order;
        cathy.placesOrderFor(cathysOrder);
    }
    @Then("Barry should see the order")
    public void barry_should_see_the_order() {

        assertThat(barry.getPendingOrders(), hasItem(cathysOrder));
    }
    @Then("Barry should know that the coffee is urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {
       assertThat(barry.getUrgentOrders(), hasItem(cathysOrder));
    }

}
