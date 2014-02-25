package hr.goran.demomodel.activities;

import hr.goran.demomodel.R;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {
	private TextView mTextViewName, mTextViewSurname, mTextViewAddress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		initUi();

	}

	@Override
	public void initUi() {
		mTextViewName = (TextView) findViewById(R.id.tv_second_name);
		mTextViewSurname = (TextView) findViewById(R.id.tv_second_surname);
		mTextViewAddress = (TextView) findViewById(R.id.tv_second_address);

	}

	@Override
	public void initListeners() {

	}

}
