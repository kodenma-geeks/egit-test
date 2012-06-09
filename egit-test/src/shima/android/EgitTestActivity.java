package shima.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EgitTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout linear = (LinearLayout)findViewById(R.id.linear);
		TextView titleView = new TextView(this);
		titleView.setText("user-B‚ª‚UŒ‚X“ú‚Q‚O55•ª‚É’Ç‰ÁC³‚µAGitHub‚ÉƒvƒbƒVƒ…");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.GREEN);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
        
        linear = (LinearLayout)findViewById(R.id.linear);
 		titleView = new TextView(this);
 		titleView.setText("user-A‚ª‚UŒ‚X“ú2115•ª‚É’Ç‰ÁC³‚µAƒ[ƒJƒ‹‚ÉƒRƒ~ƒbƒg");
 		titleView.setTextSize(12);
 		titleView.setTextColor(Color.BLUE);
 		titleView.setBackgroundColor(Color.LTGRAY);
 		titleView.setHeight(50);
 		titleView.setGravity(Gravity.CENTER);
 		linear.addView(titleView);
    }
}