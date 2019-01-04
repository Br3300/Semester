/**
 * @(#)Semester.java
 *
 *
 * @Brysen
 * @version 1.00 2018/12/19
 */

import java.util.Scanner;
public class Semester
{

    public static void main(String []args)
    {
    	int choice1, annoy=0, choice2, choice3, choice4; 														//Ints for the first part of game
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your characters name: (Male name reccomended)");
    	String name = scan.nextLine();


   		System.out.println("Welcome to the story "+name+"! Now, for the prolog:\n\n\n");
   		System.out.println("It’s a story you’ve heard a thousand times. \"The princess is trapped in the castle, guarded by a ");		//Prolog
   		System.out.println("dragon, asleep in a magic spell.\" A child of poverty, you listen to your grandmother tell you the ");
   		System.out.println("story again. You dream of going to the castle, slaying the beast and taking home the woman of ");
   		System.out.println("your dreams. With a sigh, you finish your bowl of bland porridge and start to rise. \n\n");
   		System.out.println("\"Hasn’t anyone told you to listen when your elders are speaking?\" your grandmother's voice ");
   		System.out.println("brings you back to reality. \"Sorry grandmother\" you apologize, \"I was distracted.\" \"Distracted?\" her voice rising ");
   		System.out.println("\"You’re always distracted lately. You’re a man now, it’s time to start acting like one...\" she starts ");
   		System.out.println("into another one of her lectures and you are compelled to leave, but stay out of respect. \"Has it ");
   		System.out.println("occured to you that your grandmother has a reason for her stories?\"");
   		System.out.println("she lets out a tired sigh, and grabs a package off of the table. \"Take this to the blacksmith, ");
   		System.out.println("Horace. I need him to do something for me.\" Grateful for any excuse to leave, you take the ");
   		System.out.println("package and escape. met with fresh spring air you wander through your humble village. Your attention is drawn to a rare ");
   		System.out.println("sight; the king's soldiers have arrived. 20 years ago the princess of the kingdom disappeared. Now, as the ");
   		System.out.println("king approaches his deathbed, panic has started to seize the kingdom as no new heirs have ");
   		System.out.println("arrison. While the search for the princess had never ended, it reached the state of frantic. ");
   		System.out.println("People are attacked, their houses searched and accusations thrown. You’ve made it your goal ");
   		System.out.println("to avoid the guards and topic at all cost. As you near the blacksmith, you overhear the hushed ");
   		System.out.println("conversations of the people in the city square. \"The kidnapper... here\"\n\"In our own... all along\" ");
   		System.out.println("\"They’ve already been...\" \n\"... take revenge on all of...\"\nDoing your best to ignore them, ");
   		System.out.println("you enter the blacksmiths. Immediately wrapped in a bear hug, Horace lets out his usual ");
   		System.out.println("greeting. \"...so big you’ve gotten! Now all you need is a hammer and anvil and you’ll be a real ");
   		System.out.println("man in no time!\" you greet him with a smile. Since you’ve been alone in your grandmother's ");
   		System.out.println("care since youth, this man has been your closest imitation of a father figure. \"Grandmother ");
   		System.out.println("asked me to deliver this to you.\" You hand him the bundle. With a grunt he opens it, inside is ");
   		System.out.println("another box and an envelope. He tears open the letter and reads quitely. Letting out a grunt, he ");
   		System.out.println("walks to the back of the crowded store he returns with a short sword, a shield, and a crossbow. ");
   		System.out.println("A thick sorrow has wormed its way into his expression as he places them into your confused ");
   		System.out.println("arms. The pile is easily worth more than you could make in several years. You open your mouth ");
   		System.out.println("but he raises a finger to stop you. \"I don’t know either. You’re grandmother asked for no ");
   		System.out.println("questions.\" \"But. . .\" You start. \"This is the most important part\" he continues, ignoring your confused ");
   		System.out.println("questions. He places the package on top of the pile. \"Now leave.\" his voice drips with emotion, a ");
   		System.out.println("completely different than the one you’ve known. \"I still don’t. . .\" \n\""+name+", I'm sorry, but you need to leave.\"\nHis voice cracks. ");
   		System.out.println("Confused, you run out of the forge. Immediately, you’re hit with the strong smell of smoke.");
   		System.out.println("Looking up, you see the city engulfed in quickly spreading flames.");
   		System.out.println("Already forgetting his recent threats, you throw open the door and yell a ");
   		System.out.println("warning to Horace. Without waiting for a response, you run back towards your grandmother's ");
   		System.out.println("home. As you run down the streets you see bodies dismembered in the sides of the road. As ");
   		System.out.println("you approach your destination, you see your home already fully ablaze. \"Hey! You!\" A guards ");
   		System.out.println("voice calls from behind you. You turn to see him pull his blade from a falling body. \"Get back ");
   		System.out.println("here!\" his voice yells. You turn and run, grabbing one of the guards nearby horses, quickly ");
   		System.out.println("mounting it. A bolt flies by your head, lodging itself in a flaming home. You turn the horse and ");
   		System.out.println("ride full gallop through the burning city. As you leave the carnage, you turn with a vain hope of ");
   		System.out.println("seeing others. You appear to be the only one to make it out. Wasting no time, you turn and ");
   		System.out.println("gallop away.\n");
   		System.out.println("You ride hard, eventually reaching a nearby hunting cabin that Horace often lets you use.");
   		System.out.println("Surrounded by trees and confusion, you decide to start searching for answers. You tear open the letter");
   		System.out.println("and see your grandmother's neat handwriting.");
   		System.out.println("\"I’m sorry to do this to you "+name+", it hasn’t been what I planned at all. You must go and ");
   		System.out.println("retrieve an important item for me. Keep the book I’ve given you safe, follow the compass I’ve left ");
   		System.out.println("you. It knows the way, even if you don’t. Don't worry about me, I'll leave the city as soon as you leave for");
   		System.out.println("the forge. I'll meet with you as soon as I hear you've retreived what I've asked of you.\"");

   		//------------------------------------------------------------------------------------------------------------------------------------
   		//Plot setup done
   		//------------------------------------------------------------------------------------------------------------------------------------

   		System.out.println("\n\nWhat would you like to do?\n\nGo back to the city and search for your grandmother? (Hit 1)\nFollow the compass(Hit 2)");
   		choice1= scan.nextInt();
   						//error catch
   		if (choice1 != 1 && choice1 !=2) {
   			while (choice1 != 1 && choice1 !=2){
   				System.out.println("Please pick 1 or 2.");
   				choice1=scan.nextInt();
   					if (choice1 != 1 && choice1 !=2) {
   						System.out.println("I'm really starting to not like you");
   						annoy++;
   					}
   			}
   		}
						//end error catch



   		while (choice1==1)
   		{
			System.out.println("You're met with a swirl of emotions. Confusion, fear, uncertanty. You decide the best way to find the truth is to find your grandmother.");
			System.out.println("Without much else to go on, you galop back to the town you recently escaped. As you approach the giant smoking husk, your senses are assaulted");
			System.out.println("with the smell of burnt flesh. Trying not to gag, you enter the silent shell. making your way through the blackened streets, you see traces of the");
			System.out.println("the soldiers that were here before you. The footprints in the ash all seem to be leading towards the west side of the town.");
			System.out.println("\nWould you like to:\n\nFollow the footprints (Hit 1)\nContinue to your Grandmothers house (Hit 2)");
			choice2=scan.nextInt();
					//error catch
			if (choice2 != 1 && choice2 !=2) {
   			while (choice2 != 1 && choice2 !=2){
   				System.out.println("Please pick 1 or 2.");
   				choice2=scan.nextInt();
   					if (choice2 != 1 && choice2 !=2) {
   						System.out.println("I'm really starting to not like you");
   						annoy++;
   					}
   			}
   		}
   					//end error catch
				while (choice2==1)
				{
					System.out.println("You creep through the town, following the footprints. As you approach the edge of the city, you see the guards have collected and are preparing to leave.");
					System.out.println("There are 12 guards that you can see.\nWhat would you like to do?\n\nAttack the guards (Hit 1)\nGo back to your grandmothers(Hit 2)");
					choice3=scan.nextInt();
							//error catch
					if (choice3 != 1 && choice3 !=2)
						{
   					while (choice3 != 1 && choice3 !=2)
   						{
   						System.out.println("Please pick 1 or 2.");
   						choice2=scan.nextInt();
   						if (choice3 != 1 && choice3 !=2) {
   								System.out.println("I'm really starting to not like you");
   								annoy++;
	   							}
	   					}
	   					}
	   					//end error catch

					while (choice3==1)
					{
						System.out.println("Wow... Just... Wow...\n\n\nYou boldly fire your crossbow into the large number of trained soldiers. They fire back. You miss. They dont.");
						System.out.println("Good game, better luck next time!");
						System.exit(0);
					}
					while (choice3==2){
						System.out.println("You retrace your footsteps.\n\n");
						choice2=2;
					}
   				}
   				while (choice2 ==2)
   				{
   					System.out.println("You walk until you find the burned remains of your grandmothers house. Not sure what to expect, you sift through the charcoal. Not finding any bones, you walk");
   					System.out.println("You walk deeper into the house. As you reach the middle of the house, you're met with a loud snap as the weakend floor gives way under you. The air is forced from");
   					System.out.println("your lungs as you connect with the hard ground. Rising to your feet, your find yourself in a perfectly perserved library, untuched by the flames. You stare in bewilderment");
   					System.out.println("at the basement you never knew existed.");
   				}
   				//
   				//FINISH AREA ABOVE AND CONTINuE


      	while (choice1==2)
      		{
      	  System.out.println("Choosing to follow the compass, you mount the horse. As you resume your journey, you head west,");
      	  System.out.println("straying farther from your hometown and the threat of the guards. You follow the  unflinching ");
      	  System.out.println("westward point of the compass until nightfall. You feel you're scepticism grow in  the magic");
     	  System.out.println("of the bronze compass, and begin to question if you’re making the right decision. As darkness ");
      	  System.out.println("falls, do you:\n\nSet up camp for the night?(Hit 1)\n\nContinue to travel in the night?(Hit 2)");
			choice2=scan.nextInt();
					//error catch
			if (choice2 != 1 && choice2 !=2) {
   			while (choice2 != 1 && choice2 !=2){
   				System.out.println("Please pick 1 or 2.");
   				choice2=scan.nextInt();
   					if (choice2 != 1 && choice2 !=2) {
   						System.out.println("I'm really starting to not like you");
   						annoy++;
   					}
   			}
      		}
				while (choice2==1){
					System.out.println("After much deliberation, you decide it’s best to set up camp for the night and try to get some rest.");
					System.out.println("After tying the horse to a nearby tree, you make a small meal for yourself and feed your horse a humble");
					System.out.println("serving of oats. \n\nAs darkness falls, will you make a fire for warmth and protection?");
					System.out.println("\nMake the fire (Hit 1) \nDon't make the fire (Hit 2)");
					choice3=scan.nextInt();
				}
				while (choice2==2){
					System.out.println("After deciding not to risk the cold or the threat of wildlife,  you gather your flint, steel, and nearby wood to");
					System.out.println("make a fire. Exhausted from the events of the day, you quickly fall asleep.");
					System.out.println("You wake to the feeling something is off. Not yet rising, you strain your ears against the quiet crackle of the ");
					System.out.println("dying fire next to you. You pick up the sound of hushed voices and clumsy feet over leaves. Still feigning sleep,");
					System.out.println("Do you:\n\nAttempt to grab your crossbow(Hit 1)\nAttempt to grab your sword (Hit 2)");
					choice3=scan.nextInt();

					while (choice3==1){
						System.out.println("After rolling quickly rolling over, you grab your crossbow and point it towards the voices. You see two figures stop");
						System.out.println("at the edge of your camp. Identifying them as guards, they stop their advance and");  //Finish this part
					}
					while (choice3==2){

					}
				}
   			 }
}
}
}
