package com.goran.demo1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable{
	private String tempIme, tempPrezime, tempAdresa;
	
	public UserModel(String tempIme, String tempPrezime, String tempAdresa){
		this.tempIme = tempIme;
		this.tempPrezime = tempPrezime;
		this.tempAdresa = tempAdresa;
	}
	
	public UserModel(){
	}
	
	public static final Parcelable.Creator<UserModel> CREATOR = new Creator<UserModel>(){
		
		@Override
		public UserModel[] newArray(int size) {
			
			return new UserModel[size];
		}

		@Override
		public UserModel createFromParcel(Parcel source) {
			
			return new UserModel(source);
		}
	};
	
	private UserModel(Parcel in){
		tempIme = in.readString();
		tempPrezime = in.readString();
		tempAdresa = in.readString();
	}
	

	public String getTempIme() {
		return tempIme;
	}

	public void setTempIme(String tempIme) {
		this.tempIme = tempIme;
	}

	public String getTempPrezime() {
		return tempPrezime;
	}

	public void setTempPrezime(String tempPrezime) {
		this.tempPrezime = tempPrezime;
	}

	public String getTempAdresa() {
		return tempAdresa;
	}

	public void setTempAdresa(String tempAdresa) {
		this.tempAdresa = tempAdresa;
	}

	@Override
	public int describeContents() {
	
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(tempIme);
		dest.writeString(tempPrezime);
		dest.writeString(tempAdresa);
		
		
	}
	

}
