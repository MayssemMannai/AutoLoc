package tn.esprit.mayssemmannai4cce18.Web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mayssemmannai4cce18.Services.IVehiculeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
    private final IVehiculeService vehiculeService;
}
