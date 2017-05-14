package guitar.service;

import java.util.List;

import guitar.dao.GuitarDao;
import guitar.entity.Guitar;

public interface GuitarService {

	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Guitar> getAll();
	/**
	 * 根据编号查询数据
	 * @param serialNumber
	 * @return
	 */
	public Guitar getBySerialNumber(String serialNumber);
	/**
	 * 注入
	 * @param guitarDao
	 */
	void setGuitarDao(GuitarDao guitarDao);
	
}