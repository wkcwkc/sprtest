package idao;

import java.util.List;

import model.mymodel;

public interface imydao {
	public void save(mymodel user);

	public int countAll();
	
	public List find(String queryString);
	
	public void update(List<mymodel> nmodel);
	public void update(mymodel nmodel);
	
	public void delete(List<mymodel> nmodel);
	public void delete(mymodel nmodel);
	
	public mymodel getmodel(int id);

}
