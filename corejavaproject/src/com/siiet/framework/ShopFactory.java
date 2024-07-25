package com.siiet.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isprime);
	public NormalAcc getNameNormalAccount(int accNo,String accNm,float charges,float deliverycharges);
	NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges);

}
