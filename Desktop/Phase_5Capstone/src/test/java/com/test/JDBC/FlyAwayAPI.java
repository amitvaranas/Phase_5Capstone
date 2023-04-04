package com.test.JDBC;

import io.restassured.RestAssured;
import io.restassured.config.RedirectConfig;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FlyAwayAPI {
	
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String url = "http://localhost:8080/FlyAway";
        RestAssured.baseURI =url;
        String UN = "amit@cisco.com";
        String PWD = "Mjgda@123";
        RequestSpecification given = RestAssured.given()
                .config(RestAssured.config().redirect(RedirectConfig.redirectConfig().followRedirects(false)));
//        Response response = given.request(Method.GET,"/login");
        Response response = given.request(Method.POST,"/loginaction?email_id="+UN+"&pwd="+PWD);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        
        
        Response response2 = given.request(Method.GET,"/dashboard");
        
        System.out.println(response2.getBody().asString());
        System.out.println(response2.getStatusCode());
        
        

    }

}



