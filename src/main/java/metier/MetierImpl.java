package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import seance1.IDao;

@Component("metier")
public class MetierImpl implements IMetier {


	private IDao dao;

	public MetierImpl(IDao dao) {
		this.dao = dao;
	}

	@Override
	public double calcul() {
		double temp = dao.getData();
		double res = temp*3.14;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
}
