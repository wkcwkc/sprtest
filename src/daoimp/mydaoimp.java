package daoimp;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.MappedSuperclass;

import org.aspectj.org.eclipse.jdt.core.dom.ThisExpression;
import org.directwebremoting.annotations.Param;
import org.hibernate.SessionFactory;
import org.hibernate.id.IdentityGenerator.GetGeneratedKeysDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.contextutil.SpringContextUtil;

import idao.imydao;
import model.mymodel;

@Repository("mydaoimp")
public class mydaoimp extends HibernateDaoSupport implements imydao {

   /*
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
*/	
   
    private final String COUNT_ALL_HQL = "select count(*) from mymodel";
    
	@Override
	public void save(mymodel user) {
		// TODO Auto-generated method stub
		KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		getHibernateTemplate().save(user);
		
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		Number count = (Number) getHibernateTemplate().find(COUNT_ALL_HQL).get(0);
		return count.intValue();
	}

	@Override
	public List find(String queryString) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find(queryString);
	}
	
	public mymodel getmodel(int id)
	{
		
	
		return (mymodel) getHibernateTemplate().get("model.mymodel", id);		 
	}

	@Override
	public void update(mymodel nmodel) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(nmodel);
		
	}

	@Override
	public void delete(List<mymodel> nmodel) {
		// TODO Auto-generated method stub
		for(int i=0;i<nmodel.size();i++)
			getHibernateTemplate().delete(nmodel.get(i));
	}

	@Override
	public void update(List<mymodel> nmodel) {
		// TODO Auto-generated method stub
		for(int i=0;i<nmodel.size();i++)
			getHibernateTemplate().update(nmodel.get(i));
		
	}

	@Override
	public void delete(mymodel nmodel) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(nmodel);
	}

}
