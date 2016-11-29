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
		titleView.setText("user-B���U���X���Q�O��55���ɒǉ��C�����AGitHub�Ƀv�b�V��");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.GREEN);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
        
        linear = (LinearLayout)findViewById(R.id.linear);
 		titleView = new TextView(this);
 		titleView.setText("user-A���U���X��21��15���ɒǉ��C�����A���[�J���ɃR�~�b�g");
 		titleView.setTextSize(12);
 		titleView.setTextColor(Color.BLUE);
 		titleView.setBackgroundColor(Color.LTGRAY);
 		titleView.setHeight(50);
 		titleView.setGravity(Gravity.CENTER);
 		linear.addView(titleView);
 		
        linear = (LinearLayout)findViewById(R.id.linear);
		titleView = new TextView(this);
		titleView.setText("user-B���U���X��22��00�Auser-A���v�b�V���������̂��ēx�}�[�W����");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.RED);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
		
        linear = (LinearLayout)findViewById(R.id.linear);
		titleView = new TextView(this);
		titleView.setText("hrs-nkym��7/4 23:05�Auser-B��master��fork����branch�������̂�commit\n���̌�pull request�𓊂���");
		titleView.setTextSize(14);
		titleView.setTextColor(Color.GREEN);
		titleView.setBackgroundColor(Color.BLACK);
		titleView.setHeight(100);
		titleView.setGravity(Gravity.RIGHT);
		linear.addView(titleView);
    }
}
