package tech.meliora.programmerseries.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.meliora.programmerseries.portfolio.domain.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
