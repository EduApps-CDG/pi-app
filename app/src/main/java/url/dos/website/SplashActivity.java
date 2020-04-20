package url.dos.website;
import android.app.*;
import android.os.*;
import url.dos.website.util.*;

public class SplashActivity extends Activity {

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	}

	@Override public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus = true) {
			AndroidUtils.setImmersiveMode(this,true);
		}
	}
}
