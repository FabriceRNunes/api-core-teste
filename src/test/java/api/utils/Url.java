package api.utils;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class Url {

    public static void urlCustomers(){

        RestAssured.baseURI = "https://core.dev.oiwarren.com/9803/customers";

    }

    public static void urlPortifolio(){

        RestAssured.baseURI = "https://core.dev.oiwarren.com/9801/portfolios";

    }
}
