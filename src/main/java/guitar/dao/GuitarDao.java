package java.guitar.dao;

import java.guitar.entity.Guitar;
import java.util.List;


public interface GuitarDao {

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
}
