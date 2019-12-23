public class Main {

    public static void main(String[] args) {
	String text = "The Mandalorian defeats a pursuing bounty hunter in a dogfight. He lands his damaged ship at a nearby repair dock, run by Peli Motto in Mos Eisley on Tatooine. He seeks work in a cantina to pay for the repairs, meeting aspiring bounty hunter Toro Calican, who is tracking elite mercenary and assassin Fennec Shand. Calican needs to catch Shand to join the guild, and the Mandalorian agrees to help when Calican offers to let him keep the money. They capture Shand in the desert, but she destroys one of their speeder bikes, so the Mandalorian goes to get a dewback they passed for transportation. While Calican watches Shand, she tells him that the Mandalorian betrayed the guild, making the bounty on him and the Child worth more than hers. Shand offers to help Calican capture the Mandalorian if he sets her free, but he shoots her instead. Calican rides the remaining speeder bike to the repair dock, taking Motto and the Child hostage. The Mandalorian arrives, uses a flare to disorient Calican, and kills him. He takes Calican's money to pay Motto for the repairs, thanking her before leaving Tatooine. Out in the desert, a mysterious figure approaches Shand's body.\n";
        String[] words = text.split("\\s");

	for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
    }
    }
}
