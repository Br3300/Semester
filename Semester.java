/**
 * @(#)Semester.java
 *
 *UPLOAD TO FILE J
 * @Brysen
 * @version 1.00 2018/12/19
 */

import java.util.Scanner;
public class SemGame
{

    public static void main(String []args)
    {
     int choice1, annoy=0, choice2, choice3, choice4=0, choice5=0, sheild=0, neck=0, winLose=0, choice4a, castle1, castle2, castle3, restart=0, yesNo=0;               //Ints for the first part of game
     Scanner scan = new Scanner(System.in);
     System.out.println("This is a game created By Brysen Reeser. Make decesions by hitting 1 or 2 throughout the story to get different endings.");
     System.out.println("Enter your characters name: (Male name reccomended)");
     String name = scan.nextLine();


     System.out.println("Welcome to the story "+name+"! Now, for the prolog:\n\n\n");
     System.out.println("It’s a story you’ve heard a thousand times. \"The princess is trapped in the castle, guarded by a ");  //Prolog
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
	while (restart==0){
	
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
     System.out.println("Would you like to restart? (hit 1 for yes, 2 for no)");
     yesNo=scan.nextInt();
     if (yesNo==1){
     	restart=0;
     	choice1=0;
     	choice2=0;
     	choice3=0;
     	choice4=0;
     	choice5=0;
     	choice4a=0;
     	sheild=0;
     	castle1=0;
     	castle2=0;
     	castle3=0;
     }
     else {
     System.exit(0);
     }
    }
    while (choice3==2){
     System.out.println("You retrace your footsteps.\n\n");
     choice2=2;
     choice3++;
    }
       }
       while (choice2 ==2)
       {
        System.out.println("You walk until you find the burned remains of your grandmothers house. Not sure what to expect, you sift through the charcoal. Not finding any bones, you go");
        System.out.println("deeper into the house. As you reach the middle of the house, you're met with a loud snap as the weakend floor gives way under you. The air is forced from");
        System.out.println("your lungs as you connect with the hard ground. Rising to your feet, your find yourself in a perfectly perserved library, untuched by the flames. You stare in bewilderment");
        System.out.println("at the basement you never knew existed. Grabbing the nearest book, you see strange symbols and writting all throughout. Finding a book writtin in half-ledgible text, you");
        System.out.println("see references to magic and spells. You drop the book as if it had burned you, your grandmother was no witch, and this was a misunderstanding. You keep looking through the ");
        System.out.println("library. You find nothing except for a necklace with a swirling colored gem in its center. Drawn to it, you decide to take it with you. You climb back through the burned rubble.");
        System.out.println("Once again in the city, you dust yourself off and decide to look for the answers the house didn't offer.\n");
        neck++;
        choice1=2;
        choice2++;
       }
       //
       //FINISH AREA ABOVE AND CONTINuE make sure to add a magic necklace neck=1**
     }

       while (choice1==2)
        {
         System.out.println("Choosing to follow the compass, you mount the horse. As you resume your journey, you head west,");
         System.out.println("staying farther from your hometown and the threat of the guards. You follow the  unflinching ");
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
     choice4=scan.nextInt();

     while (choice4==1){
      System.out.println("After rolling quickly rolling over, you grab your crossbow and point it towards the voices. You see two figures stop");
      System.out.println("at the edge of your camp. Identifying them as guards, they stop their advance and raise their hands in surrender. However,");
      System.out.println("after realizing your crossbow wasn't loaded, they advance. You turn to run, but are shot with a bow before escaping.");
      System.out.println("as they drag your dying body, you hear them mutter something about the queen being pleased with your capture.");
      System.out.println("After loosing counciousness, you never again awake. Good game! better luck next time.");
      System.out.println("Would you like to restart? (hit 1 for yes, 2 for no)");
     yesNo=scan.nextInt();
     if (yesNo==1){
     	restart=0;
     	choice1=0;
     	choice2=0;
     	choice3=0;
     	choice4=0;
     	choice5=0;
     	choice4a=0;
     	sheild=0;
     	castle1=0;
     	castle2=0;
     	castle3=0;
     }
     else {
     System.exit(0);
     }
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
      choice4--;
      choice1++;
      choice3--;
      choice2--;
       }

    }
    while (choice3==2){
     System.out.println("After much thought you decide to avoid drawing attention and don't make a fire. You finish setting up your bed for the night");
     System.out.println("and drift off.\n\nFrom the depths of your slumber you hear a quite rumble. Stiring into consciousness you see glowing eyes staring at you");
     System.out.println("from the trees. \nDo your run? (hit 1) \nor do you grab your sword? (hit 2)");
     choice4=scan.nextInt();
     choice3++;
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
       choice4--;
       choice2--;
       choice3++;
       choice1++;
      }
      else{
       System.out.println("Turning, you wrestle the wolf off of you. Quickly grabbing your sword, you face the wolves.");
       winLose = (int)(Math.random()*2)+1;
       if (winLose==1){
        System.out.println("Valiently fighting, the wolves overwhelm you. fight until too hurt to go on. \nEventually you fall over an your quest ends.");
        System.out.println("Better luck next time!");
   
       }
       else if (winLose==2){
        System.out.println("Wolf after wolf charges you. Each time your blade barely saves you. After defending yourself from half a dozen wolves, the");
        System.out.println("the remaining few look at your panting body with hesitation. Half a second later, they turn and retreat. You colapse from ");
        System.out.println("Exaustion. After regaining counciousness, you gather your gear and mount your horse to continue your journey.");
        choice5=1;
        choice4--;
        choice1++;
        choice3++;
        choice2--;
       }
      }

     }
     while (choice4==2){
      System.out.println("You turn to face the glowing eyes. As you bring your sword up, a pack of gremlins charge out from the trees. Shocked at the presence of mystical creatures, you raise"); //COntinue here
      System.out.println("your sword.");
      winLose=(int)(Math.random()*4+1);
      if (winLose==1 || winLose==2 ||winLose==3){
       System.out.println("Slashing through the charging gremlins, you find the foe to be far easier than expected. While their numbers were large, without a stronger element of suprise they were");
       System.out.println("no match for you. As you finish the last of the febel attack, you notice the compass is gone from your pocket. Turning around you see one last gremlin running away with it.");
       System.out.println("Do you chase the gremlin? (hit 1) \nor use your crossbow? (Hit 2)");
       choice4a=scan.nextInt();
       while (choice4a==1){
        System.out.println("Wasting no time, you race off after the gremlin. As you slowly gain on him, you realize that he has begun to slow down. Realizing something is wrong, you stop. As you look");
        System.out.println("around at the surrounding trees, you realize you're surrounded by hundreds more eyes. While brandishing your sword, those trees became the end of your journey.");
        System.out.println("Would you like to restart? (hit 1 for yes, 2 for no)");
     yesNo=scan.nextInt();
     if (yesNo==1){
     	restart=0;
     	choice1=0;
     	choice2=0;
     	choice3=0;
     	choice4=0;
     	choice5=0;
     	choice4a=0;
     	sheild=0;
     	castle1=0;
     	castle2=0;
     	castle3=0;
     }
     else {
     System.exit(0);
     }
       }
       while (choice4a==2){
        System.out.println("You dive for your crossbow, bringing it's sight to your eye, you let off a fast shot. With a loud \"THUD\" The gremlin collapses. You walk over and collect your lost compass.");
        System.out.println("Remounting your horse, you set out once more following the compass.");
        choice5=1;
        choice4a++;
        choice1++;
        choice3++;
        choice2--;
       }
      }
      else if (winLose==4){
       System.out.println("As one gremlin turns to 10, and 10 to 100, you realize you're doomed. You slash out with one last deseperate swing and turn to run deeper into the forest. in your rush, you trip");
       System.out.println("over a root. As you struggle back to your feet, your quest is ended by the primal pack of gremlins.");
       
      }
     }
    }
   while (choice2==2){
    System.out.println("As you continue to ride your horse through the night, you see a cozy tavern nestled among the trees. Nearing exaustion, you ");
    System.out.println("throw caution to the wind. Tying your horse, you enter the tavern. \nintstantly greeted with plesant smells and warmth, you ");
    System.out.println("see an old man behind the bar, polishing a glass. \n\"It's been a while since I've seen a customer\" his voice is a deep rumble that vibrates through your chest.");
    System.out.println("Your eyes struggling to stay open, he points to the first room on the right.\n\"Get some rest.\" he says \"We can talk buisness in the morning/");
    System.out.println("You stumble into the room, falling asleep almost as soon as you touch the bed.");
    System.out.println("When you finally reawake, you feel completely refreshed. After exiting the room, you see the man still behind the counter. He hands you a plate of food.");
    System.out.println("Do you eat the food (hit 1) \nor leave it (hit 2)");
    choice3=scan.nextInt();

     while (choice3==1){
      System.out.println("Not eager to refuse the hospitality of the already generous man, you take a bite of the food. Deciding it was delicious, you wolf down the rest. Deciding you were done,");
      System.out.println("the man smiles. \"We don't get much business in these parts, and you seem to be a fairly wealthy man\" his voice rumbles through you as his eyes come to rest at the coin");
      System.out.println("purse resting at your side. The man takes out three items from behind the counter. You see a sheild, a necklace, and a fine looking shirt. The man eyes the inventory and");
      System.out.println("turns back to you. \"They're all wonderful pieces, however, I feel this shirt is definitly the one for you. Just look at those vibrant colors!\" Your tongue feels thick ");
      System.out.println("and your mind cloudy. Unable to form a coherent thought, you dumbly agree the shirt would look great on you. He flashes you a youthful smile for his old face. \"Thanks, ");
      System.out.println(name + ".\" He hands you the shirt as you pass over your gathered coins. Unable to grasp what had happened, you leave the tavern. As your foot meets the grass you feel a ");
      System.out.println("Strong wind behind you. Turning back around, you see the tavern has vanished. Grabbing your gear, you shake your head clear and gawk at your loss. The shirt doesn't even");
      System.out.println("match the rest of your outfit. You mount your horse and coninue to follow the path of the compass.");
      choice5=1;
      choice3--;
      choice2++;
      choice1++;
     }
     while (choice3==2){
      System.out.println("Distrustful of the far fetched circumstances leading up to this point, you set the plate aside and turn back to the old man. The man smiles, seemingly unfazed.");
      System.out.println("\"We don't get much business in these parts,\" he starts \"and you seem to be a fairly wealthy man\" his voice rumbles through you. His confident eyes come to rest at the coin");
      System.out.println("purse resting at your side. The man takes out three items from behind the counter. You see a sheild, a necklace, and a fine looking shirt. The man eyes the inventory and");
      System.out.println("turns back to you. \"They're all wonderful pieces, however, I feel this shirt is definitly the one for you. Just look at those vibrant colors!\" ignoring the mans words, you");
      System.out.println("examine the strong looking sheild and the swirling colors within the necklace. You ask how much for the two. \"I could never part with both, but for that coin purse at your side");
      System.out.println("I'd be willing to part with one.\"");
      System.out.println("Do you buy the shield (hit 1)\nThe necklace (hit 2) \nor the shirt (hit 3)");
      choice4=scan.nextInt();
       while (choice4==1){
        System.out.println("Picking up the sheild, you decide it would be valuable in the event of conflict, and hand the old man the money. Pleased, he takes it. Unsure how much time has passed,");
        System.out.println("you decide to resume your journey. As you exit the tavern, your foot meets the grass and you feel a strong wind behind you. Turning back around, you see the tavern has vanished.");
        System.out.println("Amazed and slightly confused, you grab your gear and remount your horse follow your compass once more.");
        sheild=1;
        choice5=1;
        choice4--;
        choice3++;
        choice2++;
        choice1++;
       }
       while (choice4==2){
        System.out.println("Picking up the necklace, you are again mesmerized by the colors within it. You hand the old man the gold, and take the necklace. Pleased he walks back behind the counter.");
        System.out.println("Unsure how much time has past, you decide to resume your journey. As you exit the tavern, your foot meets the grass and you feel a strong wind behind you. Turning back around,");
        System.out.println("you see the tavern has vanished. Amazed and slightly confused, you grab your gear and remount your horse follow your compass once more.");
        neck++;
        choice5=1;
        choice4=4;
        choice3++;
        choice2++;
        choice1++;
       }
       while (choice4==3){
        System.out.println("Deciding the old man had impecable fashion sense, you choose the shirt. The man, clearly shocked, takes your money with hesitation. You proudly put on the brightly colored shirt");
        System.out.println("and exit the tavern. As you exit, you feel a strong wind behind you. Turning back around, you see the tavern has vanished. Amazed and slightly confused, you and your bright atire");
        System.out.println("gather your gear and remount your horse to follow your compass once more");
        choice5=1;
        choice4++;
        choice3++;
        choice2++;
       }

     }
   }
       }
       while (choice5==1){
        System.out.println("Galloping through the trees, you're led into a clearing in the woods. protruding out of the empty feild you see a giant castle. Seeming to have grown from the ground itself, the ancient stone is");
        System.out.println("covered in layers of ivy. You hear a giant roar coming from within the castle walls and see a dragon take flight, circling the castle. Dumbfounded, you check the compass, which points directly at");
        System.out.println("Castle. Still refusing to believe it, you follow the outside ring of the clearing. The compass turns in pace with your horse, constantly pointing towards the castle. Without a better option, you ");
        System.out.println("ride towards the castle while the dragon remains high above. As you make it to the castle wall, you leave your horse at the enterence, and enter throught the crumbled wall. The compass points you ");
        System.out.println("Straight ahead, but you see a a staircase to your left. Do you \nFollow the compass (hit1)\nTake the stairs (hit2)");
        castle1=scan.nextInt();
        while (castle1==1){
         System.out.println("You choose to follow the compass that has guided you this far. You start out at a quick jog across the castle. You can see the compass directly pointing at the left tower of the castle. You put away");
         System.out.println("it away and focus on running there as fast as you can. Suddenly hit with a strong wind, you're knocked to the ground as the dragons wings blow air as it lands. \nDo you \nFight the dragon (hit 1)\nContinue running (hit 2)");
         castle2=scan.nextInt();
         while (castle2==1){
          if (sheild==1 && neck>=1){
           System.out.println("Filled with overwhelming courage, you charge the dragon. Raising your sheild to meet it's flames, you wait out its assault. As the inferno weakens down to little more than a campfire, you throw yourself at the beast");
           System.out.println("Swinging your blade, you slice the dragon's right wing. Letting out a yelp of pain, it knocks you back with its other wing. As you connect with the wall behind you, you fell the necklace around you grow hot, and you");
           System.out.println("Rise from an otherwise fatal blow. Charging the dragon again, you sheild through its flames and slash it across it's chest. As it moves to retreat you leap forward, driving the blade home and slaying the monster.");
           System.out.println("After slaying the dragon, you pick yourself back up, and continue into the tower. As you reach the top, you see a heavily locked door. Raising your sword, you break the lock with one strong swing. Entering the room");
           System.out.println("you see the face plastered on every other wall your whole life. The sleeping face of the still youthfull princess lies on a bed, sheilded by a blue mist. \"excelent\" a familiar voice behind you purrs. You turn to see your grandmother");
           System.out.println("dressed in a long robe. \"I knew you could do it.\" she says as she holds out her hand to you. \"The book, dear?\" Completely at a loss, you pull the book from your bad and hand it to her. She quickly turns around and ");
           System.out.println("begins a chant, the book open in front of her. Over as soon as it began, you see the mist around the princess fade and a heavy layer of sweat had formed around your grandmothers brow. \"I sealed her away, waiting for this");
           System.out.println("moment "+name+". The kingdom is out of options and I hold the one thing the king wants. For years I've waited for this moment, and now it's finally here. She turns to you. Now, I know this is hard to understand but know I'm");
           System.out.println("doing this not just for me, but both of our future. Carry the girl down, I need to gather something from the dragons remains. They're a rare find. \nDo you\nCarry down the girl(hit 1)\nStop your grandmother (hit 2)");
           castle3=scan.nextInt();
           while (castle3==1){
            System.out.println("You carry down the princess, following your grandmothers orders. You continue to do as she says. Over the next few months you hold the girl for a rediculous randsom which the king eventually agrees to, and move away to");
            System.out.println("a wealthy kingdom where you spent the rest of your years in luxury. After being exposed to magic, your grandmother taught you all she knew, and you learned more. Eventually surpassing her, you grew quite infamous throughout");
            System.out.println("the kingdom where your name became both a threat, and a warning.\n\nThanks for playing! Try again to get different endings!");
           }
           while (castle3==2){
            System.out.println("As your grandmother turns away, you strike her down. Appaled at what she had done, and realizing what monster she was. You take the princess and leave. After retreiving your horse you ride to the capital and present the king");
            System.out.println("with his lost daughter. You tell him the full recount of what had happened. After finishing your story, he demands for your execution. The princess stops him, declaring what you said to be true and that you had saved her. The");
            System.out.println("relents, and grants you great honor for saving his daughter. You are made a knight, and serve as a royal guard for the princess. As time passes, you fall in love and ultimately get married. eventually becoming king of the realm,");
            System.out.println("and a happy father. \nThanks for playing! Try again to get other endings!");
           }
          }
          else if (sheild==1 && neck<=1){
           winLose=(int)(Math.random()*2)+1;
           if (winLose==1){
            System.out.println("You face the dragon, filled with courage. You raise your sheild and absorb the flames of the dragons first breath. Lunging in, you strike the dragon and block his claws with your sheild.");
            System.out.println("Diving to the right, you avoid the dragons next attack. Rolling back to your feet, you jump onto the dragons back as it begins to take off for flight. Slashing into it, you slay the beast");
            System.out.println("before it can make it far.");
            System.out.println("After slaying the dragon, you pick yourself back up, and continue into the tower. As you reach the top, you see a heavily locked door. Raising your sword, you break the lock with one strong swing. Entering the room");
           System.out.println("you see the face plastered on every other wall your whole life. The sleeping face of the still youthfull princess lies on a bed, sheilded by a blue mist. \"excelent\" a familiar voice behind you purrs. You turn to see your grandmother");
           System.out.println("dressed in a long robe. \"I knew you could do it.\" she says as she holds out her hand to you. \"The book, dear?\" Completely at a loss, you pull the book from your bad and hand it to her. She quickly turns around and ");
           System.out.println("begins a chant, the book open in front of her. Over as soon as it began, you see the mist around the princess fade and a heavy layer of sweat had formed around your grandmothers brow. \"I sealed her away, waiting for this");
           System.out.println("moment "+name+". The kingdom is out of options and I hold the one thing the king wants. For years I've waited for this moment, and now it's finally here. She turns to you. Now, I know this is hard to understand but know I'm");
           System.out.println("doing this not just for me, but both of our future. Carry the girl down, I need to gather something from the dragons remains. They're a rare find. \nDo you\nCarry down the girl(hit 1)\nStop your grandmother (hit 2)");
           castle3=scan.nextInt();
           while (castle3==1){
            System.out.println("You carry down the princess, following your grandmothers orders. You continue to do as she says. Over the next few months you hold the girl for a rediculous randsom which the king eventually agrees to, and move away to");
            System.out.println("a wealthy kingdom where you spent the rest of your years in luxury. After being exposed to magic, your grandmother taught you all she knew, and you learned more. Eventually surpassing her, you grew quite infamous throughout");
            System.out.println("the kingdom where your name became both a threat, and a warning.\n\nThanks for playing! Try again to get different endings!");
            System.exit(0);
           }
           while (castle3==2){
            System.out.println("As your grandmother turns away, you strike her down. Appaled at what she had done, and realizing what monster she was. You take the princess and leave. After retreiving your horse you ride to the capital and present the king");
            System.out.println("with his lost daughter. You tell him the full recount of what had happened. After finishing your story, he demands for your execution. The princess stops him, declaring what you said to be true and that you had saved her. The");
            System.out.println("relents, and grants you great honor for saving his daughter. You are made a knight, and serve as a royal guard for the princess. As time passes, you fall in love and ultimately get married. eventually becoming king of the realm,");
            System.out.println("and a happy father. \nThanks for playing! Try again to get other endings!");
            System.exit(0);
           }
           }
           else if (winLose==2){
            System.out.println("You charge the dragon, blocking his first burst of flames with your sheild. As you rise to swing, you're knocked back with its strong wings. You fly back, connecting with the wall behind you. Breaking your bones, and ending your quest.");
            System.out.println("Close! Better luck next game!");
            System.exit(0);
           }
          }
          else
            System.out.println("You charge the dragon, but with no sheild you're burnt to a crisp after it's first breath of flames. \nThanks for playing! Better luck next game!");
            System.exit(0);
         }
         while (castle2==2){
           winLose=(int)(Math.random()*4)+1;
           if (winLose==1 || winLose==2 || winLose==3){
            System.out.println("Running full spead, you almost make it to the door before being hit by intense flames. You don't survive. \nBetter luck next game! Thanks for playing!");
            System.exit(0);
           }
           else{
            System.out.println("After making it to the tower, you climb your way to the top, you see a heavily locked door. Raising your sword, you break the lock with one strong swing. Entering the room");
           System.out.println("you see the face plastered on every other wall your whole life. The sleeping face of the still youthfull princess lies on a bed, sheilded by a blue mist. \"excelent\" a familiar voice behind you purrs. You turn to see your grandmother");
           System.out.println("dressed in a long robe. \"I knew you could do it.\" she says as she holds out her hand to you. \"The book, dear?\" Completely at a loss, you pull the book from your bad and hand it to her. She quickly turns around and ");
           System.out.println("begins a chant, the book open in front of her. Over as soon as it began, you see the mist around the princess fade and a heavy layer of sweat had formed around your grandmothers brow. \"I sealed her away, waiting for this");
           System.out.println("moment "+name+". The kingdom is out of options and I hold the one thing the king wants. For years I've waited for this moment, and now it's finally here. She turns to you. Now, I know this is hard to understand but know I'm");
           System.out.println("doing this not just for me, but both of our future. Carry the girl down, I'm going to deal with the dragon. They're a rare find. \nDo you\nCarry down the girl(hit 1)\nStop your grandmother (hit 2)");
           castle3=scan.nextInt();
           while (castle3==1){
            System.out.println("You carry down the princess, following your grandmothers orders. You continue to do as she says. Over the next few months you hold the girl for a rediculous randsom which the king eventually agrees to, and move away to");
            System.out.println("a wealthy kingdom where you spent the rest of your years in luxury. After being exposed to magic, your grandmother taught you all she knew, and you learned more. Eventually surpassing her, you grew quite infamous throughout");
            System.out.println("the kingdom where your name became both a threat, and a warning.\n\nThanks for playing! Try again to get different endings!");
            System.exit(0);
           }
           while (castle3==2){
            System.out.println("As your grandmother turns away, you strike her down. Appaled at what she had done, and realizing what monster she was. You take the princess and leave. After retreiving your horse you ride to the capital and present the king");
            System.out.println("with his lost daughter. You tell him the full recount of what had happened. After finishing your story, he demands for your execution. The princess stops him, declaring what you said to be true and that you had saved her. The");
            System.out.println("relents, and grants you great honor for saving his daughter. You are made a knight, and serve as a royal guard for the princess. As time passes, you fall in love and ultimately get married. eventually becoming king of the realm,");
            System.out.println("and a happy father. \nThanks for playing! Try again to get other endings!");
            System.exit(0);
           }
         }
        }
        }
        while(castle1==2){
         System.out.println("You take the stairs. As you climb your way up to the fourth floor, the stairs under you give way and you fall to your death in an avalanch of rubble. \nSorry! better luck next game. Thanks for playing.");
         System.out.println("Would you like to restart? (hit 1 for yes, 2 for no)");
     yesNo=scan.nextInt();
     if (yesNo==1){
     	restart=0;
     	choice1=0;
     	choice2=0;
     	choice3=0;
     	choice4=0;
     	choice5=0;
     	choice4a=0;
     	sheild=0;
     	castle1=0;
     	castle2=0;
     	castle3=0;
     }
     else {
     System.exit(0);
     }
        }
       
}
}
}
}
