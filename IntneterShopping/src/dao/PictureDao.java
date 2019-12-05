package dao;

import java.util.List;

import domain.Picture;

public interface PictureDao {
	public int save(Picture picture);//添加
	public int update(Picture picture);//更新
	public int delete(Integer id);//删除
	public Picture findById(Integer id);//通过ID查找
	public List<Picture> findAll();//查找所有
}
