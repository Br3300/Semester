/**
 * @(#)Semester.java
 *
 *UPLOAD TO FILE J
 * @Brysen
 * @version 1.00 2018/12/19
 */

import java.util.Scanner;
public class Semester
{

    public static void main(String []args)
    {
    	int choice1, annoy=0, choice2, choice3, choice4, choice5, sheild=0, neck=0, winLose=0; 														//Ints for the first part of game
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
   				//FINISH AREA ABOVE AND CONTINuE make sure to add a magic necklace neck=1**
   		}

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
					
					while (choice3==1)
					{
						System.out.println("After deciding not to risk the cold or the threat of wildlife,  you gather your flint, steel, and nearby wood to");
						System.out.println("make a fire. Exhausted from the events of the day, you quickly fall asleep.");
						System.out.println("You wake to the feeling something is off. Not yet rising, you strain your ears against the quiet crackle of the ");
						System.out.println("dying fire next to you. You pick up the sound of hushed voices and clumsy feet over leaves. Still feigning sleep,");
						System.out.println("Do you:\n\nAttempt to grab your crossbow(Hit 1)\nAttempt to grab your sword (Hit 2)");
						choice3=scan.nextInt();

						while (choice4==1){
							System.out.println("After rolling quickly rolling over, you grab your crossbow and point it towards the voices. You see two figures stop");
							System.out.println("at the edge of your camp. Identifying them as guards, they stop their advance and raise their hands in surrender. However,");
							System.out.println("after realizing your crossbow wasn't loaded, they advance. You turn to run, but are shot with a bow before escaping.");
							System.out.println("as they drag your dying body, you hear them mutter something about the queen being pleased with your capture.");
							System.out.pritnln("After loosing counciousness, you never again awake. Good game! better luck next time."); 
							System.exit(0);
						}
						while (choice4==2){
							System.out.println("You roll over and grab your sword. As you rise you see two guards start charging towards you. In Panic, you swing your");
							System.out.println("sword with all your strength. The first guard raises his sheild, blocking the blow. The force behind the blow and his ");
							System.out.println("momentum from running knock him over, falling into the fire. He lets out a scream as the leather of his armor catches ");
							System.out.println("fire. The second guard takes an overhead swing at you. You leap back, tripping over a stump. As you land on your back ");
							System.out.println("the guard advances to deliver a killing blow. You swing your sword from the ground, connecting with his ankle. As he falls");
							System.out.println("to the ground, you scramble to your feet and grab your gear. Stoping breifly to take the fallen sheild, you mount your horse");
							System.out.println("and continue riding.\n\nPulling out the compass, you continue to ride as the sun rises over the trees.");	
							sheild++;
							choice5=1;					
								}
						
					}
					while (choice3==2){
						System.out.println("After much thought you decide to avoid drawing attention and don't make a fire. You finish setting up your bed for the night");
						System.out.println("and drift off.\n\nFrom the depths of your slumber you hear a quite rumble. Stiring into consciousness you see glowing eyes staring at you");
						System.out.println("from the trees. \nDo your run? (hit 1) \nor do you grab your sword? (hit 2)");
						choice4=scan.nextInt();
					}
						while (choice4==1){
							System.out.println("As you turn to mount your horse you're instantly brought to the ground by a wolf.");
							if (neck==1) {
								System.out.println("Your necklace burns hot against your chest and the wolf is thrown off of you. You quickly grab the sword on the ground and turn");
								System.out.println("to face the trees. You see a pack of wolves charging you. You fend off the majority, the necklace growing warm and throwing back");
								System.out.println("That get past your edge. After the battle ends, you stop to catch your breath. Looking down, you see the necklace has burned itself");
								System.out.println("away, leaving nothing but a fresh burn mark on your collar. Weary, you mount your horse again, fearful of another attempt at sleep.");
								neck--;
								choice5=1;
							}
							else{
								System.out.println("Turning, you wrestle the bear off of you. Quickly grabbing your sword, you face the wolves.");
								winLose	= (int)(Math.random()*2)+1;
								if (winLose==1){
									System.out.println("Valiently fighting, the wolves overwhelm you. fight until too hurt to go on. \nEventually you fall over an your quest ends.");
									System.out.prinntln("Better luck next time!");
									System.exit(0);
								}
								else if (winLose==2){
									System.out.println("Wolf after wolf charges you. Each time your blade barely saves you. After defending yourself from half a dozen wolves, the");
									System.out.println("the remaining few look at your panting body with hesitation. Half a second later, they turn and retreat. You colapse from ");
									System.out.println("Exaustion. After regaining counciousness, you gather your gear and mount your horse to continue your journey.");
									choice5=1;
								}
							}
							
						}
						while (choice4==2){
							System.out.println("You turn to face the glowing eyes. As you bring your sword up, a pack of gremlins charge out from the trees."); //COntinue here
						}
					}
				while (choice2==2){
					System.out.println("As you continue to ride your horse through the night, you see a cozy tavern nestled among the trees. Nearing exaustion, you ");
						System.out.println("throw caution to the wind. Tying your horse, you enter the tavern. \nintstantly greeted with plesant smells and warmth, you ");
						System.out.println("see an old man behind the bar, polishing a glass. \n\"It's been a while since I've seen a customer\" his voice is a deep rumble that vibrates through your chest.");
						System.out.println("Your eyes struggling to stay open, he points to the first room on the right.\n\"Get some rest.\" he says \"We can talk buisness in the morning/");
						System.out.println("You stumble into the room, falling asleep almost as soon as you touch the bed.");
						System.out.println("When you finally reawake, you feel completely refreshed. After exiting the room, you see the man still behind the counter. he hands you a plate of food")
				}
   			 }
}
}
