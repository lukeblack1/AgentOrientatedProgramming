
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.wrapper.AgentController;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleAgent2 extends Agent {

	int randomNum = ThreadLocalRandom.current().nextInt(0, 120);

	public void setup()

	{
		System.out.println(randomNum);
		//Create a new TickerBehaviour
		
		if (randomNum <60)
				{
			addBehaviour (new WakerBehaviour(this, 1000) 
			
			{
				//call onTick every 1000ms
				protected void onWake() 
				{
					//Count down

					System.out.println(myAgent.getName());
					System.out.println("I'm still alive! ");

				}
			});
				
				}
		
			else 
			{
				
			
				
					
				
		addBehaviour (new WakerBehaviour(this, randomNum) 
				//	addBehaviour(new TickerBehaviour(this, 100)

				{
			//call onTick every 1000ms
	protected void onWake() {
		// Count down

		System.out.println(myAgent.getName());
		myAgent.doDelete();

	}

}

);

}}

}