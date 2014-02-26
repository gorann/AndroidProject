package hr.goran.demomodel.activities;

import java.util.ArrayList;

import hr.goran.demomodel.R;
import hr.goran.demomodel.model.UserModel;
import hr.goran.demomodel.utils.C;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
	private ArrayList<UserModel> mUsers = new ArrayList<UserModel>();
	private EditText mEditTextName, mEditTextSurname, mEditTextAddress;
	private Button mButtonSubmit, mButtonCancel, mButtonAdd;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();

		initListeners();
	}

	@Override
	public void initUi() {
		mEditTextName = (EditText) findViewById(R.id.et_main_name);
		mEditTextSurname = (EditText) findViewById(R.id.et_main_surname);
		mEditTextAddress = (EditText) findViewById(R.id.et_main_address);

		mButtonSubmit = (Button) findViewById(R.id.btn_main_submit);
		mButtonCancel = (Button) findViewById(R.id.btn_main_cancel);
		mButtonAdd = (Button) findViewById(R.id.btn_main_add);

	}

	@Override
	public void initListeners() {
		mButtonSubmit.setOnClickListener(mClick);
		mButtonCancel.setOnClickListener(mClick);
		mButtonAdd.setOnClickListener(mClick);

	}

	private OnClickListener mClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {

			case R.id.btn_main_submit:
				String name = mEditTextName.getText().toString();
				String surname = mEditTextSurname.getText().toString();
				String address = mEditTextAddress.getText().toString();
				startSecondActivity(name, surname, address);
				break;

			case R.id.btn_main_cancel:
				mEditTextName.setText("");
				mEditTextSurname.setText("");
				mEditTextAddress.setText("");
				break;

			case R.id.btn_main_add:
				String tempTextName = mEditTextName.getText().toString();
				String tempTextSurname = mEditTextSurname.getText().toString();
				String tempTextAddress = mEditTextAddress.getText().toString();
				UserModel user = createUser(tempTextName, tempTextSurname,
						tempTextAddress);

				addUserToUsersList(user);

				Toast.makeText(MainActivity.this,
						"Trenutno u listi ima:" + mUsers.size(),
						Toast.LENGTH_LONG).show();

				//startSecondActivityViaUser(mUsers);
				break;

			default:
				break;
			}

		}

		

	};
	
	private UserModel createUser(String tempTextName, String tempTextSurname,
			String tempTextAddress) {
		UserModel model = new UserModel();

		model.setEnterName(tempTextName);
		model.setEnterSurname(tempTextSurname);
		model.setEnterAddress(tempTextAddress);

		return model;

	}
	
	private void addUserToUsersList(UserModel user) {
		mUsers.add(user);

	}
	
	private void startSecondActivity(String name, String surname,
			String address) {
		Intent intent = new Intent(this, SecondActivity.class);
		UserModel model = new UserModel();
		model.setEnterName(name);
		model.setEnterSurname(surname);
		model.setEnterAddress(address);
		intent.putExtra(C.MAIN_ACTIVITY_BUNDLEY_KEY, model);
		startActivity(intent);
		
	}

//	private void startSecondActivityViaUser(ArrayList<UserModel> mUsers) {
//		Intent intent = new Intent(this, SecondActivity.class);
//		intent.putParcelableArrayListExtra(C.MAIN_ACTIVITY_BUNDLEY_KEY, mUsers);
//		startActivity(intent);

//	}

	

	

}
