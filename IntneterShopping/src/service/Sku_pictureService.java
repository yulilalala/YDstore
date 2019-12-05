package service;

import java.util.List;

import domain.Sku_picture;

public interface Sku_pictureService {
	public boolean save(Sku_picture sku_picture);//添加
	public boolean update(Sku_picture sku_picture);//更新
	public boolean delete(Integer id);//删除
	public Sku_picture findById(Integer id);//通过ID查找
	public List<Sku_picture> findAll();//查找所有
}
