package testapp.bm_splash;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    static long TIME_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No display a title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Set View as activity_splash
        setContentView(R.layout.activity_splash);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        AlphaAnimation alpha = new AlphaAnimation(
                0.0f,   // Transparency of start point
                1.0f    // Transparency of end point
        );
        alpha.setDuration(TIME_LENGTH);
        imageView.startAnimation(alpha);

//        Handler handler = new Handler();
//        handler.postDelayed(new SplashHandler(), TIME_LENGTH);
    }
}
