package com.spaneos.sp.Dao;

import java.util.List;

import com.spaneos.sp.pojo.Placement;

public interface SpDao {
	boolean addPlacement(Placement placement);
	boolean deletePlacement(int id);
	Placement getPlacement(int id);
	List<Placement> getAllPlacements();
	

}
