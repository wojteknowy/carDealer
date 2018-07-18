package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Worker;
import pl.sda.repository.WorkerRepository;

import java.util.List;

@Controller
@RequestMapping("/worker")
public class WorkerDataController {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerDataController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWorkers(Model model) {
        List<Worker> workers = (List<Worker>) workerRepository.findAll();
        if (workers != null) {
            model.addAttribute("workers", workers);
        }
        return "workersList";

    }

    @GetMapping("/new")
    public String addWorker(Model model) {
        model.addAttribute("addedWorker", new Worker());
        return "addWorker";

    }

    @PostMapping
    public String saveWorker(
            @ModelAttribute("addedWorker") Worker worker) {
        worker.getName();
        worker.getLastname();
        worker.getAdress();
        worker.getDateOfEmployment();

        workerRepository.save(worker);
        return "redirect:/worker";
    }

}
