package pages;


import io.cucumber.java.*;
import utils.Driver;


public class Hooks {

    // islem baslayinca ilk calisir, bir sefer calisir
    // tüm senaryolardan önce
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    // Her senaryo öncesi calisir
    // eger Bu before"u belirli senaryoya ait olarak calistiramak istiyorsak
    // o senaryonun annotation"inin @Before icine yazariz
    @Before
    public void before(Scenario scenario){
       // System.out.println(scenario.getName() + " started");
       // System.out.println(scenario.getId());
       // System.out.println(scenario.getLine());
       // System.out.println(scenario.getSourceTagNames());
       // System.out.println(scenario.getStatus());
       // System.out.println(scenario.getUri());
       // System.out.println(scenario.isFailed());
    }

    @Before("@Sc1")
    public void before1(Scenario scenario){
        System.out.println(scenario.getName() + " started, @Sc1");
    }

    @Before("@Sc2")
    public void before2(Scenario scenario){
        System.out.println(scenario.getName() + " started, @Sc2");
    }


    @BeforeStep
    public void beforeStep(){

    }

    @AfterStep
    public void afterStep(Scenario scenario){
        if (scenario.isFailed()){

        }

    }

    @After
    public void after(Scenario scenario){
        Driver.quitDriver();

    }

    @AfterAll
    public static void afterAll() {
        Driver.quitDriver();
        System.out.println("After All");
    }

}
