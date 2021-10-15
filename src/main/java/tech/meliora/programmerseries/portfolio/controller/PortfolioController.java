package tech.meliora.programmerseries.portfolio.controller;

import org.springframework.web.bind.annotation.*;
import tech.meliora.programmerseries.portfolio.domain.Portfolio;
import tech.meliora.programmerseries.portfolio.repository.PortfolioRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PortfolioController {
    private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @GetMapping("portfolio/{id}")
    public Portfolio findById(@PathVariable Long id){
        Optional<Portfolio> portfolioOptional = portfolioRepository.findById(id);

        return portfolioOptional.orElse(null);
    }
}
