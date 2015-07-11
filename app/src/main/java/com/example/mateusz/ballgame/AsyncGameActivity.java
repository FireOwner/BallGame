package com.example.mateusz.ballgame;

import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleAsyncGameActivity;
import org.andengine.util.progress.IProgressListener;

/**
 * Created by Mateusz on 2015-07-11.
 */
public class AsyncGameActivity extends SimpleAsyncGameActivity {

    //Metoda do ³adowania texture
    @Override
    public void onCreateResourcesAsync(IProgressListener pProgressListener) throws Exception {

        //Ladowanie tekstury nr1
        pProgressListener.onProgressChanged(10);

        //Ladowanie tekstury nr2
        pProgressListener.onProgressChanged(20);

        //I tak dalej
    }

    @Override
    public Scene onCreateSceneAsync(IProgressListener pProgressListener) throws Exception {
        return null;
    }

    @Override
    public void onPopulateSceneAsync(Scene pScene, IProgressListener pProgressListener) throws Exception {

    }

    @Override
    public EngineOptions onCreateEngineOptions() {
        return null;
    }
}
