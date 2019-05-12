package designpatterns.creatpatterns.factorymethod;

public class GetPlanFactory {
	
	public Plan getPlan(int planType) {
		if (planType == 1) {
			return new HousePlan();
		}
		else if (planType == 2) {
			return new CommercialPlan();
		}
		else if (planType == 3) {
			return new UniversityPlan();
		}
		else {
			return null;
		}
	}
}
