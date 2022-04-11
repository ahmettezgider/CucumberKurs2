package pages;


import io.cucumber.java.*;


public class Hook {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @Before
    public void before(Scenario scenario){
        System.out.println(scenario.getName() + " started");
        System.out.println(scenario.getId());
        System.out.println(scenario.getLine());
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.getUri());
        System.out.println(scenario.isFailed());
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){
    }

    @AfterStep
    public void afterStep(Scenario scenario){

    }

    @After
    public void after(Scenario scenario){

    }


    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

}
