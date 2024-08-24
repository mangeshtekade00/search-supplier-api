package com.makersharks.supplier_api.service;



import com.makersharks.supplier_api.model.Supplier;
import com.makersharks.supplier_api.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findSuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness,
                                        Supplier.ManufacturingProcess process, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Supplier> supplierPage = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
                location, natureOfBusiness, process, pageable);
        return supplierPage.getContent();
    }
}
