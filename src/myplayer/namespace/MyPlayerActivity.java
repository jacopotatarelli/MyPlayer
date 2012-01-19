package myplayer.namespace;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyPlayerActivity extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer mp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mp = MediaPlayer.create(MyPlayerActivity.this, R.raw.dst);
        Button startbutton = (Button)findViewById(R.id.button1);
        Button pausabutton = (Button)findViewById(R.id.button2);
        startbutton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
			}
        	
        });
        pausabutton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.pause();
				
			}
        	
        });
        
        	}
        
      
        	public void OnDestroy() {
        		super.onDestroy();
        		mp.release();
        
    }
	
}