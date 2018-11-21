package com.bankonet;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	
	@Test
	public void newClient() {
		Client client1 = new Client("1", "Bousquet", "Kélian", null, null);
		//assertEquals(Client, Client client1);
	}
}
