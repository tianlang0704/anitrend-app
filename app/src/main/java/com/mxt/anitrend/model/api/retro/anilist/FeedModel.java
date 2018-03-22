package com.mxt.anitrend.model.api.retro.anilist;

import com.mxt.anitrend.base.custom.annotation.GraphQuery;
import com.mxt.anitrend.model.entity.anilist.FeedList;
import com.mxt.anitrend.model.entity.anilist.FeedReply;
import com.mxt.anitrend.model.entity.container.body.PageContainer;
import com.mxt.anitrend.model.entity.container.request.GraphQueryContainer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by max on 2018/03/20.
 * Feed model queries
 */

public interface FeedModel {

    @POST("/")
    @GraphQuery("FeedList")
    @Headers("Content-Type: application/json")
    Call<PageContainer<FeedList>> getFeedList(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("FeedListReply")
    @Headers("Content-Type: application/json")
    Call<PageContainer<FeedList>> getFeedListReply(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("FeedMessage")
    @Headers("Content-Type: application/json")
    Call<PageContainer<FeedList>> getFeedMessage(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("SaveTextActivity")
    @Headers("Content-Type: application/json")
    Call<FeedList> saveTextActivity(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("SaveMessageActivity")
    @Headers("Content-Type: application/json")
    Call<FeedList> saveMessageActivity(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("SaveActivityReply")
    @Headers("Content-Type: application/json")
    Call<FeedReply> saveActivityReply(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("DeleteActivity")
    @Headers("Content-Type: application/json")
    Call<Boolean> deleteActivity(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("DeleteActivityReply")
    @Headers("Content-Type: application/json")
    Call<Boolean> deleteActivityReply(@Body GraphQueryContainer request);
}
