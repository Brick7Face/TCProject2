import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Character {
	String eye, hair, race, sex, sexU, pos, posU, other, otherU, m;
	double height;
	int age;
	
	public Character() {								//makes character with random generated traits
		age = age();
		height = height();
		eye = trait("eye");
		if (age < 65 ) hair = trait("hair");			//if age is less than 65, hair can be other than grey
		else hair = "grey";
		race = trait("race");
		sex = trait("sex");
		if (sex.equals("male")) {						//uppercase version of sex
			sexU = "Male";
			pos = "his";
			posU = "His";
			other = "he";
			otherU = "He";
			m = "him";
			
		}
		else {
			sexU = "Female";
			pos = "her";
			posU = "Her";
			other = "she";
			otherU = "She";
			m = "her";
		}
	}
	
	public void write() throws IOException {			//15 stories!! or story starters
		PrintWriter writer = new PrintWriter(new FileWriter("Character_Biography.txt", true));
		writer.format("\n\nYour character is %d years old, and has %s eyes and %s hair. %s is %.2f feet tall, and is of %s descent.", age, eye, hair, otherU, height, race);
		int b = (int) (1 + (Math.random() * 15));
		switch (b) {
		case 1: {
			writer.format(" Originally from the U.S., %s studied in Russia for a semester when life completely changed. %s father and mother were randomly murdered after an outing one night, and %s could not believe it.", other, posU, other); 
			writer.format(" %s dropped out of school and became depressed. Money became tight soon after, and %s was eventually evicted from %s apartment. Forced to sleep in the ghettos, %s met a homeless man who had a map of Siberia, where he pointed out a remote location.", otherU, other, pos, other);
			writer.format(" Not fully realizing what was happening, your character looked at the man, backed away, and was knocked unconscious from behind.\n");
			break;
		}
		case 2: {
			writer.format(" Born to a wealthy family in Boston, %s learned to love being out on boats. %s family owned a vacation home in Northern Maine, located nearby a lighthouse. %s remembers going sailing at night and looking toward the lighthouse, trying to pretend it was a star on earth.", other, posU, otherU); 
			writer.format(" One particular boating adventure %s remembers is when %s family was on a yacht trip and a storm blew through. %s got below deck and watched the storm out of a porthole, and lightning struck the yacht. Terrified that the vessel might sink, %s ran up on deck and saw what seemed to be a fried human walking around.", other, pos, otherU, other);
			writer.format(" It struggled for breath, then collapsed. Your character ran to the person and upon seeing the scorched features, blacked out.\n\t\t\t\t\t\t* * *\nA couple days ago, your character was asked to go on a cruise with %s family one last time before %s father died. He was quite old, but wanted to see the ocean one more time.", pos, pos);
			writer.format(" Thinking about the stormy yacht ride, your character reluctantly stepped onto the boat awaiting %s. %s could not decide how %s felt about this trip, and as crossed the threshold, thunder rumbled far away.\n", m, otherU, other, other);
			break;
		}
		case 3: {
			writer.format(" In the year 2793, humans had nearly been wiped out. Space travel advancements had taken humanity far beyond anyone's imagination, and multiple systems were found to contain life. Most of the life had been primitive, but a small number had been extremely advanced. Most had helped humans in their quest for knowledge, but one race mistrusted them."); 
			writer.format(" The humans simply called them the 'Others.' The Others were difficult to communicate with in any way, even with an intergalactic translator. After sending the Supreme Lord of Earth to delegate with them, the Lord was never heard from again and before humanity knew it, a couple of colonized solar systems had perished.");
			writer.format(" Now, as the number of humans dwindled and held less than four planets, the Milky Way Space Force was training super soldiers, (some just called them cyborgs) to combat the alien threat. The MYSF had human/robot hybrids that aged anywhere from 20 to 140 earth years. Humans lived to be nearly 300 sometimes, and through technology were able to stay physically adept until their mid-100's.");
			writer.format(" Your character, a soldier just recruited, was currently being loaded with the knowledge and brain pathways of how to successfully fight the Others. There was an explosion above. 'They just destroyed our transmitters! The BrainCloud is down!' yelled a technician nearby. As the room went dark and filled with Otherly noises, your character jumped up.");
			writer.format(" %s scanned the room, saw movement, and shot lazers from %s eyes. 'Don't worry,' %s said. 'Enough was downloaded. I've got this.'\n", otherU, pos, other);
			break;
		}
		case 4: {
			writer.format(" \n'MAGIC IS FORBIDDEN. ALL THOSE WITH IT MUST REPORT TO BE CLEANSED.'\nThe sign in the middle of town was largely ignored by everyone, since magic had not infected this part of the country. However, your character was infected. Of course. 'Why does this always happen to me?' %s thought. %s grandmother had specifically told %s to stay away from the glowing log.", other, posU, m); 
			writer.format(" Being prone to sleep-walking, your character ended up near it anyway, and had somehow contracted magic. %s knew to go to the mage-doctor to remove it, but kind of enjoyed the tickly feeling whenever %s got an energy spike. It would probably be a painful process to remove, too. There were rumors that one had to bathe in feces to get rid of magic.", otherU, other);
			writer.format(" However, the punishment for not getting it removed was being strapped to a chair in a quarantine room and being shocked until it was gone. Resolving to go to the doctor, your character put on %s shoes and left the house. On the way there, a voice told %s to keep the magic and travel to the mountains, where a secret academy could be found.", pos, m);
			writer.format(" 'Your magic could help cure all problems in the world,' the voice said. Your character was left pondering what to do with one foot pointed toward the doctor's and one pointed toward the mountains.\n");
			break;
		}
		case 5: {
			writer.format(" Falling from a ledge, your character tried to grab the edge of the cliff. %s friend grabbed %s arm and pulled. 'Thanks. That's a pretty big drop.' Your character had been practicing rock climbing for a few years now, but was still not very steady.", posU, pos); 
			writer.format(" 'I'll just make sure you don't die,' the friend replied. They continued on up, and reached the top by mid-afternoon. The air was perfect, and there was a slight breeze that warmed them a little. 'It's too bad about your dog,' the friend said. Your character's dog had fallen from a ledge last time they climbed.");
			writer.format(" It had taken a while for your character to want to climb again. 'Like master, like dog, right?' %s was bad with sayings, especially when %s was thinking about her dead pets. 'I think I just heard a bark...' said the friend. 'That's pretty insensative, you know,' replied your character. 'No, I'm serious!'", otherU, other);
			writer.format(" There was a faint echoing bark, and your character looked at %s friend. 'Let's go see what it's barking at!' %s said.\n", pos, other);
			break;
		}
		case 6: {
			writer.format(" A former resident of Bozeman, Montana, your character knew the Story family. %s would tend their garden when they were gone and sometimes babysit the Story children. However, after a few years of this lifestyle, an opportunity presented itself in San Fransisco.", otherU); 
			writer.format(" Your character packed and left Bozeman and started a new life in the Bay Area. Many years later, after Nelson Story had died, your character was camping on Angel Island just north of Alcatraz. %s heard noise one of the nights %s was there, but did not think much of it. The next morning, police were all over the island.", otherU, other);
			writer.format(" Your character was questioned and eventually released, but the police did not tell %s why. The next time %s went camping, a figure approached. 'What did you see on the night of June 11, 1962 on Angel Island?' asked the figure. 'I will make it worth your while.'\n", m, other);
			break;
		}
		case 7: {
			writer.format(" As a child, your character liked to play guitar. %s would pick songs for %s family and sing. Everyone loved it. %s even joined a bluegrass band. %s lived in a small town, so of course was one of the best guitar players there.", otherU, pos, otherU, otherU);
			writer.format(" Upon attending college, %s found a bluegrass band that was fairly well-known in the area. Better yet, they were looking for a guitar player. Your character decided to audition and see what they thought. The audition was okay, but did not go as well as %s could have done.", other, other);
			writer.format(" A week later, the band replied. They had found someone better, but told %s to stay in touch. %s was crushed. Was it worth it to not go anywhere with %s talents, or are talents not worth anything unless acted upon?\n", other, otherU, pos);
			break;
		}
		case 8: {
			writer.format(" It was near sundown, and your character was walking through the rows of corn in %s backyard. This was an experience that %s loved as a child. Just like years ago, the air was warm and heavy - the usual for the midwest.", pos, other); 
			writer.format(" %s got far into the cornfield and half-wondered if %s would find the way out. The sun neared the horizon, and peace found its way into your character. The feeling of being semi-lost in a cornfield is fantastic feeling, %s thought.", otherU, other, other);
			writer.format(" Dark came quickly. As %s turned around and headed out, the whole way looked the same. %s did not know if this was the correct way or not, but that didn't matter. The cornfield would end eventually.\n", other, otherU);
			break;
		}
		case 9: {
			writer.format(" The wind rushed past your character as the falling feeling started to even out. Skydiving was great, but the initial fall was still a rush that freaked %s out. The squirrel suit %s was wearing gave some amount of control, so the falling was manageable.", m, other); 
			writer.format(" %s imagined that an eagle must feel similarly when in the sky. The sight was crazy; everything looked so small. It looked like Google Earth, but it was literally what %s was seeing in real life. Enjoying the feeling before having to pull the parachute and slow way down, %s took a deep breath. ", otherU, other, other);
			writer.format(" As the earth came closer, however, your character started to see distant explosions of light. Another went off not far below %s. 'What is going on?' %s yelled to a nearby partner. The partner did not answer - he had shrapnel in his chest and was bleeding to death.", m, other);
			writer.format(" There was nothing your character could do. A mushroom cloud erupted in the distance.\n");
			break;
		}
		case 10: {
			writer.format(" %s held the wound on %s arm tightly. The commander wheeled around from the corner and yelled 'Are you still alright?' 'Yeah, I suppose...' replied your character. The growl of the nearby zombies was overwhelming.", otherU, pos); 
			writer.format(" Your character and the commander were the only ones left; the zombies were currently feasting on the rest of the company. The commander's gun clicked - it was out of ammo.");
			writer.format(" 'Well, good luck. I hope you make it out of here.' The commander grabbed his knife and rushed into the crowd of monsters. Your character struggled to rise, grabbed a knife with %s good arm, and did %s best to run past the crowd. The commander's screams filled the corridor.\n", pos, pos);
			break;
		}
		case 11: {
			writer.format(" Upon going away for the summer, your character was forced to spend time away from %s best friends. %s went to Greece to live with %s grandparents for a few months. One day, while sailing, %s met an attractive boy.", pos, otherU, pos, other); 
			writer.format(" The boy took %s sailing with him for the day, but when your character returned and told %s grandmother about it, the grandmother revealed that the boy was from a family on the other end of a family feud. She made your character swear to not see him again.", other, pos);
			writer.format(" Despite %s grandmother's wishes, %s went swimming the next day and saw the boy. They swam together, and they fell in love. 'What about our families?' asked your character.\n", pos, other);
			break;
		}
		case 12: {
			writer.format(" While skiing one day, your character shattered %s leg. A tree came out of nowhere, and there was no time to avoid it. The pain was excruciating. Skiing was %s favorite sport, and %s could not bare to loose it. At the hospital, %s leg was set and was supposed to heal just fine.", pos, pos, other, pos); 
			writer.format(" However, your character was in a car wreck a few weeks later, and the leg took most of the damage. This time, the doctor told %s that the leg was not going to heal fully. %s became depressed and did not know what kind of life %s was going to lead.", other, otherU, other);
			writer.format(" Without skiing, life was meaningless. The mountain air and the snow was all your character cared about. The next Christmas, %s received a monoski as a gift.\n", other);
			break;
		}
		case 13: {
			writer.format(" After being caught for attempting to cross the border out of %s home country, your character was going to be executed. The civil war in the country was raging and prisoners of all kinds were being executed for all kinds of reasons. However, the rebel leader was in the group being executed with your character.", pos); 
			writer.format(" The rebel leader stepped up to the chopping block when there was an explosion. In the confusion, your character ran off. There was fire everywhere. Trying to find a way out of the rubble was difficult, but on the way, %s found a sharp protrusion from a fence and cut %s binds.", other, pos);
			writer.format(" %s took refuge in a nearby town and heard that the rebel leader had escaped. However, people were saying that the expolosions may have been caused by a dragon. Dismissing this, your character walked into the local inn to find a group of mercenaries that were gearing up.\n", otherU);
			break;
		}
		case 14: {
			writer.format(" \n\t\t\t\t\t\t* * *\nIn the late morning, the air is crisp. Your character approaches a clearing where the sun shines down serenely. Pine trees rise on either side, and a soft floor of mountain grass is damp from morning dew. Protruding through the grass are various shades of mountain flowers."); 
			writer.format(" The atmosphere is calm and there is no sound except the rustling of trees in the slight breeze. No other life is around but your character. %s enters the clearing and sits on the floor of grass. %s closes %s eyes and hears a brook nearby. The sun feels warm on %s skin. After enjoying the serenity for a moment, %s smells something odd.", otherU, otherU, pos, pos, other);
			writer.format(" %s turns around and sees a darkened area in the trees on the side of the clearing. In the shadows, a man hangs from a noose from the branch of a large tree.\n", otherU);
			break;
		}
		case 15: {
			writer.format(" 'Damn.' %s missed, and the game got away. 'No matter. I will not miss next time.' %s thought about all of his hunting medals and societies that %s had rose to the top of. Over time, hunting rare game had become dissatisfying. %s needed something more.", otherU, otherU, other, otherU); 
			writer.format(" AIs had recently become a replacememt for humans in many jobs. Your character had contemplated hunting humans, but decided that was too evil. AIs were perfect because they had been programmed to have a survival instinct and were, honestly, more of a challenge to hunt than humans could be.");
			writer.format(" They had all the knowledge of the surroundings and had a large capacity to kill. As %s thought about the decision to hunt these, an AI jumped from a tree and landed on top of %s. Its hand turned into a serrated blade and lowered it to your character's neck.\n", other, m);
			break;
		}
		}
		writer.close();
	}
	
	public int age() {									//random number between 18 and 80 for age
		int a = (int) (18 + (Math.random() * 63));
		return a;
	}
	public double height() {							//random height between 3.5 and 7.5 feet
		double h = (3.5 + (Math.random() * 4));			
		return h;
	}
	public String trait(String thing) {					//random eye color, hair color, race, and sex
		switch (thing) {
		case "eye": {									//26 eye colors
			int e = (int) (1 + (Math.random() * 26));
			switch (e) {
			case 1: return "light blue";
			case 2: return "ice blue";
			case 3: return "blue";
			case 4: return "grey-blue";
			case 5: return "white";
			case 6: return "black";
			case 7: return "grey";
			case 8: return "teal";
			case 9: return "ice green";
			case 10: return "green";
			case 11: return "grey-green";
			case 12: return "pale-gold";
			case 13: return "yellow";
			case 14: return "gold";
			case 15: return "orange";
			case 16: return "brown";
			case 17: return "dark brown";
			case 18: return "red";
			case 19: return "pale purple";
			case 20: return "purple";
			case 21: return "magenta";
			case 22: return "garrus";
			case 23: return "brown and green";
			case 24: return "gold and green";
			case 25: return "hazel";
			case 26: return "albino";
			}
			break;
		}
		case "hair": {									//12 hair colors
			int h = (int) (1 + (Math.random() * 12));
			switch (h) {
			case 1: return "jet black";
			case 2: return "dark brown";
			case 3: return "medium brown";
			case 4: return "light brown";
			case 5: return "auburn";
			case 6: return "cherry red";
			case 7: return "dirty blonde";
			case 8: return "copper red";
			case 9: return "light blonde";
			case 10: return "golden blonde";
			case 11: return "platinum blonde";
			case 12: return "grey";
			}
			break;
		}
		case "race": {									//12 races
			int r = (int) (1 + (Math.random() * 12));
			switch (r) {
			case 1: return "African American";
			case 2: return "Asian";
			case 3: return "Caucasion";
			case 4: return "European";
			case 5: return "Indian";
			case 6: return "Native American";
			case 7: return "Scandenavian";
			case 8: return "Hispanic";
			case 9: return "African";
			case 10: return "Arabic";
			case 11: return "Hawaiian";
			case 12: return "Filipino";
			}
			break;
		}
		case "sex": {								//two sexes, of course
			int g = (int) (1 + (Math.random() * 2));
			switch (g) {
				case 1: return "male";				
				case 2: return "female";
			}
			break;
		}
		default: return "black";					//return black if others fail since black works for all cases but sex
		}
		return "black";
	}
	
}
