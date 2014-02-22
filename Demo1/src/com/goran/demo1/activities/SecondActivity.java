package com.goran.demo1.activities;

import com.goran.demo1.R;
import com.goran.demo1.utils.C;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

	private TextView mTextIme;
	private TextView mTextPrezime;
	private String tempIme;
	private String tempPrezime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		initUi();

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			initExtras(extras);
			
		    setTextView();

		}
	}

	@Override
	public void initUi() {
		mTextIme = (TextView) findViewById(R.id.tv_second_ime);
		mTextPrezime = (TextView) findViewById(R.id.tv_second_prezime);

	}

	private void initExtras(Bundle extras) {
		tempIme = extras.getString(C.MAIN_BUNDLE_KEY_IME, tempIme);
		tempPrezime = extras.getString(C.MAIN_BUNDLE_KEY_PREZIME, tempPrezime);

	}

	private void setTextView() {
		mTextIme.setText(tempIme);
		mTextPrezime.setText(tempPrezime); 

	}

	@Override
	public void initListeners() {

	}

}
