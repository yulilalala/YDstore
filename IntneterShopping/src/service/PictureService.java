package service;

import java.util.List;

import domain.Picture;

public interface PictureService {
	public boolean save(Picture picture);//添加
	public boolean update(Picture picture);//更新
	public boolean delete(Integer id);//删除
	public Picture findById(Integer id);//通过ID查找
	public List<Picture> findAll();//查找所有
}
