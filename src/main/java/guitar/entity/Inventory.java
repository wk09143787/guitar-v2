package guitar.entity;

import java.util.LinkedList;
import java.util.List;

import guitar.dao.GuitarDao;
import guitar.dao.GuitarDaoImpl;
import guitar.service.GuitarService;
import guitar.service.GuitarServiceImpl;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * ��Ӽ���
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public void addGuitar(String serialNumber, double price,
	              GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		
		GuitarDao guitarDao = new GuitarDaoImpl();
		
		GuitarService guitarService = new GuitarServiceImpl();
		
		guitarService.setGuitarDao(guitarDao);
		
		guitars.add(guitar);
	}
	/**
	 * ��ѯ����
	 * @param serialNumber ���
	 * @return
	 */
	public Guitar getGuitar(String serialNumber) {
		 for (Guitar guitar : guitars) {
			   if (guitar.getSerialNumber().equals(serialNumber)) {
				   return guitar;
			   }
		 }
	  return null;
	}
  /**
   * ���б�������������Ϣ
   * @param searchSpec �����ļ�����Ϣ
   * @return
   */
  public List<Guitar> search(GuitarSpec searchSpec) {
	  //������������ļ�����Ϣ
	  List<Guitar> matchingGuitars = new LinkedList<Guitar>();
	  //���������б�
	  for ( Guitar guitar : guitars ) {
		  if (guitar.getSpec().matches(searchSpec))
		        matchingGuitars.add(guitar);
	  }
	  return matchingGuitars;
  }

public List<Guitar> getGuitars() {
	return guitars;
}

public void setGuitars(List<Guitar> guitars) {
	this.guitars = guitars;
}
}
