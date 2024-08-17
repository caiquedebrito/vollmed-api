package med.voll.api.domain.paciente;

import aj.org.objectweb.asm.commons.Remapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByOrderByNome(Pageable paginacao);

    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

    @Query("select p.ativo from Paciente p where p.id = :id")
    Boolean findAtivoById(Long id);
}
