package com.makersharks.supplier_api.controller;



import com.makersharks.supplier_api.model.Supplier;
import com.makersharks.supplier_api.service.SupplierService;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/supplier")
@Validated
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")

    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam @NotBlank String location,
            @RequestParam @NotNull Supplier.NatureOfBusiness natureOfBusiness,
            @RequestParam @NotNull Supplier.ManufacturingProcess process,
            @RequestParam @Min(0) int page,
            @RequestParam @Min(1) int size) {

        List<Supplier> suppliers = supplierService.findSuppliers(location, natureOfBusiness, process, page, size);
        return ResponseEntity.ok(suppliers);
    }
}
