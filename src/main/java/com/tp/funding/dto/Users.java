package com.tp.funding.dto;

import java.sql.Date;

public class Users {
	private String userId;
	private String userPassword;
	private String userProfileImage;
	private String userName;
	private String userPhone;
	private String userAddressBasic;
	private String userAddressDetail;
	private String userBankName;
	private String userAccountNumber;
	private int userAccountBalance;
	private Date userBirthday;
	private Date userJoinDate;
	private int userAdPhone;
	private int userAdEmail;
	private int userFundingAmount;
	private int usetOutSite;
	//join해서 dto에 추가 것
	private String userGradeName; 
	private int fundingCount; //펀딩 중 상품 갯수
	private int notificationCount; // 안 읽은 알림 갯수
	private int userPickCount; // 찜 갯수

	
	
	
	public Users(String userId, String userPassword, String userProfileImage, String userName, String userPhone,
			String userAddressBasic, String userAddressDetail, String userBankName, String userAccountNumber,
			int userAccountBalance, Date userBirthday, Date userJoinDate, int userAdPhone, int userAdEmail,
			int userFundingAmount, int usetOutSite, String userGradeName, int fundingCount, int notificationCount,
			int userPickCount) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userProfileImage = userProfileImage;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddressBasic = userAddressBasic;
		this.userAddressDetail = userAddressDetail;
		this.userBankName = userBankName;
		this.userAccountNumber = userAccountNumber;
		this.userAccountBalance = userAccountBalance;
		this.userBirthday = userBirthday;
		this.userJoinDate = userJoinDate;
		this.userAdPhone = userAdPhone;
		this.userAdEmail = userAdEmail;
		this.userFundingAmount = userFundingAmount;
		this.usetOutSite = usetOutSite;
		this.userGradeName = userGradeName;
		this.fundingCount = fundingCount;
		this.notificationCount = notificationCount;
		this.userPickCount = userPickCount;
	}
	public Users() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserProfileImage() {
		return userProfileImage;
	}
	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddressBasic() {
		return userAddressBasic;
	}
	public void setUserAddressBasic(String userAddressBasic) {
		this.userAddressBasic = userAddressBasic;
	}
	public String getUserAddressDetail() {
		return userAddressDetail;
	}
	public void setUserAddressDetail(String userAddressDetail) {
		this.userAddressDetail = userAddressDetail;
	}
	public String getUserBankName() {
		return userBankName;
	}
	public void setUserBankName(String userBankName) {
		this.userBankName = userBankName;
	}
	public String getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(String userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public int getUserAccountBalance() {
		return userAccountBalance;
	}
	public void setUserAccountBalance(int userAccountBalance) {
		this.userAccountBalance = userAccountBalance;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public Date getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(Date userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	public int getUserAdPhone() {
		return userAdPhone;
	}
	public void setUserAdPhone(int userAdPhone) {
		this.userAdPhone = userAdPhone;
	}
	public int getUserAdEmail() {
		return userAdEmail;
	}
	public void setUserAdEmail(int userAdEmail) {
		this.userAdEmail = userAdEmail;
	}
	public int getUserFundingAmount() {
		return userFundingAmount;
	}
	public void setUserFundingAmount(int userFundingAmount) {
		this.userFundingAmount = userFundingAmount;
	}
	public int getUsetOutSite() {
		return usetOutSite;
	}
	public void setUsetOutSite(int usetOutSite) {
		this.usetOutSite = usetOutSite;
	}
	public String getUserGradeName() {
		return userGradeName;
	}
	public void setUserGradeName(String userGradeName) {
		this.userGradeName = userGradeName;
	}
	public int getFundingCount() {
		return fundingCount;
	}
	public void setFundingCount(int fundingCount) {
		this.fundingCount = fundingCount;
	}
	public int getNotificationCount() {
		return notificationCount;
	}
	public void setNotificationCount(int notificationCount) {
		this.notificationCount = notificationCount;
	}
	public int getUserPickCount() {
		return userPickCount;
	}
	public void setUserPickCount(int userPickCount) {
		this.userPickCount = userPickCount;
	}
	
	
	
	
	
	
	
}
