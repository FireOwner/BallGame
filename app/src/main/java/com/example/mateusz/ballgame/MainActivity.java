package com.example.mateusz.ballgame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import java.io.IOException;


public class MainActivity extends SimpleBaseGameActivity
{
    private Camera camera;
    private static final int WIDTH_CAMERA = 800;
    private static final int HEIGHT_CAMERA = 480;


    @Override
    protected void onCreateResources() throws IOException
    {

    }

    @Override
    protected Scene onCreateScene()
    {
        Scene scene = new Scene();
        scene.setBackground(new Background(1, 0, 0));

        return  scene;
    }

    @Override
    public EngineOptions onCreateEngineOptions()
    {
        camera = new Camera(0, 0, WIDTH_CAMERA, HEIGHT_CAMERA);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED, new FillResolutionPolicy(), camera);

        return engineOptions;
    }
}
