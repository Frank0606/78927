package uv.mx;
import static spark.Spark.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args )
    {
    	get("/", (req, res) -> {
		String respuesta = "Hola mundo";
		res.type = "Application/xml";
		return respuesta;
	});

	get("/xml", (req, res) -> {
		Alumno alumno = new Alumno();
		alumno.setNombre("Sebastian");
		alumno.setId("7");

		XmlMapper xml = new XmlMapper();
		String respuesta = xml.writeValueAsString(alumno);
		res.type("application/xml");
		return respuesta;
	});
    }
}

class Alumno {
	String nombre;
	String id;
	String apellido;	

	public String getNombre() {
        	return nombre;
        }
    	public void setNombre(String nombre) {
        	this.nombre = nombre;
    	}
    	public String getApellido() {
        	return apellido;
    	}
    	public void setApellido(String apellido) {
        	this.apellido = apellido;
    	}
    	public String getId() {
        	return id;
    	}
    	public void setId(String id) {
        	this.id = id;
    	}
}
