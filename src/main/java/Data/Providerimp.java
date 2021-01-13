package data;

import java.util.ArrayList;
import java.util.List;

import model.Provider;

public class Providerimp implements Dprovider{
	
	public static List<Provider>providerlist=new ArrayList<>();

	@Override
	public List<Provider> findAll() {
		return providerlist;
	}

	@Override
	public Provider findById(int id) {
		for (Provider provider : providerlist) {  
            if(provider.getId() == id){
                return provider;
            }
        }
        return null;
	}

	@Override
	public Provider save(Provider provider) {
		providerlist.add(provider);
		return provider;
	}

	@Override
	public Provider update(int id, Provider req_provider) {
		for (Provider provider : providerlist) {  
            if(provider.getId() == id){
            	int index = providerlist.indexOf(provider);
            	providerlist.set(index, req_provider);
                return req_provider;
            }
        }
		return null;
	}

	@Override
	public Provider delete(int id) {
		Provider deleted_provider = providerlist.remove(id - 1);
		return deleted_provider;
	}

}
