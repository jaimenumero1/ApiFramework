package com.devxschool.apiframework.cucumber.steps.blog;

import com.devxschool.apiframework.api.pojos.BlogPost;
import com.devxschool.apiframework.api.pojos.BlogUser;
import com.devxschool.apiframework.cucumber.steps.api.common.CommonData;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;

public class BlogSteps {
private CommonData commonData;

public BlogSteps(CommonData commonData){
    this.commonData = commonData;
}

    @Before
    public void setUp(){
        RestAssured.baseURI = "https://5f629b9c67e195001625f0a4.mockapi.io/api/v1";
    }

    @When("^the following user has been created$")
    public void the_following_user_has_been_created(List<BlogUser> post) throws Throwable {
        RequestSpecification requestSpec = RestAssured.given();
        requestSpec.contentType(ContentType.JSON);
        requestSpec.body(post.get(0));

     //   commonData.response = requestSpec.
    }

    @When("^the following post has been created for the user$")
    public void the_following_post_has_been_created_for_the_user(List<BlogPost> post) throws Throwable {

    }

    @When("^the following comment has been left under a post$")
    public void the_following_comment_has_been_left_under_a_post(List<Map<String,String>> comment) throws Throwable {
//  BlogPost post = ObjectConverter.
//    RequestSpecification requestSpec = RestAssured.given();
//    requestSpec.contentType(ContentType.JSON);
//    requestSpec.body(comment.get(0));
//
//    commonData.response = requestSpec
//            .pathParam("userId",post.getUserId())
    }

    @When("^the post details has been requested$")
    public void the_post_details_has_been_requested() {

    }

    @Then("^the following post has been returned$")
    public void the_following_post_has_been_returned(DataTable arg1) {

    }



}
