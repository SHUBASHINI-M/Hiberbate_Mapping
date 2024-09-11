package service;

import dao.dao;
import model.login;

public class Service {
	 private dao d;
	 private int loggedinId;


	    public Service(dao d)
	    {
	        this.d = d;
	    }


    public void signIn(int id, String pass) {
        d.signIn(id, pass);
    }

	public void signUp(login l) {
		d.signUp(l);
	}
	


	public void removeUser(int removeId, String removePass) {
		d.removeUser(removeId, removePass);
	}


	public void updatePassword(int updateId, String oldPass, String newPass) {
		d.updatePassword(updateId, oldPass, newPass);
	}


}
