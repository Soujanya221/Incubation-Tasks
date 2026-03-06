package com.epam.ApiTesting.Task2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestFunctional {

    public static List<Integer> resourceList = new ArrayList<>();

    public static String[] resources = new String[]{"posts", "albums", "comments", "photos", "todos", "users"};


    public static void addResource(String pathParam){

        JsonPath jp = new JsonPath(getResources(pathParam).asString());
        resourceList.add(jp.getList("$").size());

    }



    public static Response getResources(String pathParam){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = given()
                .when()
                .get(pathParam)
                .then()
                .assertThat().statusCode(200)
                .extract().response();
        return res;

    }

    public static Response putResources(String pathParam, int statusCode, String userId){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";

        Response res = given()
                .header("Content-Type", "application/json")
                .body("{\"id\": \"1\", \"userId\": "+ userId+ ", \"title\": \"Updated Post Title\",\"body\": \"This is the updated content of the post\"}")
                .when()
                .put(pathParam+"/"+userId)
                .then().log().all()
                .assertThat().statusCode(statusCode).body("body", equalTo("This is the updated content of the post"))
                .extract().response();
        return res;

    }

    public static Response deleteResources(String pathParam, int statusCode, String userId){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = null;
        res = given()
                .when()
                .delete(pathParam+"/"+userId)
                .then().log().body()
                .assertThat().log().all().statusCode(statusCode)
                .extract().response();
        return res;

    }

    public static Response postResources(String pathParam, int statusCode, String userId){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response res = null;
        res = given()
                .when()
                .contentType("application/json")
                .body("{\n" +
                        "  \"userId\": \"" + userId + "\",\n" +
                        "  \"title\": \"New Post Title\",\n" +
                        "  \"body\": \"This is the content of my new post\"\n" +
                        "}")
                .post(pathParam)
                .then().log().body()
                .assertThat().statusCode(statusCode).body("body", equalTo("This is the content of my new post"))
                .extract().response();
        return res;

    }

}
