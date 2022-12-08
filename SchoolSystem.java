import java.util.ArrayList;

public class SchoolSystem implements ISignUp{
	public SchoolSystem(Integer big, Integer medium, Integer small) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		IParams params = ISignUp.parse();
		SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
		ArrayList<Integer> plan = params. getPlanSignUp();
		for (int i = 0; i < plan.size(); i++) {
			sc. addStudent (plan.get(i));
		}
		sc.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addStudent(Integer stuType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStudent(int stuType) {
		// TODO Auto-generated method stub
		return false;
	}
}
