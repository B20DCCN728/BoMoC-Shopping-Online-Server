package com.example.bomoc.model.user.asset;

import com.example.bomoc.model.user.asset.Asset;
import jakarta.persistence.Column;

public class CardAsset extends Asset {

	@Column(name = "owner")
	private String owner;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "cardID")
	private String cardID;

}