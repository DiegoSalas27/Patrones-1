import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class demo2 {
	
	private static final int _max = 3;
	private static String [] Apellidos ={"Perez","Juarez","Burga","Penaranda"};
	private static String [] Nombres ={"Luis","Maria","Jorge","Janet"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studenList= new ArrayList<>();
		Random random =new Random();
		
		for (int i=0;i<=_max;i++) {
			int max_nombres = Nombres.length;
			int indiceNombres = random.nextInt(max_nombres);
			String tempFirstName = Nombres [indiceNombres];
			int max_apellidos = Apellidos.length;
			int indiceApellidos = random.nextInt(max_apellidos);
			String tempLastName = Apellidos [indiceApellidos];
			int age = calcularEdad(random);

			crearAlumno(studenList, tempFirstName, tempLastName, age);
		}
		listarAlumnos(studenList);
	}

	private static int calcularEdad(Random random) {
		int age=18+random.nextInt(20);
		return age;
	}

	private static void crearAlumno(List<Student> studenList, String tempFirstName, String tempLastName, int age) {
		Student tempStudent = new Student (tempLastName, tempFirstName, age);
		studenList.add(tempStudent);
	}

	private static void listarAlumnos(List<Student> studenList) {
		for (Student temp : studenList) {
			System.out.println(temp);
		}
	}

}
