package com.bankonet.spring;

import static org.junit.Assert.*;
import org.junit.Test;

import com.bankonet.spring.model.Client;


public class ClientTest {
	
	@Test
	public void newClient() {
		Client client1 = new Client("Bousquet", "Kelian");
		//assertEquals(Client, Client client1);
	}
}
