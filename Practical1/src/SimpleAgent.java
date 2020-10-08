
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleAgent extends Agent {
	int randomNum = ThreadLocalRandom.current().nextInt(60, 120);
	public void setup()
	
	{
		System.out.println(randomNum);
		//Create a new TickerBehaviour
		addBehaviour(new TickerBehaviour(this, 100) {
			//call onTick every 1000ms
			protected void onTick() {
				//Count down

				if (randomNum >0) {
					//System.out.println(w + " seconds left."+ myAgent.getName());
					System.out.println(randomNum);

					randomNum--;
				} else {

					System.out.println(myAgent.getName());
					myAgent.doDelete();





				}
			}
		});
	}
}