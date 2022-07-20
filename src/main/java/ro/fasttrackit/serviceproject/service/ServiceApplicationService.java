package ro.fasttrackit.serviceproject.service;

import ro.fasttrackit.serviceproject.model.ServiceApplicationInventory;
import ro.fasttrackit.serviceproject.repository.ServiceApplicationRepository;

import java.util.List;

public class ServiceApplicationService {
    private ServiceApplicationRepository repository;

    public List<ServiceApplicationInventory> getAll() {
        return repository.findAll();
    }
}
