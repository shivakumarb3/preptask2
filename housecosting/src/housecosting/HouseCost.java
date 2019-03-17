package housecosting;

public class HouseCost {

	public int costcalculaltion(String typeofhouse,int squarefeets)
	{
		switch(typeofhouse)
		{
		case "standard":return 1200*squarefeets;
		
		case "above standard": return 1500*squarefeets;
		case "high standard":return 1800*squarefeets;
		case "high standard and fully automated" :return 2500*squarefeets;
		default: return -1;
		}
	}
}
