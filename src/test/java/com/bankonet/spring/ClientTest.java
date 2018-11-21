package com.bankonet.spring;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	
	@Test
	public void newClient() {
		Client client1 = new Client("1", "Bousquet", "K�lian", null, null);
		//assertEquals(Client, Client client1);
	}
}
