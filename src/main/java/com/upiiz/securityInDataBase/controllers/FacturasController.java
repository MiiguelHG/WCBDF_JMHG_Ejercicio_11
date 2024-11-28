package com.upiiz.securityInDataBase.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturasController {
    @GetMapping()
    public String getFacturas() {
        return "Listado de Facturas";
    }

    @GetMapping("/{id}")
    public String getFacturaById(@PathVariable int id) {
        return "Factura por id: " + id;
    }

    @PostMapping()
    public String createFactura() {
        return "Factura creada";
    }

    @PutMapping("/{id}")
    public String updateFactura(@PathVariable int id) {
        return "Factura actualizada: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteFactura(@PathVariable int id) {
        return "Factura eliminada: " + id;
    }

}
