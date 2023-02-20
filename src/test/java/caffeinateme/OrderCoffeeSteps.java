package caffeinateme;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderCoffeeSteps {

    @Given("Cathy is {int} meters from the coffee shop")
    public void cathy_is_n_meters_from_the_coffee_shop(int distanceInMeters) throws Throwable {
       Customer cathy = new Customer();
       cathy.setDistanceFromShop(distanceInMeters);
    }
    @When("Cathy orders a large cappuccino")
    public void cathy_orders_a_large_cappuccino() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Barry should see the order")
    public void barry_should_see_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Barry should know that the coffee is urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
