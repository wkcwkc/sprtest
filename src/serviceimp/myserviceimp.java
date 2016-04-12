package serviceimp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import model.mymodel;
import iservice.imyservice;
import idao.imydao;


@Service("myservice")
public class myserviceimp implements imyservice {
	
	@Resource(name="mydaoimp")
	private imydao mydaoimp;
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	@Override
	public void save(mymodel user) {
		// TODO Auto-generated method stub
		
		mydaoimp.save(user);
	
	}
	
	
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED,readOnly=true)
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return mydaoimp.countAll();
	}
	
	
	

	public imydao getImyDAO() {
		return mydaoimp;
	}

	public void setImyDAO(imydao imyDAO) {
		this.mydaoimp = imyDAO;
	}



	@Override
	public List find(String queryString) {
		// TODO Auto-generated method stub
		return mydaoimp.find(queryString);
	}



	@Override
	public void update(List<mymodel> nmodel) {
		// TODO Auto-generated method stub
		mydaoimp.update(nmodel);
		
	}



	@Override
	public void update(mymodel nmodel) {
		// TODO Auto-generated method stub
		mydaoimp.update(nmodel);
		
	}



	@Override
	public void delete(List<mymodel> nmodel) {
		// TODO Auto-generated method stub
		mydaoimp.delete(nmodel);
		
	}



	@Override
	public void delete(mymodel nmodel) {
		// TODO Auto-generated method stub
		mydaoimp.delete(nmodel);
		
	}
	
	public mymodel getmodel(int id){
		
		
		return mydaoimp.getmodel(id);	
	}
	
	

}
