package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Offer;
import dao.OffersDAO;

@Service("offersService")
public class OffersService {
	
	private OffersDAO offersDAO;
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao){
		this.offersDAO = offersDao;
	}
	
	public List<Offer> getCurrent(){
		return offersDAO.getOffers();
	}

}
