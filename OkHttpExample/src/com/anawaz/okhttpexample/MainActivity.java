package com.anawaz.okhttpexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import com.anawaz.okhttpexample.R;
import com.squareup.otto.Subscribe;
import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv = (TextView) findViewById(R.id.hellostring);
		BusProvider.getInstance().register(this);
		
		new BackgroundWebRunner().execute("http://www.anawaz.com");
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		
		Picasso.with(this).load("http://square.github.io/picasso/static/sample.png").placeholder(R.drawable.ic_launcher).into(iv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Subscribe
	public void dataRecived(String output) {
		tv.setText(output);
	}

}
