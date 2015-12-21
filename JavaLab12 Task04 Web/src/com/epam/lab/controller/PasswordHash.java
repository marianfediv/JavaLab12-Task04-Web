package com.epam.lab.controller;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PasswordHash {

	private String passwordHash;

	public PasswordHash() {
		passwordHash = "";
	}

	public String getHash(String password) {

		try {
			KeySpec spec = new PBEKeySpec(password.toCharArray(), "salt".getBytes(), 65536, 128);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

			byte[] hash = keyFactory.generateSecret(spec).getEncoded();

			Base64.Encoder enc = Base64.getEncoder();

			passwordHash = enc.encodeToString(hash);

		} catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return passwordHash;
	}
}
