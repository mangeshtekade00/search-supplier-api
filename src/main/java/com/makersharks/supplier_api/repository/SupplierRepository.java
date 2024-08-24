package com.makersharks.supplier_api.repository;



import com.makersharks.supplier_api.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
            String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess process, Pageable pageable);
}
