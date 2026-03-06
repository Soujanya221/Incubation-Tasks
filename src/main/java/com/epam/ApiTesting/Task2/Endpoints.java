package com.epam.ApiTesting.Task2;

import org.testng.annotations.Test;

public class Endpoints {

    RestFunctional restFunctional = new RestFunctional();

    public static String[] resources = new String[]{"posts", "albums", "comments", "photos", "todos", "users"};



    @Test(priority =1)
    public void addResource() {

        for (String res : resources) {
            restFunctional.addResource(res);
        }
        System.out.println(restFunctional.resourceList);
    }

}

