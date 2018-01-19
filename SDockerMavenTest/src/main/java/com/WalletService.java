package com;

public interface WalletService {
	public Long getPlayerWallet(String userId);
	public Long topupPlayerBalance(String userId, Topup topup);

}
