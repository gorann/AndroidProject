package hr.goran.demomodel.model;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable {
	private String enterName, enterSurname, enterAddress;

	public UserModel() {

	}

	private UserModel(Parcel in) {
		enterName = in.readString();
		enterSurname = in.readString();
		enterAddress = in.readString();
	}

	public String getEnterName() {
		return enterName;
	}

	public void setEnterName(String enterName) {
		this.enterName = enterName;
	}

	public String getEnterSurname() {
		return enterSurname;
	}

	public void setEnterSurname(String enterSurname) {
		this.enterSurname = enterSurname;
	}

	public String getEnterAddress() {
		return enterAddress;
	}

	public void setEnterAddress(String enterAddress) {
		this.enterAddress = enterAddress;
	}

	@Override
	public int describeContents() {

		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(enterName);
		dest.writeString(enterSurname);
		dest.writeString(enterAddress);

	}

	public static final Parcelable.Creator<UserModel> CREATOR = new Creator<UserModel>() {

		@Override
		public UserModel createFromParcel(Parcel source) {

			return new UserModel(source);
		}

		@Override
		public UserModel[] newArray(int size) {

			return new UserModel[size];
		}

	};

}
