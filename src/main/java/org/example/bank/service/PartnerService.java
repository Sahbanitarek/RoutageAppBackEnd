package org.example.bank.service;

// Service
import org.example.bank.dto.PartnerRequestDTO;
import org.example.bank.entities.Partner;
import org.example.bank.repository.PartnerRepository;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {

    private final PartnerRepository partnerRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public Partner createPartner(PartnerRequestDTO request) {
        Partner partner = new Partner();
        partner.setAlias(request.getAlias());
        partner.setType(request.getType());
        partner.setDirection(request.getDirection());
        partner.setApplication(request.getApplication());
        partner.setProcessedFlowType(request.getProcessedFlowType());
        partner.setDescription(request.getDescription());

        return partnerRepository.save(partner);
    }
}