package com.vaporwarecorp.mirror.feature.main;

import android.content.Intent;
import com.robopupu.api.feature.FeaturePresenter;
import com.robopupu.api.plugin.PlugInterface;

@PlugInterface
public interface MainPresenter extends FeaturePresenter {
// -------------------------- OTHER METHODS --------------------------

    void onViewResult(int requestCode, int resultCode, Intent data);

    void processCommand(int resultCode, Intent data);

    void speak(String textToSpeak);

    void startListening();

    void startSpotify();

    void stopListening();
}