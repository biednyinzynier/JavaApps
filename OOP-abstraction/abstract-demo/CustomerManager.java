package com.burak.oop.abstractclass;

public class CustomerManager {
	BaseDatabaseManager databaseManager;
	
	public void getDatabase(BaseDatabaseManager manager) {
		manager.getDatabase();
	}
}
