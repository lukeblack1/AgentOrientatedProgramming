
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;


public class TickerAgent extends Agent
{
 //Get the current time - this will be the time that the agent was launched at
 long t0 = System.currentTimeMillis();
 Behaviour loop;
 protected void setup()
 {
 loop = new TickerBehaviour( this, 300 )
 {
 protected void onTick()
 {
 //Print elapsed time since launch
 System.out.println( System.currentTimeMillis()-t0 + ": " + 
myAgent.getLocalName());
 
 }

 };
 addBehaviour( loop );
 }
}