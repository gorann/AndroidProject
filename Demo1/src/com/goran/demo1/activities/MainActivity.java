package com.goran.demo1.activities;

import com.goran.demo1.R;
import com.goran.demo1.utils.C;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

	private EditText mInputTextIme;
	private EditText mInputTextPrezime;
	private Button mInputButton;
	private Button mDeleteButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();
		initListeners();
	}

	@Override
	public void initUi() {
		mInputTextIme = (EditText) findViewById(R.id.et_main_ime);
		mInputTextPrezime = (EditText) findViewById(R.id.et_main_prezime);
		mInputButton = (Button) findViewById(R.id.btn_main);
		mDeleteButton = (Button) findViewById(R.id.btn_del);

	}

	@Override
	public void initListeners() {
		mInputTextIme.setOnClickListener(mClick);
		mInputTextPrezime.setOnClickListener(mClick);
		mInputButton.setOnClickListener(mClick);
		mDeleteButton.setOnClickListener(mClick);

	}

	private OnClickListener mClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_main:
				String tempIme = mInputTextIme.getText().toString();
				String tempPrezime = mInputTextPrezime.getText().toString();
				startSecondActivity(tempIme, tempPrezime);
				break;
			case R.id.btn_del:
				mInputTextIme.setText("");
				mInputTextPrezime.setText("");
				break;

			default:
				break;
			}

		}

		private void startSecondActivity(String tempIme, String tempPrezime) {
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra(C.MAIN_BUNDLE_KEY_IME, tempIme);
			intent.putExtra(C.MAIN_BUNDLE_KEY_PREZIME, tempPrezime);
			intent.getExtras().get("string");
			startActivity(intent);
		}
	};

}
