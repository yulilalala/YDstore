package service.imple;

import java.util.List;

import dao.ClassificationDao;
import domain.Classification;
import service.ClassificationService;

public class ClassificationServiceImple implements ClassificationService {
	private int flag;
	//依赖注入ClassificationDao
	private ClassificationDao classificationDao;
	
	public void setClassificationDao(ClassificationDao classificationDao) {
		this.classificationDao = classificationDao;
	}
	//添加
	@Override
	public boolean save(Classification classification) {
		// TODO Auto-generated method stub
		flag=this.classificationDao.save(classification);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Classification classification) {
		// TODO Auto-generated method stub
		flag=this.classificationDao.update(classification);
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
		flag=this.classificationDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查询
	@Override
	public Classification findById(Integer id) {
		// TODO Auto-generated method stub
		return this.classificationDao.findById(id);
	}
	//查询所有
	@Override
	public List<Classification> findAll() {
		// TODO Auto-generated method stub
		return this.classificationDao.findAll();
	}

}
