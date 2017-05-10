package java.guitar.service;

import java.util.List;

import java.guitar.dao.GuitarDao;
import java.guitar.entity.Guitar;

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

