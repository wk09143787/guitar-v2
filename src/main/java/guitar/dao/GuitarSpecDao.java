package guitar.dao;

import guitar.entity.GuitarSpec;

public interface GuitarSpecDao {
	/**
	 * 查找数据
	 * @param guitarSpec
	 * @return
	 */
	public GuitarSpec queryGuitarSpec(GuitarSpec guitarSpec);
	/**
	 * 根据编号查找数据
	 * @param serialNumber
	 * @return
	 */
	public GuitarSpec queryGuitarSpecByserialNumber(String serialNumber);
}
