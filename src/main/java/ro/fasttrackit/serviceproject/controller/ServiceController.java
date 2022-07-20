package ro.fasttrackit.serviceproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.serviceproject.model.ServiceApplicationInventory;
import ro.fasttrackit.serviceproject.service.ServiceApplicationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("services")
public class ServiceController {
    private ServiceApplicationService service;

    @GetMapping
    List<ServiceApplicationInventory> getAll(){
        return service.getAll();

    }
}
