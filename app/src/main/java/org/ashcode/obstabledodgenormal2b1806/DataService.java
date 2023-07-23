package org.ashcode.obstabledodgenormal2b1806;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DataService {

    @POST("/character")
    public Call<RetrievedData> postData( @Body RequestCharacterModel request );
    @GET("/tip")
    public Call<RetrievedData> getTip();

    @GET("/word")
    public Call<RetrievedData> getWord(
            @Query("length") int length
    );

    @GET("/tips")
    public Call<RetrievedData> getTips();

    /*@GET("/scores")
    public Call<RetrievedData> getScores(
            @Query("score") int score
            );*/

}

