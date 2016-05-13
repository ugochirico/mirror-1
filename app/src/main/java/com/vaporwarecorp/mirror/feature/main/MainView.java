package com.vaporwarecorp.mirror.feature.main;

import android.app.Activity;
import com.robopupu.api.feature.FeatureContainer;
import com.robopupu.api.mvp.View;
import com.robopupu.api.plugin.PlugInterface;
import com.vaporwarecorp.mirror.component.forecast.model.Forecast;

@PlugInterface
public interface MainView extends View {
// -------------------------- OTHER METHODS --------------------------

    Activity activity();

    void displayView();

    void finish();

    FeatureContainer getMainFeatureContainer();

    void hideView();

    void setForecast(Forecast forecast);
}
