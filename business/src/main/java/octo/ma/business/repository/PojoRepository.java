package octo.ma.business.repository;
import octo.ma.business.model.Pojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface PojoRepository extends  JpaRepository<Pojo,Long> {

}
