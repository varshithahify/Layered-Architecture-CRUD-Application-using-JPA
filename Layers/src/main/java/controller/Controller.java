package controller;

import dao.AccesstransferObject;
import dto.Pancard;

public class Controller {
	public static void main(String[] args) {
		
		//create object for Pancard
		Pancard p=new Pancard();
		p.setP_id(1239);
		p.setName("sewag");
		p.setPhone(654123987465l);
		
		AccesstransferObject ao=new AccesstransferObject();
		
		//calling insert function by using reference variable of AccesstransferObject class
		
		//insert
		ao.insert(p);
		System.out.println("inserted successfully");
		//update
		ao.update(1239,"zahir",256341789);
		
		//fetch
		ao.fetch(1239);
		
		//delete
		ao.delete(1239);
		
	}

}
