package com.tp.funding.dto;

import java.sql.Date;

public class FundingGoods {
	private int fundingCode;
	private int fundingCategory;
	private String fundingName;
	private String fundingDescription;
	private String fundingImage1;
	private String fundingImage2;
	private String fundingImage3;
	private String fundingBankName;
	private String fundingBankDepositor;
	private String fundingAccountNumber;
	private int fundingAccountBalance;
	private int fundingTargetAmount;
	private int fundingTargetRate;
	private Date fundingTargetDate;
	private int fundingSuccessOrFailure;
	private int fundingPeopleCount;
	private int fundingAdminPermig;
	private String adminId;
	private String companyId;
	
	// join해서 dto
	private int commentCount; //코멘트 갯수
	
}
