package com.aes.demo;

import java.util.UUID;

public class EncryptDecryptTest {

	//private static String secretKey = "boooooooooom!!!!";
	
	//private static String secretKey2 = "boooooooooo!!!!";
	
		public static void main(String[] args) 
		{
		    //String originalString = "howtodoinjava.com";
		    
			
		/*
		 * UUID secretKeyUUID = UUID.randomUUID();
		 * 
		 * UUID saltUUID = UUID.randomUUID();
		 */
			
			String secretKey = "KEY-2eI@*Z#L";//+secretKeyUUID.toString();
			
			String salt = "SALT-lh@v0AA-";//+saltUUID.toString();
			
			System.out.println(secretKey);
			System.out.println(salt);
			
			String [] array1 = {"Swarnim","2016-04-26 20:18:53.548"};
			
			for(String originalString: array1) {
				
				  String encryptedString = AES256Demo.encrypt(originalString, secretKey,salt) ;
				  String decryptedString = AES_Decrypt_Demo.decrypt(encryptedString, secretKey,salt);
				  
				  System.out.println(originalString); 
				  System.out.println(encryptedString);
				  System.out.println(decryptedString);
			}
			
		}

}
