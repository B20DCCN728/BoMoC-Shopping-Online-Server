package com.example.bomoc.model.user.asset;

import com.example.bomoc.model.user.asset.Asset;
import jakarta.persistence.Column;

public class CryptoAsset extends Asset {

	@Column(name = "address")
	private String address;

}