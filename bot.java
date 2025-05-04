import javax.sound.midi.Soundbank; 
import java.sql.SQLOutput; 
import java.util.*; 
public class Bot{ 
public static void main(String[] args) { 
Scanner scr=new Scanner(System.in); 
Botimplementation c=new Botimplementation(); 
Botimplementation.chatbotqusetions(); 
String choice=""; 
Getusername usernameobj = new Getusername(); 
String username=usernameobj.getusernamemethod(); 
Botimplementation.chat(username); 
} 
} 
class Botimplementation{ 
//static String response = ""; 
static HashMap<String, String> dict = new HashMap<>(); 
static Scanner scr = new Scanner(System.in); 
public static void chat(String username) { 
new Gui(username); 
} 
static String response=""; 
public static String response3(String userinput) { 
String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND"; 
System.out.println(userinput); 
//String response=""; 
List<String> relatedques = relatedquestions(userinput); 
if (dict.containsKey(userinput)) { 
return dict.get(userinput); 
} 
if (!relatedques.isEmpty()) { 
Relatedquestionsfinal obj = new Relatedquestionsfinal(); 
obj.RelatedQuestionsGUI(userinput, relatedques); 
return relatedques.toString(); 
} 
return defaultResponse; 
} 
public static String nullresponse(){ 
String tempresponse=""; 
tempresponse=response;
return response; 
} 
public static String response2(String selecteduserinput, String userinput) { 
String defaultResponse = "SORRY! ANSWER TO QUESTION NOT FOUND"; 
//System.out.println(userinput); 
List<String> relatedques = relatedquestions(userinput); 
String response = null; 
if (selecteduserinput.equalsIgnoreCase("") && dict.containsKey(userinput)) { 
response = dict.get(userinput); 
} else if (selecteduserinput.equalsIgnoreCase("") && !userinput.equalsIgnoreCase("")) { 
Relatedquestionsfinal obj = new Relatedquestionsfinal(); 
obj.RelatedQuestionsGUI(userinput, relatedques); // Update selecteduserinput here 
// System.out.println("respose2: " + selecteduserinput); 
response = dict.get(selecteduserinput); 
} 
if (response == null) { 
response = defaultResponse; 
} 
System.out.println("respnse2: " + response); 
return response; 
} 
public static void chatbotqusetions() { 
dict.put("what are the best places to visit in north india?", 
"Delhi and Himachal Pradesh stand out as prime destinations in North India.\nHimachal 
Pradesh offers stunning landscapes, adventure activities, and a rich cultural tapestry.\nWith 
snow-capped mountains, vibrant valleys, and picturesque hill stations like Shimla and Manali, 
it's a haven for nature lovers and thrill-seekers alike.\nDelhi, as the historical and cultural 
capital, boasts iconic landmarks like the Red Fort and Qutub Minar.\nThe city's diverse culture 
is evident in bustling markets and serene spots like Lodi Gardens.\nDelhi's culinary scene, from 
street food to Mughlai cuisine, is a treat for food enthusiasts.\nCombining the natural beauty 
of Himachal Pradesh with Delhi's historical significance provides a well-rounded North Indian 
experience, offering tranquility, adventure, and cultural exploration."); 
dict.put("what are the must-visit attractions in himachal pradesh?", 
"Himachal Pradesh boasts breathtaking destinations like Shimla, Manali, and 
Dharamshala.\nExplore the scenic landscapes of [Rohtang 
Pass](https://www.google.com/maps/place/Rohtang+La/@32.371725,77.2468365,17z/data=!
3m1!4b1!4m6!3m5!1s0x39047ef0b27a15ad:0xbfdd7e65efefc66b!8m2!3d32.3716426!4d77.2
466221!16zL20vMDNsX2Jo!5m1!1e4?entry=ttu)\nand witness the spiritual charm of the 
[Hidimba Devi 
Temple](https://www.google.com/maps/place/Hadimba+Devi+Temple/@32.2483526,77.178
9978,17z/data=!3m1!4b1!4m6!3m5!1s0x39048806c068e53d:0x2daa244b3eee879c!8m2!3d3
2.2483526!4d77.1815727!16zL20vMGdfOHM1!5m1!1e4?entry=ttu) in Manali.\nFor a 
tranquil 
experience,visitthe[DalaiLama'sresidence](https://www.google.com/maps/place/McLeod+Ga
nj,+Dharamshala,+Himachal+Pradesh/@32.2450191,76.3052845,15z/data=!3m1!4b1!4m6!3
m5!1s0x391b56d4e3d36d19:0xa3e8725f0584be76!8m2!3d32.2425758!4d76.3212781!16s%
2Fm%2F03gxw9g!5m1!1e4?entry=ttu) in McLeod Ganj."); 
dict.put("what adventure activities can one enjoy in himachal pradesh?", 
"Himachal offers thrilling adventures like [paragliding in Bir 
Billing](https://www.google.com/maps/place/Bir+Billing+Paragliding+Point/@32.0573918,7
6.7390166,17z/data=!3m1!4b1!4m6!3m5!1s0x3904bf6aee1cb889:0xa9b0ab5fb1d010cf!8m2
!3d32.0573919!4d76.7438875!16s%2Fg%2F11mhfv18v4!5m1!1e4?entry=ttu), skiing in 
[Solang 
Valley](https://www.google.com/maps/place/Solang+Valley/@32.3131407,77.1609555,17z/
data=!3m1!4b1!4m6!3m5!1s0x3904873b67f51935:0x711b3f450dfe5abf!8m2!3d32.3131407
!4d77.1635304!16s%2Fg%2F11dxb21874!5m1!1e4?entry=ttu), and river rafting in [Beas 
River](https://www.google.com/maps/place/Beas+River/@32.3162081,77.1577241,15z/data
=!4m5!3m4!1s0x3904871ccfecc305:0x8a1c05b8962189c3!8m2!3d32.3162081!4d77.157724
1!15s%2Fm%2F06c7ny!1sBeas+River!3m1!1s0x3904871ccfecc305:0x8a1c05b8962189c3!1
2sBeas+River!16s%2Fg%2F11dxb21874!14e1!7m1!1sBeas+River), and trekking to the 
scenic 
[Triund](https://www.google.com/maps/place/Triund+Trek/@32.2585504,76.3356626,17z/d
ata=!3m1!4b1!4m6!3m5!1s0x391b56c757fa1f77:0x724e7b8ac0aa0d84!8m2!3d32.2585505!
4d76.3405335!16s%2Fg%2F11g8pbdrwh!5m1!1e4?entry=ttu)."); 
dict.put("recommend some luxury hotels in himachal pradesh.", 
"Enjoy luxurious at [The Oberoi Cecil in 
Shimla](https://www.google.com/maps/place/The+Oberoi+Cecil,+Shimla/@31.10316,77.152
4151,17z/data=!4m9!3m8!1s0x390578e40ea7673d:0xac242da91c97ab86!5m2!4m1!1i2!8m2
!3d31.10316!4d77.15499!16s%2Fm%2F03h004y!5m1!1e4?entry=ttu), [Wildflower Hall in 
Mashobra](https://www.google.com/maps/place/Wildflower+Hall,+Mashobra/@31.1260465,
77.3181463,15z/data=!4m5!3m4!1s0x39043be3a95c7fe7:0x804b44fa4f19d9a2!8m2!3d31.12
60465!4d77.3181463!15s%2Fg%2F11c6s67yk7!1sWildflower+Hall,+Mashobra!3m1!1s0x3
9043be3a95c7fe7:0x804b44fa4f19d9a2!12sWildflower+Hall,+Mashobra!16s%2Fg%2F11c6
s67yk7!14e1!7m1!1sWildflower+Hall,+Mashobra), and [The Himalayan in 
Manali](https://www.google.com/maps/place/The+Himalayan/@32.2397,77.1888,15z/data=!
4m5!3m4!1s0x39053c66b0a6207d:0xdef8e0b1bb5c93b2!8m2!3d32.2397!4d77.1888!15s%2
Fg%2F11dxb21874!1sThe+Himalayan,+Manali,+Himachal+Pradesh!3m1!1s0x39053c66b0a
6207d:0xdef8e0b1bb5c93b2!12sThe+Himalayan,+Manali!16s%2Fg%2F11dxb21874!14e1!7
m1!1sThe+Himalayan,+Manali). These hotels offer world-class amenities and stunning 
views."); 
dict.put("what are the best times to visit himachal pradesh?", 
"The ideal time to visit is during the summer months (March to June) for pleasant 
weather.\nWinter (December to February) attracts snow enthusiasts.\nHowever, avoid the 
monsoon season (July to September) due to heavy rainfall.\nWebsite: [Himachal 
Tourism](https://www.himachaltourism.gov.in/)"); 
dict.put("which festivals are celebrated with grandeur in himachal pradesh?", 
"Experience the vibrant culture during festivals like Kullu Dussehra, Shimla Summer Festival, 
and Losar in Spiti.\nThese celebrations showcase traditional music, dance, and religious 
rituals."); 
dict.put("what makes manali a must-visit destination in himachal pradesh?", 
"Manali is renowned for its stunning landscapes, adventure activities, and vibrant culture.\nKey 
attractions include Rohtang Pass, Hidimba Devi Temple, Solang Valley, and Old Manali."); 
dict.put("which is the highest mountain pass in himachal pradesh?", 
"Rohtang Pass is the highest mountain pass in Himachal Pradesh, offering breathtaking views 
and access to Lahaul and Spiti valleys.\nIt attracts tourists for its snow-capped landscapes and 
serves as a gateway to adventure activities."); 
dict.put("what are some lesser-known yet charming villages in himachal pradesh that offer an 
offbeat experience?", 
"Tirthan Valley, Barot, and Malana are lesser-known gems.\nTirthan Valley is serene with 
trout-filled rivers, Barot is known for its lush landscapes and trekking, while Malana offers a 
unique cultural experience."); 
dict.put("are there any spiritual retreats in himachal pradesh for those seeking a peaceful and 
introspective experience?", 
"Yes\n [Bhagsu 
Nag](https://www.google.com/maps/place/Bhagsu+Nag,+Himachal+Pradesh,+India/@32.24
22107,76.3218482,15z/data=!4m5!3m4!1s0x3904896504bebe37:0x585d19e7897b2da4!8m2
!3d32.2422107!4d76.3218482!15s%2Fg%2F11dznm8g6d!1sBhagsu+Nag,+Himachal+Prade
sh,+India!3m1!1s0x3904896504bebe37:0x585d19e7897b2da4!12sBhagsu+Nag,+Himachal+
Pradesh,+India!16s%2Fg%2F11dznm8g6d!14e1!7m1!1sBhagsu+Nag,+Himachal+Pradesh,+
India) and [Tushita Meditation Centre in 
Dharamshala](https://www.google.com/maps/place/Tushita+Meditation+Centre,+Mclodegan
j,+Dharamshala,+Himachal+Pradesh,+India/@32.2454505,76.3258214,15z/data=!4m5!3m4!
1s0x39048961c8e9b3af:0x1717a16d61cf153b!8m2!3d32.2454505!4d76.3258214!15s%2Fg
%2F11b6p0dtbb!1sTushita+Meditation+Centre,+Mclodeganj,+Dharamshala,+Himachal+Pra
desh,+India!3m1!1s0x39048961c8e9b3af:0x1717a16d61cf153b!12sTushita+Meditation+Cen
tre,+Mclodeganj,+Dharamshala,+Himachal+Pradesh,+India!16s%2Fg%2F11b6p0dtbb!14e1!
7m1!1sTushita+Meditation+Centre,+Mclodeganj,+Dharamshala,+Himachal+Pradesh,+India)
. These places provide serene environments for meditation and spiritual practices.\n"); 
dict.put("where can one enjoy hot springs in himachal pradesh?", 
"Manikaran, near Kullu, is famous for its hot springs.\nThe springs are believed to have 
therapeutic properties, offering relief from ailments and providing a relaxing experience amidst 
scenic surroundings."); 
dict.put("what are some family-friendly activities in himachal pradesh?", 
"Adventure activities like river rafting in Beas River, visiting the Himalayan Nature Park in 
Kufri, and exploring the Pin Valley National Park offer exciting experiences suitable for 
families."); 
dict.put("can you recommend some trekking routes in himachal pradesh?", 
"For beginners, the trek to Triund offers stunning views.\nExperienced trekkers can explore 
the Hampta Pass trek or the Pin Parvati Pass trek, providing challenging terrains and 
breathtaking landscapes."); 
dict.put("what are the must-visit places in delhi?", 
"Delhi is rich in historical and cultural sites. Don't miss the iconic India Gate, Humayun's 
Tomb, Qutub Minar, Red Fort, and the Lotus Temple. Explore the vibrant Chandni Chowk for 
a taste of Old Delhi.\n"); 
dict.put("recommend some good hotels in delhi?", 
"Delhi offers a range of accommodations to suit various budgets. For a luxurious stay, consider 
hotels like The Leela Palace or The Oberoi. Mid-range options include Radisson Blu and The 
Park, while budget travelers may opt for Karol Bagh or Paharganj area hotels.\nThe Leela 
Palace: 
\nhttps://www.google.com/maps/place/The+Leela+Palace,+New+Delhi,+Delhi+110023/@28
.5799544,77.1866939,17z/data=!3m1!4b1!4m6!3m5!1s0x390d1d7eaec48b15:0x68b02119a4
2562ab!8m2!3d28.5799544!4d77.1892688!16s%2Fg%2F11bw3zb52j!5m1!1e4?entry=ttu\nk
arol bagh: 
\nhttps://www.google.com/maps/place/karol+bagh,+new+delhi,+delhi/@28.651798,77.18302
2,15z/data=!3m1!4b1!4m6!3m5!1s0x390d029c5f402ed3:0x942174294c9dd946!8m2!3d28.6
550458!4d77.1888201!16zL20vMDVxN3My!5m1!1e4?entry=ttu\n"); 
dict.put("what's the best time to visit delhi?", 
"The ideal time to visit Delhi is during the winter months, from October to March, when the 
weather is pleasant. Avoid the extreme heat of summer (April to June) and the monsoon season 
(July to September).\n"); 
dict.put("how can i travel around delhi?", 
"Delhi has an extensive public transportation system. You can use the Delhi Metro, buses, autorickshaws, and cycle rickshaws. Taxis and app-based ride services like Uber and Ola are also 
widely available.\n"); 
dict.put("where can i experience delhi's street food?", 
"Chandni Chowk is a food lover's paradise. Try paranthas at Paranthe Wali Gali, chaat at Natraj 
Dahi Bhalla, and kebabs at Karim's. Connaught Place and Khan Market also offer diverse 
dining options.\n"); 
dict.put("are there any museums in delhi worth visiting?", 
"Yes, Delhi has several museums. The National Museum, the National Gallery of Modern Art, 
and the Indira Gandhi Memorial Museum are notable ones. The Crafts Museum and the Air 
Force Museum are also interesting.\nThe National Museum: 
\nhttps://www.google.com/maps/place/National+Museum,+New+Delhi/@28.6119078,77.21
6716,17z/data=!3m1!4b1!4m6!3m5!1s0x390cfd52c71ff0eb:0x20429f292fa5eecf!8m2!3d28.
6119078!4d77.2192909!16zL20vMGMzenJq?entry=ttu\n"); 
dict.put("what are the must visit places in kerala?", 
"Kerala is the land of unending palm groves, pristine sandy beaches, sprawling tea plantations, 
rolling green hills, calming backwaters, mouth-watering cuisine and much 
more\nMunnar,Thekkady,Kovalam,Bekal,Kozhikode,Kozhikode,Vagamon,Athirapally,Koch
i"); 
dict.put("what are the hidden gems in kerala?", 
"Meesapulimala,Vattavada Village,Calvary Mount,Nelliampathi,Gavi Village,Kappil 
Beach"); 
dict.put("best hotels in kerala?", 
"1.ThePostcardMandalayHall, 
Kochi\nhttps://www.google.com/maps/dir//VI%2F193,+Synagogue+Ln,+Jew+Town,+Kappa
landimukku,+Mattancherry,+Kochi,+Kerala+682002/@9.9570903,76.1771975,12z/data=!4m
8!4m7!1m0!1m5!1m1!1s0x3b086d5b4b487b11:0x5cc057ffe9d93e47!2m2!1d76.2595883!2d
9.9570966?entry=ttu\n\n" + 
"2.Chandys Drizzle Drops - Munnar Top 
Station\nhttps://www.google.com/maps/dir//View+Point+Path,+Top+Station,+Bodi+Hill+No
rth,+Tamil+Nadu+625582/@10.1203323,77.1645328,12z/data=!4m8!4m7!1m0!1m5!1m1!1s
0x3b0777ac5bc92ffb:0x96cd0aee3cf4b0f1!2m2!1d77.2469843!2d10.1203298?hl=enGB&entry=ttu\n\n" + 
"3.Brunton Boatyard - CGH 
Earth\nhttps://www.google.com/maps/dir//1%2F498,+Calvetty+Road,+Fort+Kochi,+Kochi,+
Kerala+682001/@9.9684807,76.1631668,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x
3b086d3faaaaaaab:0xafa0312f10bfbe67!2m2!1d76.2455687!2d9.9684908?hl=enGB&entry=ttu\n"); 
dict.put("which is the best time to visit kerala?", 
"Winter season between September to March is the best time to visit Kerala. This is the time 
when Kerala has a comfortable climate and pleasant weather with less humidity.\n"); 
dict.put("Is kerala is safe for women to travel?", 
"Petty crimes:Low. Kerala, known as 'God's own country', is generally a safe place for female 
solo travelers. The crime rate against tourists, particularly the petty crimes such as 
pickpocketing and purse snatching is relatively low as compared to other popular tourist 
destinations.\n"); 
dict.put("Which is the safest city for women in Kerala?", 
"KOCHI: Kochi is one of the most important cities in Kerala and had a crime rate of 45.8\nin 
2019. In total, only 492 crimes against women were recorded.\n"); 
dict.put("any day trips from kerala?", 
"Travelers short on time in Kerala will enjoy visiting Munnar on this handy day tour from 
Kochi. Escape to the cooler climate of the hills, where you can visit waterfalls, spice and tea 
plantations, viewpoints, old churches, and more. This is an easy way to explore Kerala’s 
mountainous interior without having to do all the planning yourself.\n"); 
dict.put("must try street food in kerala?", 
"1.Banana chips is the most famous snack from Kerela.\n" + 
"2. Appam and Stew\n" + 
"3. Malabari Biryani\n" + 
"4. Karimeen Polichatu - Seafood Lovers' Delight\n" + 
"5. Puttu and kadala curry"); 
dict.put("kerala traditions and cultures?", 
"The culture and heritage of Kerala is one that everyone must experience. The culture of 
Kerala is a combination of both Indian and Dravidian culture.\n" + 
"The main USP of Kerala is its performing arts like Kathakali, Mohiniyattam and Martial Art 
of Kalaripayattu. As for the heritage of Kerala, it can be said that this heritage holds a special 
and important place in the Indian history. Providing a national integrity is the Kerala 
Heritage.\n" + 
"The visitors can enjoy the following art performances in Kerala.\n\n" + 
"Kathakali – A 300 year old dance that combines opera, ballet, masque and pantomime.\n" + 
"Mohiniyattam – The dance of a beautiful enchantress\n" + 
"Kalaripayattu – a martial art form that involves synchronizing the mind and body\n"); 

// Add all the questions in the similar way


dict.put("can you provide the website of tamil nadu tourism?", 
"https://www.tamilnadutourism.com/index.php"); 
} 
public static void getquestions() 
{ 
System.out.println(dict.keySet()); 
System.out.println("YOU CAN ENTER THE QUESTIONS IN ANY CASE AND ALSO NO 
NEED TO WORRY ABOUT THE SPACE AS WELL.\nHAPPY SEARCHING!"); 
} 
public static List<String> relatedquestions(String userinput) {
  List<String> relatedsuggestions = new ArrayList<String>(); 
List<String> usertokens = userinputtokenizer(userinput); 
//System.out.println(usertokens); 
boolean flag = false; 
int threshholdvalue = 2; 
Map<String, List<String>> relatedquestionstokens = relatedquestionstokens(dict); 
for (String question : relatedquestionstokens.keySet()) { 
List<String> questiontokens = relatedquestionstokens.get(question); 
flag = comparetokens(usertokens, questiontokens); 
if (flag == true) { 
relatedsuggestions.add(question); 
} 
} 
while (relatedsuggestions.size() >= 10 && usertokens.size()>=threshholdvalue) { 
// System.out.println(usertokens.size()); 
List<String> relatedsuggestionsnew = new ArrayList<String>(); 
//noSystem.out.println(relatedsuggestionsnew.size()); 
//List<String> newusertokens = userinputtokenizer(userinput); 
// Map<String, List<String>> newrelatedquestionstokens = relatedquestionstokens(dict); 
//threshholdvalue+=1; 
for (String question : relatedquestionstokens.keySet()) { 
List<String> questiontokens = relatedquestionstokens.get(question); 
flag = comparetokens(usertokens, questiontokens,threshholdvalue); 
//System.out.println(flag); 
if (flag == true) { 
relatedsuggestionsnew.add(question); 
} 
} 
// System.out.println(relatedsuggestionsnew.size()); 
relatedsuggestions.clear(); 
// System.out.println(relatedsuggestionsnew); 
relatedsuggestions=relatedsuggestionsnew; 
threshholdvalue=threshholdvalue+1; 
//System.out.println(relatedsuggestions.size()); 
} 
// if (relatedsuggestionsnew.size()>0) { 
// return relatedsuggestionsnew; 
return relatedsuggestions; 
} 
// } 
public static List<String> userinputtokenizer(String userinput) 
{ 
List<String> usertokens=new ArrayList<String>(); 
StringTokenizer tokenizer=new StringTokenizer(userinput); 
while(tokenizer.hasMoreTokens()) 
{ 
usertokens.add(tokenizer.nextToken()); 
} 
return usertokens; 
} 
public static Map<String,List<String>>relatedquestionstokens(Map<String,String> dict) 
{ 
Map<String,List<String>> relatedquestionstokens=new HashMap<String,List<String>>(); 
//String question=""; 
//String tokens=""; 
for (String question:dict.keySet()){ 
List<String> questiontokens=new ArrayList<String>(); 
StringTokenizer tokenizer=new StringTokenizer(question); 
while(tokenizer.hasMoreTokens()) 
{ 
questiontokens.add(tokenizer.nextToken()); 
} 
relatedquestionstokens.put(question,questiontokens); 
} 
return relatedquestionstokens; 
} 
public static boolean comparetokens(List<String> usertokens, List<String> questiontokens) { 
// wordsmatch=0; 
int matchcount=0; 
for (String usertoken : usertokens) { 
String usertokentrimmed = usertoken.trim(); 
for (String questiontoken : questiontokens) { 
String questiontokentrimmed = questiontoken.trim(); 
if (usertokentrimmed.equalsIgnoreCase(questiontokentrimmed)) { 
matchcount++; // At least one token matches 
} 
} 
} 
if(matchcount>=1) 
return true; 
return false; // No matching tokens found 
} 
public static boolean comparetokens(List<String> usertokens, List<String> questiontokens,int 
thresholdvalue) { 
int matchcount=0; 
// thresholdvalue++; 
for (String usertoken : usertokens) { 
String usertokentrimmed = usertoken.trim(); 
for (String questiontoken : questiontokens) { 
String questiontokentrimmed = questiontoken.trim(); 
if (usertokentrimmed.equalsIgnoreCase(questiontokentrimmed)) { 
//return true; // At least one token matches 
matchcount+=1; 
} 
}
} 
if(matchcount>=thresholdvalue) { 
return true; 
} 
return false; // No matching tokens found 
} 
} 
