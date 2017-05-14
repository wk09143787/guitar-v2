package guitar.service;

import java.util.List;

import guitar.dao.GuitarDao;
import guitar.entity.Guitar;

public class GuitarServiceImpl implements GuitarService {

		private GuitarDao guitarDao;
		
		@Override
		public void setGuitarDao(GuitarDao guitarDao) {
			this.guitarDao = guitarDao;
		}

		

		@Override
		public List<Guitar> getAll() {
			return guitarDao.getAll();
		}

		@Override
		public Guitar getBySerialNumber(String serialNumber) {
			return guitarDao.getBySerialNumber(serialNumber);
		}
		
	}

