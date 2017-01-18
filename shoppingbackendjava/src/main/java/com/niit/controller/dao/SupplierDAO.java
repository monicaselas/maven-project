package com.niit.controller.dao;
import java.util.List;

import com.niit.entitymodel.Supplier;



public interface SupplierDAO {

	public boolean addsupplier(Supplier supplier);

	public boolean deletesupplier(String supplierId, String supplierName);

	public List<Supplier> getSupplierList();
}



