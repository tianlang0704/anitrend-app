package com.mxt.anitrend.model.api.retro.anilist;

import com.mxt.anitrend.base.custom.annotation.GraphQuery;
import com.mxt.anitrend.model.entity.base.CharacterBase;
import com.mxt.anitrend.model.entity.base.MediaBase;
import com.mxt.anitrend.model.entity.base.StaffBase;
import com.mxt.anitrend.model.entity.container.body.ConnectionContainer;
import com.mxt.anitrend.model.entity.container.body.EdgeContainer;
import com.mxt.anitrend.model.entity.container.body.PageContainer;
import com.mxt.anitrend.model.entity.container.request.GraphQueryContainer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by max on 2018/03/20.
 * Character relation queries
 */

public interface CharacterModel {

    @POST("/")
    @GraphQuery("CharacterBase")
    @Headers("Content-Type: application/json")
    Call<CharacterBase> getCharacterBase(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("CharacterOverview")
    @Headers("Content-Type: application/json")
    Call<Character> getCharacterOverview(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("CharacterMedia")
    @Headers("Content-Type: application/json")
    Call<ConnectionContainer<PageContainer<MediaBase>>> getCharacterMedia(@Body GraphQueryContainer request);

    @POST("/")
    @GraphQuery("CharacterActors")
    @Headers("Content-Type: application/json")
    Call<ConnectionContainer<EdgeContainer<List<StaffBase>, StaffBase>>> getCharacterActors(@Body GraphQueryContainer request);
}
