package org.example.bank.controller;

// Controller
import org.example.bank.dto.PartnerRequestDTO;
import org.example.bank.entities.Partner;
import org.example.bank.repository.PartnerRepository;
import org.example.bank.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/partners")
public class PartnerController {

    private final PartnerService partnerService;
    @Autowired
    private PartnerRepository partnerRepository;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @PostMapping
    public ResponseEntity<Partner> addPartner(@Valid @RequestBody PartnerRequestDTO request) {
        Partner createdPartner = partnerService.createPartner(request);
        return new ResponseEntity<>(createdPartner, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartner(@PathVariable Long id) {
        partnerRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}