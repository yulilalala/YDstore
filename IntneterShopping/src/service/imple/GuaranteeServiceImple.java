package service.imple;

import java.util.List;

import dao.GuaranteeDao;
import domain.Guarantee;
import service.GuaranteeService;

public class GuaranteeServiceImple implements GuaranteeService {
	private int flag;
	//依赖注入GuaranteeDao
	private GuaranteeDao guaranteeDao;
	
	public void setGuaranteeDao(GuaranteeDao guaranteeDao) {
		this.guaranteeDao = guaranteeDao;
	}
	//添加
	@Override
	public boolean save(Guarantee guarantee) {
		// TODO Auto-generated method stub
		flag=this.guaranteeDao.save(guarantee);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Guarantee guarantee) {
		// TODO Auto-generated method stub
		flag=this.guaranteeDao.update(guarantee);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//删除
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		flag=this.guaranteeDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//根据ID查找
	@Override
	public Guarantee findById(Integer id) {
		// TODO Auto-generated method stub
		return this.guaranteeDao.findById(id);
	}
	//查找所有
	@Override
	public List<Guarantee> findAll() {
		// TODO Auto-generated method stub
		return	this.guaranteeDao.findAll();
	}

}
