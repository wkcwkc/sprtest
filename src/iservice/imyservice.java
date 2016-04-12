package iservice;

import java.util.List;

import model.mymodel;

public interface imyservice {
	public void save(mymodel user);

	public List<mymodel> find(String queryString);

	public void update(List<mymodel> nmodel);

	public void update(mymodel nmodel);

	public void delete(List<mymodel> nmodel);

	public void delete(mymodel nmodel);
	
	public mymodel getmodel(int id);

	public int countAll();

}