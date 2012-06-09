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
		titleView.setText("user-Bが６月９日２０時55分に追加修正し、GitHubにプッシュ");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.GREEN);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
		
        linear = (LinearLayout)findViewById(R.id.linear);
		titleView = new TextView(this);
		titleView.setText("user-Bが６月９日22時00、user-Aがプッシュしたものを再度マージした");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.RED);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
    }
}