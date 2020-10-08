
import examples.behaviours.ComplexBehaviourAgent;
import examples.behaviours.FSMAgent;
import examples.behaviours.TimeAgent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Runtime;
public class Application {
public static void main(String[] args){
 //Setup the JADE environment
 Profile myProfile = new ProfileImpl();
 Runtime myRuntime = Runtime.instance();
 ContainerController myContainer = myRuntime.createMainContainer(myProfile);
 try{
 //Start the agent controller, which is itself an agent (rma)
 AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma",
null);
 rma.start();
 //Now start our own SimpleAgent, called Fred.
 

 
 AgentController myAgent = myContainer.createNewAgent("Luke",
TimerAgent.class.getCanonicalName(), null);  
 
AgentController myAgent2 = myContainer.createNewAgent("Jenny", ComplexBehaviourAgent.class.getCanonicalName(), null);

//* AgentController myAgent3 = myContainer.createNewAgent("Benson", TimerAgent.class.getCanonicalName(), null);

// AgentController myAgent4 = myContainer.createNewAgent("Anna", TimerAgent.class.getCanonicalName(), null);

// AgentController myAgent5 = myContainer.createNewAgent("Amelia", TimerAgent.class.getCanonicalName(), null);

// AgentController myAgent6 = myContainer.createNewAgent("Sarena", TimerAgent.class.getCanonicalName(), null);

//  AgentController myAgent7 = myContainer.createNewAgent("Paul", TimerAgent.class.getCanonicalName(), null);

//AgentController myAgent8 = myContainer.createNewAgent("Derek", TimerAgent.class.getCanonicalName(), null);

//AgentController myAgent9 = myContainer.createNewAgent("Dominic", TimerAgent.class.getCanonicalName(), null);

// AgentController myAgent10 = myContainer.createNewAgent("John", TimerAgent.class.getCanonicalName(), null);




 
 
 myAgent2.start();
 // myAgent3.start();
 // myAgent4.start();
 // myAgent5.start();
 // myAgent6.start();
 // myAgent7.start();
 // myAgent8.start();
 // myAgent9.start();
 // myAgent10.start();
 
 

 
 
 }catch(Exception e){
 System.out.println("Exception starting agent: " + e.toString());
 }
 }
}