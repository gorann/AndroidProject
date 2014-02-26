package hr.goran.demomodel.activities;

import hr.goran.demomodel.R;
import hr.goran.demomodel.model.UserModel;
import hr.goran.demomodel.utils.C;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {
	private TextView mTextViewName, mTextViewSurname, mTextViewAddress;
	private UserModel mUserModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		initUi();

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			initExtras(bundle);
		}

		setTitleTextView();

	}

	@Override
	public void initUi() {
		mTextViewName = (TextView) findViewById(R.id.tv_second_name);
		mTextViewSurname = (TextView) findViewById(R.id.tv_second_surname);
		mTextViewAddress = (TextView) findViewById(R.id.tv_second_address);

	}

	private void initExtras(Bundle bundle) {
		mUserModel = bundle.getParcelable(C.MAIN_ACTIVITY_BUNDLEY_KEY);

	}

	private void setTitleTextView() {
		mTextViewName.setText(mUserModel.getEnterName());
		mTextViewSurname.setText(mUserModel.getEnterSurname());
		mTextViewAddress.setText(mUserModel.getEnterAddress());

	}

	@Override
	public void initListeners() {

	}

}
