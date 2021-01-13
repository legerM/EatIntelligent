package Eatelligent.data;

import java.util.List;

import Eatelligent.model.Provider;


public interface Dprovider {
	public List<Provider>findAll();
    public Provider findById(int id);
    public Provider save(Provider provider);
	public Provider update(int id, Provider req_provider);
	public Provider delete(int id);
}
