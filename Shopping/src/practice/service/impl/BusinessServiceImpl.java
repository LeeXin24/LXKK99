package practice.service.impl;

import practice.pojo.Business;
import practice.service.BusinessService;
import practice.util.DataUtil;

public class BusinessServiceImpl   extends BusinessService {
    Business[] businesses = DataUtil.businesses;

    @Override
    public boolean login(String name, String password) {

        for (int i = 0; i < businesses.length; i++) {
            if(name.equals(businesses[i].getName()) && password.equals(businesses[i].getPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void register(Business business) {
        DataUtil.changeBusinessesArrayLength();
        Business[] businesses = DataUtil.businesses;
        businesses[businesses.length-1]=business;

    }

    @Override
    public void deleteBusiness(String IDCard) {

        for (int i = 0; i < businesses.length; i++) {
            if(IDCard.equals(businesses[i].getIDCard())){
                    businesses[i]=null;
                for (int j = i; j < businesses.length-1; j++) {
                        Business temp=businesses[j];
                        businesses[j]=businesses[j+1];
                        businesses[j+1]=temp;
                }
            }
        }
        DataUtil.del(businesses);
    }

    @Override
    public void updateBusiness(String IDCard) {

    }
}
