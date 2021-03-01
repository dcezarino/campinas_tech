import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
public class ClienteModel {
	
	private Long id;
	private String nome;

}
