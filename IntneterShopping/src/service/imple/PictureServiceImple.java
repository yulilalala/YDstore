package service.imple;

import java.util.List;

import dao.PictureDao;
import domain.Picture;
import service.PictureService;

public class PictureServiceImple implements PictureService {
	private int flag;
	//依赖注入PictureDao
	private PictureDao pictureDao;
	
	public void setPictureDao(PictureDao pictureDao) {
		this.pictureDao = pictureDao;
	}
	//添加
	@Override
	public boolean save(Picture picture) {
		// TODO Auto-generated method stub
		flag=this.pictureDao.save(picture);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Picture picture) {
		// TODO Auto-generated method stub
		flag=this.pictureDao.update(picture);
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
		flag=this.pictureDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Picture findById(Integer id) {
		// TODO Auto-generated method stub
		return pictureDao.findById(id);
	}
	//查找所有
	@Override
	public List<Picture> findAll() {
		// TODO Auto-generated method stub
		return	this.pictureDao.findAll();
	}

}
