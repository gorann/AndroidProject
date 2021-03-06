package com.goran.demo1.activities;

import com.goran.demo1.R;
import com.goran.demo1.models.UserModel;
import com.goran.demo1.utils.C;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

	private TextView mTextIme;
	private TextView mTextPrezime;
	private TextView mTextAdresa;
//	private String tempIme;
//	private String tempPrezime;
//	private String tempAdresa;
	private UserModel mUserModel;

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
		mTextAdresa = (TextView) findViewById(R.id.tv_second_adresa);

	}

	private void initExtras(Bundle extras) {
		// tempIme = extras.getString(C.MAIN_BUNDLE_KEY_IME, tempIme);
		// tempPrezime = extras.getString(C.MAIN_BUNDLE_KEY_PREZIME,
		// tempPrezime);
		// tempAdresa = extras.getString(C.MAIN_BUNDLE_KEY_ADRESA, tempAdresa);

		mUserModel = extras.getParcelable(C.MAIN_BUNDLE_KEY_IME);

	}

	private void setTextView() {
		// mTextIme.setText(tempIme);
		// mTextPrezime.setText(tempPrezime);
		// mTextAdresa.setText(tempAdresa);

		mTextIme.setText(mUserModel.getTempIme());
		mTextPrezime.setText(mUserModel.getTempPrezime());
		mTextAdresa.setText(mUserModel.getTempAdresa());

	}

	@Override
	public void initListeners() {

	}

}
