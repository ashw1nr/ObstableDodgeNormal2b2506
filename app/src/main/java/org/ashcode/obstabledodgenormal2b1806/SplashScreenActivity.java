package org.ashcode.obstabledodgenormal2b1806;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreenActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        TextView textViewSplashScreenTipStart = findViewById(R.id.textViewSplashScreenTipStart);


        DataService service = ObstaDodgeServiceGenerator.createService(DataService.class);
        Call<RetrievedData> callAsync = service.getTip();

        callAsync.enqueue(new Callback<RetrievedData>() {
            @Override
            public void onResponse(Call<RetrievedData> call, Response<RetrievedData> response) {
                RetrievedData randomTipData = response.body();
                textViewSplashScreenTipStart.setText(randomTipData.getTip());
            }

            @Override
            public void onFailure(Call<RetrievedData> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });

        RequestCharacterModel characterRequest = new RequestCharacterModel();
        Call<RetrievedData> call = service.postData(characterRequest);

        call.enqueue(new Callback<RetrievedData>() {
            @Override
            public void onResponse(Call<RetrievedData> call, Response<RetrievedData> response) {
                if (response.isSuccessful()) {
                    RetrievedData responseData = response.body();
                    System.out.println(responseData.getCharacter().getName());
                    System.out.println(responseData.getCharacter().getDescription());
                } else {
                    ;// Handle error response
                }
            }

            @Override
            public void onFailure(Call<RetrievedData> call, Throwable t) {
                ;// Handle network failures or other errors
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: If you don't want the splash screen to appear when the user presses the back button
            }
        }, SPLASH_DELAY);
    }
}