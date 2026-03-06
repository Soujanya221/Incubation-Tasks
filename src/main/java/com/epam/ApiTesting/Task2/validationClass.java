package com.epam.ApiTesting.Task2;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validationClass {

    RestFunctional restFunctional = new RestFunctional();

    @Test(priority =1)
    public void getResource() {

        Response response = restFunctional.getResources("posts");
        JsonPath jp = new JsonPath(response.asString());
        Assert.assertEquals(jp.getString("[0].id"), "1");

    }

    @Test(priority = 2)
    public void putResource() {

        Response response = restFunctional.putResources("posts", 200, "1");
        JsonPath jp = new JsonPath(response.asString());
        Assert.assertEquals(jp.getString("id"), "1");
        Assert.assertEquals(jp.getString("body"), "This is the updated content of the post");


    }

    @Test(priority = 3)
    public void deleteResource() {

        restFunctional.deleteResources("posts", 200, "1");

    }

    @Test(priority = 4)
    public void postResource() {

        Response response = restFunctional.postResources("posts", 201, "1");
        JsonPath jp = new JsonPath(response.asString());
        Assert.assertEquals(jp.getString("id"), "101");

    }


}

