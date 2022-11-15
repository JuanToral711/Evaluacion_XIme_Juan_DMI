package com.cjuantoral711.practica2_di;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Apiyotube extends YouTubeBaseActivity {

        String api_key = "AIzaSyCMh596YrPArJxTgjJRXrhquQOciSasso0";

        @Override
        protected void
        onCreate(@Nullable Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_apiyotube);

            // Get reference to the view of Video player
            YouTubePlayerView ytPlayer = (YouTubePlayerView) findViewById(R.id.player);

            ytPlayer.initialize(
                    api_key,
                    new YouTubePlayer.OnInitializedListener() {
                        @Override
                        public void onInitializationSuccess(
                                YouTubePlayer.Provider provider,
                                YouTubePlayer youTubePlayer, boolean b)
                        {
                            youTubePlayer.loadVideo("-5LSFDwB0ps");
                            youTubePlayer.play();
                        }
                        @Override
                        public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                            YouTubeInitializationResult
                                                                    youTubeInitializationResult)
                        {
                            Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                        }
                    });
        }

    }